package com.github.comrada.tron4j.client;


/**
 * A {@code TronClient} object is the entry point for calling the functions.
 *
 *<p>A {@code TronClient} object is bind with a private key and a full node.
 * {@link #broadcastTransaction}, {@link #signTransaction} and other transaction related
 * operations can be done via a {@code TronClient} object.</p>
 *
 * @since jdk13.0.2+8
 * @see com.github.comrada.tron4j.client.contract.Contract
 * @see com.github.comrada.tron4j.proto.Chain.Transaction
 * @see com.github.comrada.tron4j.proto.Contract
 */


import com.google.protobuf.InvalidProtocolBufferException;
import com.github.comrada.tron4j.abi.FunctionEncoder;
import com.github.comrada.tron4j.abi.datatypes.Function;
import com.github.comrada.tron4j.api.GrpcAPI.BytesMessage;

import com.github.comrada.tron4j.api.WalletGrpc;
import com.github.comrada.tron4j.api.WalletSolidityGrpc;
import com.github.comrada.tron4j.client.contract.Contract;
import com.github.comrada.tron4j.client.contract.ContractFunction;
import com.github.comrada.tron4j.client.exceptions.IllegalException;
import com.github.comrada.tron4j.client.transaction.TransactionBuilder;
import com.github.comrada.tron4j.crypto.SECP256K1;
import com.github.comrada.tron4j.proto.Chain.Transaction;

import com.github.comrada.tron4j.proto.Chain.Block;

import com.github.comrada.tron4j.proto.Common.SmartContract;

import com.github.comrada.tron4j.proto.Contract.TransferAssetContract;
import com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract;
import com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract;
import com.github.comrada.tron4j.proto.Contract.TransferContract;
import com.github.comrada.tron4j.proto.Contract.VoteWitnessContract;
import com.github.comrada.tron4j.proto.Contract.TriggerSmartContract;
import com.github.comrada.tron4j.proto.Contract.AccountUpdateContract;
import com.github.comrada.tron4j.proto.Contract.AccountCreateContract;
import com.github.comrada.tron4j.proto.Contract.AssetIssueContract;
import com.github.comrada.tron4j.proto.Contract.SetAccountIdContract;
import com.github.comrada.tron4j.proto.Contract.UpdateAssetContract;
import com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract;
import com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract;
import com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract;
import com.github.comrada.tron4j.proto.Response.TransactionExtention;
import com.github.comrada.tron4j.proto.Response.TransactionReturn;
import com.github.comrada.tron4j.proto.Response.NodeInfo;
import com.github.comrada.tron4j.proto.Response.WitnessList;
import com.github.comrada.tron4j.proto.Response.BlockExtention;
import com.github.comrada.tron4j.proto.Response.BlockListExtention;
import com.github.comrada.tron4j.proto.Response.Proposal;
import com.github.comrada.tron4j.proto.Response.Exchange;
import com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage;
import com.github.comrada.tron4j.proto.Response.DelegatedResourceList;
import com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex;
import com.github.comrada.tron4j.api.GrpcAPI.NumberMessage;
import com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage;
import com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage;
import com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage;
import com.github.comrada.tron4j.api.GrpcAPI.BlockLimit;
import com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage;
import com.github.comrada.tron4j.utils.Base58Check;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.nio.ByteBuffer;
import java.util.*;

import com.github.comrada.tron4j.crypto.tuweniTypes.Bytes32;
import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.jcajce.provider.digest.SHA256;
import org.bouncycastle.util.encoders.Hex;
import com.github.comrada.tron4j.proto.Response.NodeList;
import com.github.comrada.tron4j.proto.Response.TransactionInfoList;
import com.github.comrada.tron4j.proto.Response.TransactionInfo;
import com.github.comrada.tron4j.proto.Response.Account;
import com.github.comrada.tron4j.proto.Response.AccountResourceMessage;
import com.github.comrada.tron4j.proto.Response.AccountNetMessage;
import com.github.comrada.tron4j.proto.Response.ChainParameters;
import com.github.comrada.tron4j.proto.Response.AssetIssueList;
import com.github.comrada.tron4j.proto.Response.ProposalList;
import com.github.comrada.tron4j.proto.Response.ExchangeList;
import com.github.comrada.tron4j.proto.Response.TransactionSignWeight;
import com.github.comrada.tron4j.proto.Response.TransactionApprovedList;

import static com.github.comrada.tron4j.proto.Response.TransactionReturn.response_code.SUCCESS;

public class TronClient {
    public final WalletGrpc.WalletBlockingStub blockingStub;
    public final WalletSolidityGrpc.WalletSolidityBlockingStub blockingStubSolidity;
    public final SECP256K1.KeyPair keyPair;
    public final ManagedChannel channel;
    public final ManagedChannel channelSolidity;

    public TronClient(String grpcEndpoint, String grpcEndpointSolidity, String hexPrivateKey) {
        channel = ManagedChannelBuilder.forTarget(grpcEndpoint).usePlaintext().build();
        channelSolidity = ManagedChannelBuilder.forTarget(grpcEndpointSolidity).usePlaintext().build();
        blockingStub = WalletGrpc.newBlockingStub(channel);
        blockingStubSolidity = WalletSolidityGrpc.newBlockingStub(channelSolidity);
        keyPair = SECP256K1.KeyPair.create(SECP256K1.PrivateKey.create(Bytes32.fromHexString(hexPrivateKey)));
    }

    public void close() {
        channel.shutdown();
        channelSolidity.shutdown();
    }

    /*public TronClient(Channel channel, String hexPrivateKey) {
        blockingStub = WalletGrpc.newBlockingStub(channel);
        blockingStubSolidity = WalletSolidityGrpc.newBlockingStub(channel);
        keyPair = SECP256K1.KeyPair.create(SECP256K1.PrivateKey.create(Bytes32.fromHexString(hexPrivateKey)));
    }*/

    /**
     * The constuctor for main net.
     * @param hexPrivateKey the binding private key. Operations require private key will all use this unless the private key is specified elsewhere.
     * @return a TronClient object
     */
    public static TronClient ofMainnet(String hexPrivateKey) {
        return new TronClient("grpc.trongrid.io:50051", "grpc.trongrid.io:50052",hexPrivateKey);
    }

    /**
     * The constuctor for Shasta test net.
     * @param hexPrivateKey the binding private key. Operations require private key will all use this unless the private key is specified elsewhere.
     * @return a TronClient object
     */
    public static TronClient ofShasta(String hexPrivateKey) {
        return new TronClient("grpc.shasta.trongrid.io:50051", "grpc.shasta.trongrid.io:50052", hexPrivateKey);
    }

    /**
     * The constuctor for Nile test net.
     * @param hexPrivateKey the binding private key. Operations require private key will all use this unless the private key is specified elsewhere.
     * @return a TronClient object
     */
    public static TronClient ofNile(String hexPrivateKey) {
        return new TronClient("47.252.19.181:50051", "47.252.19.181:50061", hexPrivateKey);
    }

    /**
     * Generate random address
     * @return Address in hex
     */
    public static String generateAddress() {
        // generate random address
        SECP256K1.KeyPair kp = SECP256K1.KeyPair.generate();

        SECP256K1.PublicKey pubKey = kp.getPublicKey();
        Keccak.Digest256 digest = new Keccak.Digest256();
        digest.update(pubKey.getEncoded(), 0, 64);
        byte[] raw = digest.digest();
        byte[] rawAddr = new byte[21];
        rawAddr[0] = 0x41;
        System.arraycopy(raw, 12, rawAddr, 1, 20);

        return Hex.toHexString(kp.getPrivateKey().getEncoded());
    }

    /**
     * The function receives addresses in any formats.
     * @param address account or contract address in any allowed formats.
     * @return hex address
     */
    public static ByteString parseAddress(String address) {
        byte[] raw;
        if (address.startsWith("T")) {
            raw = Base58Check.base58ToBytes(address);
        } else if (address.startsWith("41")) {
            raw = Hex.decode(address);
        } else if (address.startsWith("0x")) {
            raw = Hex.decode(address.substring(2));
        } else {
            try {
                raw = Hex.decode(address);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid address: " + address);
            }
        }
        return ByteString.copyFrom(raw);
    }


    public static ByteString parseHex(String hexString) {
        byte[] raw = Hex.decode(hexString);
        return ByteString.copyFrom(raw);
    }

    public static String toHex(byte[] raw) {
        return Hex.toHexString(raw);
    }

    public static String toHex(ByteString raw) {
        return Hex.toHexString(raw.toByteArray());
    }

    public Transaction signTransaction(TransactionExtention txnExt, SECP256K1.KeyPair kp) {
        SECP256K1.Signature sig = SECP256K1.sign(Bytes32.wrap(txnExt.getTxid().toByteArray()), kp);
        Transaction signedTxn =
                txnExt.getTransaction().toBuilder().addSignature(ByteString.copyFrom(sig.encodedBytes().toArray())).build();
        return signedTxn;
    }

    public Transaction signTransaction(Transaction txn, SECP256K1.KeyPair kp) {
        SHA256.Digest digest = new SHA256.Digest();
        digest.update(txn.getRawData().toByteArray());
        byte[] txid = digest.digest();
        SECP256K1.Signature sig = SECP256K1.sign(Bytes32.wrap(txid), kp);
        Transaction signedTxn = txn.toBuilder().addSignature(ByteString.copyFrom(sig.encodedBytes().toArray())).build();
        return signedTxn;
    }

    /**
     * Resolve the result code from TransactionReturn objects.
     * @param code the result code.
     * @return the corresponding message.
     */
    private String resolveResultCode(int code) {
        String responseCode = "";
        switch (code) {
            case 0:
                responseCode = "SUCCESS";
            case 1:
                responseCode = "SIGERROR";
            case 2:
                responseCode = "CONTRACT_VALIDATE_ERROR";
            case 3:
                responseCode = "CONTRACT_EXE_ERROR";
            case 4:
                responseCode = "BANDWITH_ERROR";
            case 5:
                responseCode = "DUP_TRANSACTION_ERROR";
            case 6:
                responseCode = "TAPOS_ERROR";
            case 7:
                responseCode = "TOO_BIG_TRANSACTION_ERROR";
            case 8:
                responseCode = "TRANSACTION_EXPIRATION_ERROR";
            case 9:
                responseCode = "SERVER_BUSY";
            case 10:
                responseCode = "NO_CONNECTION";
            case 11:
                responseCode = "NOT_ENOUGH_EFFECTIVE_CONNECTION";
            case 20:
                responseCode = "OTHER_ERROR";
        }
        return responseCode;
    }

    /**
     * broadcast a transaction with the binding account.
     * @param Transaction a signed transaction ready to be broadcasted
     * @return a TransactionReturn object contains the broadcasting result
     * @throws RuntimeException if broadcastin fails
     */
    public TransactionReturn broadcastTransaction(Transaction txn) throws RuntimeException{
        TransactionReturn ret = blockingStub.broadcastTransaction(txn);
        if (!ret.getResult()) {
            String message = resolveResultCode(ret.getCodeValue()) + ", " + ret.getMessage();
            throw new RuntimeException(message);
        } else {
            return ret;
        }
    }

    public Transaction signTransaction(TransactionExtention txnExt) {
        return signTransaction(txnExt, keyPair);
    }

    public Transaction signTransaction(Transaction txn) {
        return signTransaction(txn, keyPair);
    }

    /**
     * Transfer TRX. amount in SUN
     * @param fromAddress owner address
     * @param toAddress receive balance
     * @param amount transfer amount
     * @return TransactionExtention
     * @throws IllegalException if fail to transfer
     */
    public TransactionExtention transfer(String fromAddress, String toAddress, long amount) throws IllegalException {

        ByteString rawFrom = parseAddress(fromAddress);
        ByteString rawTo = parseAddress(toAddress);

        TransferContract req = TransferContract.newBuilder()
                .setOwnerAddress(rawFrom)
                .setToAddress(rawTo)
                .setAmount(amount)
                .build();
        TransactionExtention txnExt = blockingStub.createTransaction2(req);

        if(SUCCESS != txnExt.getResult().getCode()){
            throw new IllegalException(txnExt.getResult().getMessage().toStringUtf8());
        }

        return txnExt;
    }

    /**
     * Transfers TRC10 Asset
     * @param fromAddress owner address
     * @param toAddress receive balance
     * @param tokenId asset name
     * @param amount transfer amount
     * @return TransactionExtention
     * @throws IllegalException if fail to transfer trc10
     */
    public TransactionExtention transferTrc10(String fromAddress, String toAddress, int tokenId, long amount) throws IllegalException {

        ByteString rawFrom = parseAddress(fromAddress);
        ByteString rawTo = parseAddress(toAddress);
        byte[] rawTokenId = Integer.toString(tokenId).getBytes();

        TransferAssetContract req = TransferAssetContract.newBuilder()
                .setOwnerAddress(rawFrom)
                .setToAddress(rawTo)
                .setAssetName(ByteString.copyFrom(rawTokenId))
                .setAmount(amount)
                .build();

        TransactionExtention txnExt = blockingStub.transferAsset2(req);

        if(SUCCESS != txnExt.getResult().getCode()){
            throw new IllegalException(txnExt.getResult().getMessage().toStringUtf8());
        }

        return txnExt;
    }

    /**
     * Freeze balance to get energy or bandwidth, for 3 days
     * @param ownerAddress owner address
     * @param frozenBalance frozen balance
     * @param frozenDuration frozen duration
     * @param resourceCode Resource type, can be 0("BANDWIDTH") or 1("ENERGY")
     * @return TransactionExtention
     * @throws IllegalException if fail to freeze balance
     */
    public TransactionExtention freezeBalance(String ownerAddress, long frozenBalance, long frozenDuration, int resourceCode) throws IllegalException {

        return freezeBalance(ownerAddress,frozenBalance,frozenDuration,resourceCode,"");
    }

    /**
     * Freeze balance to get energy or bandwidth, for 3 days
     * @param ownerAddress owner address
     * @param frozenBalance frozen balance
     * @param frozenDuration frozen duration
     * @param resourceCode Resource type, can be 0("BANDWIDTH") or 1("ENERGY")
     * @param receiveAddress the address that will receive the resource, default hexString
     * @return TransactionExtention
     * @throws IllegalException if fail to freeze balance
     */
    public TransactionExtention freezeBalance(String ownerAddress, long frozenBalance, long frozenDuration, int resourceCode, String receiveAddress) throws IllegalException {
        ByteString rawFrom = parseAddress(ownerAddress);
        ByteString rawReceiveFrom = parseAddress(receiveAddress);
        FreezeBalanceContract freezeBalanceContract=
                FreezeBalanceContract.newBuilder()
                        .setOwnerAddress(rawFrom)
                        .setFrozenBalance(frozenBalance)
                        .setFrozenDuration(frozenDuration)
                        .setResourceValue(resourceCode)
                        .setReceiverAddress(rawReceiveFrom)
                        .build();
        TransactionExtention txnExt = blockingStub.freezeBalance2(freezeBalanceContract);

        if(SUCCESS != txnExt.getResult().getCode()){
            throw new IllegalException(txnExt.getResult().getMessage().toStringUtf8());
        }

        return txnExt;
    }

    /**
     * Unfreeze balance to get TRX back
     * @param ownerAddress owner address
     * @param resourceCode Resource type, can be 0("BANDWIDTH") or 1("ENERGY")
     * @return TransactionExtention
     * @throws IllegalException if fail to unfreeze balance
     */
    public TransactionExtention unfreezeBalance(String ownerAddress, int resourceCode) throws IllegalException {

        return unfreezeBalance(ownerAddress,resourceCode,"");
    }

    /**
     * Unfreeze balance to get TRX back
     * @param ownerAddress owner address
     * @param resourceCode Resource type, can be 0("BANDWIDTH") or 1("ENERGY")
     * @param receiveAddress the address that will lose the resource, default hexString
     * @return TransactionExtention
     * @throws IllegalException if fail to unfreeze balance
     */
    public TransactionExtention unfreezeBalance(String ownerAddress, int resourceCode, String receiveAddress) throws IllegalException {

        UnfreezeBalanceContract unfreeze =
                UnfreezeBalanceContract.newBuilder()
                        .setOwnerAddress(parseAddress(ownerAddress))
                        .setResourceValue(resourceCode)
                        .setReceiverAddress(parseAddress(receiveAddress))
                        .build();

        TransactionExtention txnExt = blockingStub.unfreezeBalance2(unfreeze);

        if(SUCCESS != txnExt.getResult().getCode()){
            throw new IllegalException(txnExt.getResult().getMessage().toStringUtf8());
        }

        return txnExt;
    }

    /**
     * Vote for witnesses
     * @param ownerAddress owner address
     * @param votes <vote address, vote count>
     * @return TransactionExtention
     * IllegalNumException if fail to vote witness
     */
    public TransactionExtention voteWitness(String ownerAddress, HashMap<String, String> votes) throws IllegalException {
        ByteString rawFrom = parseAddress(ownerAddress);
        VoteWitnessContract voteWitnessContract = createVoteWitnessContract(rawFrom, votes);
        TransactionExtention txnExt = blockingStub.voteWitnessAccount2(voteWitnessContract);

        if(SUCCESS != txnExt.getResult().getCode()){
            throw new IllegalException(txnExt.getResult().getMessage().toStringUtf8());
        }

        return txnExt;
    }

    /**
     * Create an account. Uses an already activated account to create a new account
     * @param ownerAddress owner address, an activated account
     * @param accountAddress the address of the new account
     * @return TransactionExtention
     * IllegalNumException if fail to create account
     */
    public TransactionExtention createAccount(String ownerAddress, String accountAddress) throws IllegalException {
        ByteString bsOwnerAddress = parseAddress(ownerAddress);
        ByteString bsAccountAddress = parseAddress(accountAddress);

        AccountCreateContract contract = createAccountCreateContract(bsOwnerAddress,
                bsAccountAddress);

        TransactionExtention transactionExtention= blockingStub.createAccount2(contract);

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }

        return transactionExtention;
    }

    /**
     * Modify account name
     * @param address owner address
     * @param accountName the name of the account
     * @return TransactionExtention
     * IllegalNumException if fail to update account name
     */
    //only if account.getAccountName() == null can update name
    public TransactionExtention updateAccount(String address, String accountName) throws IllegalException {
        ByteString bsAddress = parseAddress(address);
        byte[] bytesAccountName = accountName.getBytes();
        ByteString bsAccountName = ByteString.copyFrom(bytesAccountName);

        AccountUpdateContract contract = createAccountUpdateContract(bsAccountName,
                bsAddress);

        TransactionExtention transactionExtention= blockingStub.updateAccount2(contract);

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }

        return transactionExtention;
    }


    /**
     * Query the latest block information
     * @return Block
     * @throws IllegalException if fail to get now block
     */
    public Block getNowBlock() throws IllegalException {
        Block block = blockingStub.getNowBlock(EmptyMessage.newBuilder().build());
        if(!block.hasBlockHeader()){
            throw new IllegalException("Fail to get latest block.");
        }
        return block;
    }

    /**
     * Returns the Block Object corresponding to the 'Block Height' specified (number of blocks preceding it)
     * @param blockNum The block height
     * @return Block
     * @throws IllegalException if the parameters are not correct
     */
    public Block getBlockByNum(long blockNum) throws IllegalException {
        NumberMessage.Builder builder = NumberMessage.newBuilder();
        builder.setNum(blockNum);
        Block block = blockingStub.getBlockByNum(builder.build());

        if(!block.hasBlockHeader()){
            throw new IllegalException();
        }
        return block;
    }

    /**
     * Get some latest blocks
     * @param num Number of latest blocks
     * @return BlockListExtention
     * @throws IllegalException if the parameters are not correct
     */
    public BlockListExtention getBlockByLatestNum(long num) throws IllegalException {
        NumberMessage numberMessage = NumberMessage.newBuilder().setNum(num).build();
        BlockListExtention blockListExtention = blockingStub.getBlockByLatestNum2(numberMessage);

        if(blockListExtention.getBlockCount() == 0){
            throw new IllegalException("The number of latest blocks must be between 1 and 99, please check it.");
        }
        return blockListExtention;
    }

    /**
     * Returns the list of Block Objects included in the 'Block Height' range specified
     * @param startNum Number of start block height, including this block
     * @param endNum Number of end block height, excluding this block
     * @return BlockListExtention
     * @throws IllegalException if the parameters are not correct
     */
    public BlockListExtention getBlockByLimitNext(long startNum, long endNum) throws IllegalException {
        BlockLimit blockLimit = BlockLimit.newBuilder()
                .setStartNum(startNum)
                .setEndNum(endNum)
                .build();
        BlockListExtention blockListExtention = blockingStub.getBlockByLimitNext2(blockLimit);

        if(endNum - startNum > 100){
            throw new IllegalException("The difference between startNum and endNum cannot be greater than 100, please check it.");
        }
        if(blockListExtention.getBlockCount() == 0){
            throw new IllegalException();
        }
        return blockListExtention;
    }

    /**
     * Get current API node’ info
     * @return NodeInfo
     * @throws IllegalException if fail to get nodeInfo
     */
    public NodeInfo getNodeInfo() throws IllegalException {
        NodeInfo nodeInfo = blockingStub.getNodeInfo(EmptyMessage.newBuilder().build());

        if(nodeInfo.getBlock().isEmpty()){
            throw new IllegalException("Fail to get node info.");
        }
        return nodeInfo;
    }

    /**
     * List all nodes that current API node is connected to
     * @return NodeList
     * @throws IllegalException if fail to get node list
     */
    public NodeList listNodes() throws IllegalException {
        NodeList nodeList = blockingStub.listNodes(EmptyMessage.newBuilder().build());

        if(nodeList.getNodesCount() == 0){
            throw new IllegalException("Fail to get node list.");
        }
        return nodeList;
    }

    /**
     * Get transactionInfo from block number
     * @param blockNum The block height
     * @return TransactionInfoList
     * @throws IllegalException no transactions or the blockNum is incorrect
     */
    public TransactionInfoList getTransactionInfoByBlockNum(long blockNum) throws IllegalException {
        NumberMessage numberMessage = NumberMessage.newBuilder().setNum(blockNum).build();
        TransactionInfoList transactionInfoList = blockingStub.getTransactionInfoByBlockNum(numberMessage);
        if(transactionInfoList.getTransactionInfoCount() == 0){
            throw new IllegalException("no transactions or the blockNum is incorrect.");
        }

        return transactionInfoList;
    }

    /**
     * Query the transaction fee, block height by transaction id
     * @param txID Transaction hash, i.e. transaction id
     * @return TransactionInfo
     * @throws IllegalException if the parameters are not correct
     */
    public TransactionInfo getTransactionInfoById(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        TransactionInfo transactionInfo = blockingStub.getTransactionInfoById(request);

        if(transactionInfo.getBlockTimeStamp() == 0){
            throw new IllegalException();
        }
        return transactionInfo;
    }

    /**
     * Query transaction information by transaction id
     * @param txID Transaction hash, i.e. transaction id
     * @return Transaction
     * @throws IllegalException if the parameters are not correct
     */
    public Transaction getTransactionById(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Transaction transaction = blockingStub.getTransactionById(request);

        if(transaction.getRetCount() == 0){
            throw new IllegalException();
        }
        return transaction;
    }

    /**
     * Get account info by address
     * @param address address, default hexString
     * @return Account
     */
    public Account getAccount(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage accountAddressMessage = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        Account account = blockingStub.getAccount(accountAddressMessage);
        return account;
    }

    /**
     * Query the resource information of an account(bandwidth,energy,etc)
     * @param address address, default hexString
     * @return AccountResourceMessage
     */
    public AccountResourceMessage getAccountResource(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage account = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        return blockingStub.getAccountResource(account);
    }

    /**
     * Query bandwidth information
     * @param address address, default hexString
     * @return AccountResourceMessage
     */
    public AccountNetMessage getAccountNet(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage account = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        return blockingStub.getAccountNet(account);
    }

    public long getAccountBalance(String address) {
        Account account = getAccount(address);
        long balance = account.getBalance();
        return balance;
    }


    public Account getAccountById(String id) {
        ByteString bsId = ByteString.copyFrom(id.getBytes());
        AccountIdMessage accountId = AccountIdMessage.newBuilder()
                .setId(bsId)
                .build();
        return blockingStub.getAccountById(accountId);
    }

    public Transaction setAccountId(String id, String address) throws IllegalException {
        ByteString bsId = ByteString.copyFrom(id.getBytes());
        ByteString bsAddress = parseAddress(address);

        SetAccountIdContract contract = createSetAccountIdContract(bsId, bsAddress);

        Transaction transaction= blockingStub.setAccountId(contract);

        return transaction;
    }

    /**
     * All parameters that the blockchain committee can set
     * @return ChainParameters
     * @throws IllegalException if fail to get chain parameters
     */
    public ChainParameters getChainParameters() throws IllegalException {
        ChainParameters chainParameters = blockingStub.getChainParameters(EmptyMessage.newBuilder().build());

        if(chainParameters.getChainParameterCount() == 0){
            throw new IllegalException("Fail to get chain parameters.");
        }
        return chainParameters;
    }

    /**
     * Returns all resources delegations from an account to another account. The fromAddress can be retrieved from the GetDelegatedResourceAccountIndex API
     * @param fromAddress energy from address,, default hexString
     * @param toAddress energy delegation information, default hexString
     * @return DelegatedResourceList
     */
    public DelegatedResourceList getDelegatedResource(String fromAddress,
                                                      String toAddress) {

        ByteString fromAddressBS = parseAddress(fromAddress);
        ByteString toAddressBS = parseAddress(toAddress);

        DelegatedResourceMessage request = DelegatedResourceMessage.newBuilder()
                .setFromAddress(fromAddressBS)
                .setToAddress(toAddressBS)
                .build();
        DelegatedResourceList delegatedResource = blockingStub.getDelegatedResource(request);
        return delegatedResource;
    }

    /**
     * Query the energy delegation by an account. i.e. list all addresses that have delegated resources to an account
     * @param address address,, default hexString
     * @return DelegatedResourceAccountIndex
     */
    public DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(String address) {

        ByteString addressBS = parseAddress(address);

        BytesMessage bytesMessage = BytesMessage.newBuilder()
                .setValue(addressBS)
                .build();

        DelegatedResourceAccountIndex accountIndex = blockingStub.getDelegatedResourceAccountIndex(bytesMessage);

        return accountIndex;
    }

    /**
     * Query the list of all the TRC10 tokens
     * @return AssetIssueList
     */
    public AssetIssueList getAssetIssueList() {
        AssetIssueList assetIssueList = blockingStub.getAssetIssueList(EmptyMessage.newBuilder().build());

        return assetIssueList;
    }

    /**
     * Query the list of all the tokens by pagination.
     * @param offset the index of the start token
     * @param limit the amount of tokens per page
     * @return AssetIssueList, a list of Tokens that succeed the Token located at offset
     */
    public AssetIssueList getPaginatedAssetIssueList(long offset, long limit) {
        PaginatedMessage pageMessage = PaginatedMessage.newBuilder()
                .setOffset(offset)
                .setLimit(limit)
                .build();

        AssetIssueList assetIssueList = blockingStub.getPaginatedAssetIssueList(pageMessage);
        return assetIssueList;
    }

    /**
     * Query the TRC10 token information issued by an account
     * @param address the Token Issuer account address
     * @return AssetIssueList, a list of Tokens that succeed the Token located at offset
     */
    public AssetIssueList getAssetIssueByAccount(String address) {
        ByteString addressBS = parseAddress(address);
        AccountAddressMessage request = AccountAddressMessage.newBuilder()
                .setAddress(addressBS)
                .build();
        AssetIssueList assetIssueList = blockingStub.getAssetIssueByAccount(request);
        return assetIssueList;
    }

    /**
     * Query a token by token id
     * @param assetId the ID of the TRC10 token
     * @return AssetIssueContract, the token object, which contains the token name
     */
    public AssetIssueContract getAssetIssueById(String assetId) {
        ByteString assetIdBs = ByteString.copyFrom(assetId.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetIdBs)
                .build();

        AssetIssueContract assetIssueContract = blockingStub.getAssetIssueById(request);
        return assetIssueContract;
    }

    /**
     * Query a token by token name
     * @param name the name of the TRC10 token
     * @return AssetIssueContract, the token object, which contains the token name
     */
    public AssetIssueContract getAssetIssueByName(String name) {
        ByteString assetNameBs = ByteString.copyFrom(name.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetNameBs)
                .build();

        AssetIssueContract assetIssueContract = blockingStub.getAssetIssueByName(request);
        return assetIssueContract;
    }

    /**
     * Query the list of all the TRC10 tokens by token name
     * @param name the name of the TRC10 token
     * @return AssetIssueList
     */
    public AssetIssueList getAssetIssueListByName(String name) {
        ByteString assetNameBs = ByteString.copyFrom(name.getBytes());
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(assetNameBs)
                .build();

        AssetIssueList assetIssueList = blockingStub.getAssetIssueListByName(request);
        return assetIssueList;
    }

    /**
     * Participate a token
     * @param toAddress the issuer address of the token, default hexString
     * @param ownerAddress the participant address, default hexString
     * @param assertName token id, default hexString
     * @param amount participate token amount
     * @return TransactionExtention
     * @throws IllegalException if fail to participate AssetIssue
     */
    public TransactionExtention participateAssetIssue(String toAddress, String ownerAddress, String assertName, long amount) throws IllegalException {

        ByteString bsTo = parseAddress(toAddress);
        ByteString bsOwner = parseAddress(ownerAddress);
        ByteString bsName = ByteString.copyFrom(assertName.getBytes());

        ParticipateAssetIssueContract builder = ParticipateAssetIssueContract.newBuilder()
                .setToAddress(bsTo)
                .setAssetName(bsName)
                .setOwnerAddress(bsOwner)
                .setAmount(amount)
                .build();

        TransactionExtention transactionExtention = blockingStub.participateAssetIssue2(builder);
        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }
        return transactionExtention;
    }


    /**
     * List all proposals
     * @return ProposalList
     */
    public ProposalList listProposals() {
        ProposalList proposalList = blockingStub.listProposals(EmptyMessage.newBuilder().build());

        return proposalList;
    }

    /**
     * Query proposal based on ID
     * @param id proposal id
     * @return Proposal, proposal details
     * @throws IllegalException if fail to get proposal
     */
    //1-17
    public Proposal getProposalById(String id) throws IllegalException {
        ByteString bsTxid = ByteString.copyFrom(ByteBuffer.allocate(8).putLong(Long.parseLong(id)).array());

        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Proposal proposal = blockingStub.getProposalById(request);

        if(proposal.getApprovalsCount() == 0){
            throw new IllegalException();
        }
        return proposal;
    }

    /**
     * List all witnesses that current API node is connected to
     * @return WitnessList
     */
    public WitnessList listWitnesses() {
        WitnessList witnessList = blockingStub
                .listWitnesses(EmptyMessage.newBuilder().build());
        return witnessList;
    }

    /**
     * List all exchange pairs
     * @return ExchangeList
     */
    public ExchangeList listExchanges() {
        ExchangeList exchangeList = blockingStub
                .listExchanges(EmptyMessage.newBuilder().build());
        return exchangeList;
    }

    /**
     * Query exchange pair based on id
     * @param id transaction pair id
     * @return Exchange
     * @throws IllegalException if fail to get exchange pair
     */
    public Exchange getExchangeById(String id) throws IllegalException {
        ByteString bsTxid = ByteString.copyFrom(ByteBuffer.allocate(8).putLong(Long.parseLong(id)).array());

        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Exchange exchange = blockingStub.getExchangeById(request);

        if(exchange.getSerializedSize() == 0){
            throw new IllegalException();
        }
        return exchange;
    }

    /**
     * Issue a token
     * @param ownerAddress Owner address, default hexString
     * @param name Token name, default hexString
     * @param abbr Token name abbreviation, default hexString
     * @param totalSupply Token total supply
     * @param trxNum Define the price by the ratio of trx_num/num
     * @param icoNum Define the price by the ratio of trx_num/num
     * @param startTime ICO start time
     * @param endTime ICO end time
     * @param url Token official website url, default hexString
     * @param freeAssetNetLimit Token free asset net limit
     * @param publicFreeAssetNetLimit Token public free asset net limit
     * @param precision
     * @param frozenSupply HashMap<frozenDay, frozenAmount>
     * @param description Token description, default hexString
     * @return TransactionExtention
     * @throws IllegalException if fail to create AssetIssue
     */

    public TransactionExtention createAssetIssue(String ownerAddress, String name, String abbr,
                                                 long totalSupply, int trxNum, int icoNum, long startTime, long endTime,
                                                 String url, long freeAssetNetLimit,
                                                 long publicFreeAssetNetLimit, int precision, HashMap<String, String> frozenSupply, String description) throws IllegalException {

        AssetIssueContract.Builder builder = assetIssueContractBuilder(ownerAddress, name, abbr, totalSupply, trxNum, icoNum, startTime, endTime, url, freeAssetNetLimit,
                publicFreeAssetNetLimit, precision, description);

        for (String daysStr : frozenSupply.keySet()) {
            String amountStr = frozenSupply.get(daysStr);
            long amount = Long.parseLong(amountStr);
            long days = Long.parseLong(daysStr);
            AssetIssueContract.FrozenSupply.Builder frozenBuilder = AssetIssueContract.FrozenSupply
                    .newBuilder();
            frozenBuilder.setFrozenAmount(amount);
            frozenBuilder.setFrozenDays(days);
            builder.addFrozenSupply(frozenBuilder.build());
        }

        TransactionExtention transactionExtention = blockingStub.createAssetIssue2(builder.build());

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }
        return transactionExtention;
    }

    /**
     * Issue a token
     * @param ownerAddress Owner address, default hexString
     * @param name Token name, default hexString
     * @param abbr Token name abbreviation, default hexString
     * @param totalSupply Token total supply
     * @param trxNum Define the price by the ratio of trx_num/num
     * @param icoNum Define the price by the ratio of trx_num/num
     * @param startTime ICO start time
     * @param endTime ICO end time
     * @param url Token official website url, default hexString
     * @param freeAssetNetLimit Token free asset net limit
     * @param publicFreeAssetNetLimit Token public free asset net limit
     * @param precision
     * @param description Token description, default hexString
     * @return TransactionExtention
     * @throws IllegalException if fail to create AssetIssue
     */

    public TransactionExtention createAssetIssue(String ownerAddress, String name, String abbr,
                                                 long totalSupply, int trxNum, int icoNum, long startTime, long endTime,
                                                 String url, long freeAssetNetLimit,
                                                 long publicFreeAssetNetLimit, int precision, String description) throws IllegalException {

        AssetIssueContract.Builder builder = assetIssueContractBuilder(ownerAddress, name, abbr, totalSupply, trxNum, icoNum, startTime, endTime, url, freeAssetNetLimit,
                publicFreeAssetNetLimit, precision, description);

        TransactionExtention transactionExtention = blockingStub.createAssetIssue2(builder.build());

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }
        return transactionExtention;
    }

    public AssetIssueContract.Builder assetIssueContractBuilder(String ownerAddress, String name, String abbr,
                                                 long totalSupply, int trxNum, int icoNum, long startTime, long endTime,
                                                 String url, long freeAssetNetLimit,
                                                 long publicFreeAssetNetLimit, int precision, String description) {

        ByteString bsAddress = parseAddress(ownerAddress);

        AssetIssueContract.Builder builder = AssetIssueContract.newBuilder()
                .setOwnerAddress(bsAddress)
                .setName(ByteString.copyFrom(name.getBytes()))
                .setAbbr(ByteString.copyFrom(abbr.getBytes()))
                .setTotalSupply(totalSupply)
                .setTrxNum(trxNum)
                .setNum(icoNum)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setUrl(ByteString.copyFrom(url.getBytes()))
                .setFreeAssetNetLimit(freeAssetNetLimit)
                .setPublicFreeAssetNetLimit(publicFreeAssetNetLimit)
                .setPrecision(precision)
                .setDescription(ByteString.copyFrom(description.getBytes()));
        return builder;
    }

        /**
         * Update basic TRC10 token information
         * @param ownerAddress Owner address, default hexString
         * @param description The description of token, default hexString
         * @param url The token's website url, default hexString
         * @param newLimit Each token holder's free bandwidth
         * @param newPublicLimit The total free bandwidth of the token
         * @return TransactionExtention
         * @throws IllegalException if fail to update asset
         */
    public TransactionExtention updateAsset(String ownerAddress, String description, String url, int newLimit, int newPublicLimit) throws IllegalException {
        ByteString bsOwnerAddress = parseAddress(ownerAddress);
        ByteString bsDescription = ByteString.copyFrom(description.getBytes());
        ByteString bsUrl = ByteString.copyFrom(url.getBytes());

        UpdateAssetContract contract = createUpdateAssetContract(bsOwnerAddress,
                bsDescription,bsUrl,newLimit,newPublicLimit);

        TransactionExtention transactionExtention= blockingStub.updateAsset2(contract);

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }

        return transactionExtention;
    }

    /**
     * Unfreeze a token that has passed the minimum freeze duration
     * @param ownerAddress Owner address, default hexString
     * @return TransactionExtention
     * @throws IllegalException if fail to unfreeze asset
     */
    public TransactionExtention unfreezeAsset(String ownerAddress) throws IllegalException {
        ByteString bsOwnerAddress = parseAddress(ownerAddress);

        UnfreezeAssetContract contract = createUnfreezeAssetContract(bsOwnerAddress);

        TransactionExtention transactionExtention= blockingStub.unfreezeAsset2(contract);

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }

        return transactionExtention;
    }

    /**
     * Unfreeze a token that has passed the minimum freeze duration
     * @param contract AccountPermissionUpdateContract
     * @return TransactionExtention
     * @throws IllegalException if fail to update account permission
     */
    public TransactionExtention accountPermissionUpdate(AccountPermissionUpdateContract contract) throws IllegalException {

        TransactionExtention transactionExtention = blockingStub.accountPermissionUpdate(contract);

        if(SUCCESS != transactionExtention.getResult().getCode()){
            throw new IllegalException(transactionExtention.getResult().getMessage().toStringUtf8());
        }
        return transactionExtention;
    }

    /**
     * Query transaction sign weight
     * @param trx transaction object
     * @return TransactionSignWeight
     */
    public TransactionSignWeight getTransactionSignWeight(Transaction trx) {

        TransactionSignWeight transactionSignWeight = blockingStub.getTransactionSignWeight(trx);

        return transactionSignWeight;
    }

    /**
     * Query transaction approvedList
     * @param trx transaction object
     * @return TransactionApprovedList
     */
    public TransactionApprovedList getTransactionApprovedList(Transaction trx) throws InvalidProtocolBufferException {

        TransactionApprovedList transactionApprovedList = blockingStub.getTransactionApprovedList(trx);

        return transactionApprovedList;
    }

    //All other solidified APIs start

    /**
     * Get solid account info by address
     * @param address address, default hexString
     * @return Account
     */
    public Account getAccountSolidity(String address) {
        ByteString bsAddress = parseAddress(address);
        AccountAddressMessage accountAddressMessage = AccountAddressMessage.newBuilder()
                .setAddress(bsAddress)
                .build();
        Account account = blockingStubSolidity.getAccount(accountAddressMessage);
        return account;
    }

    /**
     * Query the latest solid block information
     * @return BlockExtention
     * @throws IllegalException if fail to get now block
     */
    public BlockExtention getNowBlockSolidity() throws IllegalException {
        BlockExtention blockExtention = blockingStubSolidity.getNowBlock2(EmptyMessage.newBuilder().build());

        if(!blockExtention.hasBlockHeader()){
            throw new IllegalException("Fail to get latest block.");
        }
        return blockExtention;
    }

    /**
     * Get transaction receipt info from a transaction id, must be in solid block
     * @param txID Transaction hash, i.e. transaction id
     * @return Transaction
     * @throws IllegalException if the parameters are not correct
     */
    public Transaction getTransactionByIdSolidity(String txID) throws IllegalException {
        ByteString bsTxid = parseAddress(txID);
        BytesMessage request = BytesMessage.newBuilder()
                .setValue(bsTxid)
                .build();
        Transaction transaction = blockingStubSolidity.getTransactionById(request);

        if(transaction.getRetCount() == 0) {
            throw new IllegalException();
        }
        return transaction;
    }

    /**
     * Get the rewards that the voter has not received
     * @param address address, default hexString
     * @return NumberMessage
     */
    public NumberMessage getRewardSolidity(String address) throws IllegalException {
        ByteString bsAddress = parseAddress(address);
        BytesMessage bytesMessage = BytesMessage.newBuilder()
                .setValue(bsAddress)
                .build();
        NumberMessage numberMessage = blockingStubSolidity.getRewardInfo(bytesMessage);
        return numberMessage;
    }
    //All other solidified APIs end

    public static VoteWitnessContract createVoteWitnessContract(ByteString ownerAddress,
                                                                HashMap<String, String> votes) {
        VoteWitnessContract.Builder builder = VoteWitnessContract.newBuilder();
        builder.setOwnerAddress(ownerAddress);
        for (String addressBase58 : votes.keySet()) {
            String voteCount = votes.get(addressBase58);
            long count = Long.parseLong(voteCount);
            VoteWitnessContract.Vote.Builder voteBuilder = VoteWitnessContract.Vote.newBuilder();
            ByteString voteAddress = parseAddress(addressBase58);
            if (voteAddress == null) {
                continue;
            }
            voteBuilder.setVoteAddress(voteAddress);
            voteBuilder.setVoteCount(count);
            builder.addVotes(voteBuilder.build());
        }
        return builder.build();
    }

    public static AccountUpdateContract createAccountUpdateContract(ByteString accountName,
                                                                    ByteString address) {
        AccountUpdateContract.Builder builder = AccountUpdateContract.newBuilder();


        builder.setAccountName(accountName);
        builder.setOwnerAddress(address);

        return builder.build();
    }

    public static AccountCreateContract createAccountCreateContract(
            ByteString owner, ByteString address) {
        AccountCreateContract.Builder builder = AccountCreateContract.newBuilder();
        builder.setOwnerAddress(owner);
        builder.setAccountAddress(address);

        return builder.build();
    }

    public static SetAccountIdContract createSetAccountIdContract(
            ByteString accountId, ByteString address) {
        SetAccountIdContract.Builder builder = SetAccountIdContract.newBuilder();
        builder.setAccountId(accountId);
        builder.setOwnerAddress(address);

        return builder.build();
    }


    public static UpdateAssetContract createUpdateAssetContract(
            ByteString address, ByteString description, ByteString url, long newLimit, long newPublicLimit) {
        UpdateAssetContract.Builder builder = UpdateAssetContract.newBuilder();
        builder.setDescription(description);
        builder.setUrl(url);
        builder.setNewLimit(newLimit);
        builder.setNewPublicLimit(newPublicLimit);
        builder.setOwnerAddress(address);

        return builder.build();
    }

    public static UnfreezeAssetContract createUnfreezeAssetContract(ByteString address) {

        UnfreezeAssetContract.Builder builder = UnfreezeAssetContract.newBuilder();
        builder.setOwnerAddress(address);
        return builder.build();
    }

    /*public void transferTrc20(String from, String to, String cntr, long feeLimit, long amount, int precision) {
        System.out.println("============ TRC20 transfer =============");

        // transfer(address _to,uint256 _amount) returns (bool)
        // _to = TVjsyZ7fYF3qLF6BQgPmTEZy1xrNNyVAAA
        // _amount = 10 * 10^18
        Function trc20Transfer = new Function("transfer",
            Arrays.asList(new Address(to),
                new Uint256(BigInteger.valueOf(amount).multiply(BigInteger.valueOf(10).pow(precision)))),
            Arrays.asList(new TypeReference<Bool>() {}));

        String encodedHex = FunctionEncoder.encode(trc20Transfer);
        TriggerSmartContract trigger =
            TriggerSmartContract.newBuilder()
                .setOwnerAddress(TronClient.parseAddress(from))
                .setContractAddress(TronClient.parseAddress(cntr)) // JST
                .setData(TronClient.parseHex(encodedHex))
                .build();

        System.out.println("trigger:\n" + trigger);

        TransactionExtention txnExt = blockingStub.triggerContract(trigger);
        System.out.println("txn id => " + TronClient.toHex(txnExt.getTxid().toByteArray()));
        System.out.println("contsant result :" + txnExt.getConstantResult(0));

        Transaction unsignedTxn = txnExt.getTransaction().toBuilder()
            .setRawData(txnExt.getTransaction().getRawData().toBuilder().setFeeLimit(feeLimit))
            .build();

        Transaction signedTxn = signTransaction(unsignedTxn);

        System.out.println(signedTxn.toString());
        TransactionReturn ret = blockingStub.broadcastTransaction(signedTxn);
        System.out.println("======== Result ========\n" + ret.toString());
    }*/

    /**
     * Obtain a {@code Contract} object via an address
     * @param contractAddress smart contract address
     * @return the smart contract obtained from the address
     * @throws Exception if contract address does not match
     */
    public Contract getContract(String contractAddress) {
        ByteString rawAddr = parseAddress(contractAddress);
        BytesMessage param =
                BytesMessage.newBuilder()
                        .setValue(rawAddr)
                        .build();

        SmartContract cntr = blockingStub.getContract(param);

        Contract contract =
                new Contract.Builder()
                        .setOriginAddr(cntr.getOriginAddress())
                        .setCntrAddr(cntr.getContractAddress())
                        .setBytecode(cntr.getBytecode())
                        .setName(cntr.getName())
                        .setAbi(cntr.getAbi())
                        .setOriginEnergyLimit(cntr.getOriginEnergyLimit())
                        .setConsumeUserResourcePercent(cntr.getConsumeUserResourcePercent())
                        .build();

        return contract;
    }

    /**
     * Check whether a given method is in the contract.
     * @param cntr the smart contract.
     * @param function the smart contract function.
     * @return ture if function exists in the contract.
     */
    private boolean isFuncInContract(Contract cntr, Function function) {
        List<ContractFunction> functions = cntr.getFunctions();
        for (int i = 0; i < functions.size(); i++) {
            if (functions.get(i).getName().equalsIgnoreCase(function.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * call function without signature and broadcasting
     * @param ownerAddr the caller
     * @param cntr the contract
     * @param function the function called
     * @return TransactionExtention
     */
    private TransactionExtention callWithoutBroadcast(String ownerAddr, Contract cntr, Function function) {
        cntr.setOwnerAddr(parseAddress(ownerAddr));
        String encodedHex = FunctionEncoder.encode(function);
        // Make a TriggerSmartContract contract
        TriggerSmartContract trigger =
                TriggerSmartContract.newBuilder()
                        .setOwnerAddress(cntr.getOwnerAddr())
                        .setContractAddress(cntr.getCntrAddr())
                        .setData(parseHex(encodedHex))
                        .build();

        // System.out.println("trigger:\n" + trigger);

        TransactionExtention txnExt = blockingStub.triggerConstantContract(trigger);
        // System.out.println("txn id => " + toHex(txnExt.getTxid().toByteArray()));

        return txnExt;
    }

    /**
     * make a constant call - no broadcasting
     * @param ownerAddr the current caller.
     * @param contractAddr smart contract address.
     * @param function contract function.
     * @return TransactionExtention.
     * @throws RuntimeException if function cannot be found in the contract.
     */
    public TransactionExtention constantCall(String ownerAddr, String contractAddr, Function function) {
        Contract cntr = getContract(contractAddr);
        if (isFuncInContract(cntr, function)) {
            return callWithoutBroadcast(ownerAddr, cntr, function);
        } else {
            throw new RuntimeException("Function not found in the contract");
        }
    }

    /**
     * make a trigger call. Trigger call consumes energy and bandwidth.
     * @param ownerAddr the current caller
     * @param contractAddr smart contract address
     * @param function contract function
     * @return transaction builder. Users may set other fields, e.g. feeLimit
     * @throws RuntimeException if function cannot be found in the contract
     */
    public TransactionBuilder triggerCall(String ownerAddr, String contractAddr, Function function) {
        Contract cntr = getContract(contractAddr);
        if (isFuncInContract(cntr, function)) {
            TransactionExtention txnExt = callWithoutBroadcast(ownerAddr, cntr, function);
            return new TransactionBuilder(txnExt.getTransaction());
        } else {
            throw new RuntimeException("Function not found in the contract");
        }
    }

}