package com.github.comrada.tron4j.client.contract;

/**
 * The {@code Trc20Contract} is a wrapper class of a standard TRC-20 smart contract.
 *
 * <p>A {@code Trc20Contract} object includes standard TRC-20 functions defined
 * in TIP-20. Each {@code Trc20Contract} binds a {@link TronClient} with specific caller's private key and address.</p>
 *
 * @see com.github.comrada.tron4j.client.TronClient
 * @see com.github.comrada.tron4j.abi.datatypes.Function
 * @since jdk 13.0.2+8
 */

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

import com.github.comrada.tron4j.abi.FunctionReturnDecoder;
import com.github.comrada.tron4j.abi.TypeReference;
import com.github.comrada.tron4j.abi.datatypes.Address;
import com.github.comrada.tron4j.abi.datatypes.Bool;
import com.github.comrada.tron4j.abi.datatypes.Function;
import com.github.comrada.tron4j.abi.datatypes.Utf8String;
import com.github.comrada.tron4j.abi.datatypes.generated.Uint256;
import com.github.comrada.tron4j.abi.datatypes.generated.Uint8;
import com.github.comrada.tron4j.client.TronClient;
import com.github.comrada.tron4j.client.transaction.TransactionBuilder;
import com.github.comrada.tron4j.proto.Chain.Transaction;
import com.github.comrada.tron4j.proto.Response.TransactionExtention;
import com.github.comrada.tron4j.proto.Response.TransactionReturn;
import com.github.comrada.tron4j.utils.Base58Check;
import com.github.comrada.tron4j.utils.Numeric;
import java.math.BigInteger;
import java.util.List;

public class Trc20Contract extends Contract {

  protected BigInteger decimals;
  protected String symbol;
  protected String name;

  public Trc20Contract(Contract cntr, String ownerAddr, TronClient client) {
    super(cntr, ownerAddr, client);
  }

  /**
   * Call function name() public view returns (string).
   * <p>
   * Returns the name of the token - e.g. "MyToken".
   *
   * @return the name of the token
   */
  public String name() {
    if (name == null) {
      Function function = new Function("name", emptyList(), singletonList(new TypeReference<Utf8String>() {}));

      TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
          Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
      //Convert constant result to human readable text
      String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
      name = (String) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
    }
    return name;
  }

  /**
   * Call function symbol() public view returns (string).
   * <p>
   * Returns the symbol of the token. E.g. "HIX".
   *
   * @return the symbol of the token
   */
  public String symbol() {
    if (symbol == null) {
      Function function = new Function("symbol", emptyList(), singletonList(new TypeReference<Utf8String>() {}));

      TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
          Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
      //Convert constant result to human readable text
      String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
      symbol = (String) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
    }
    return symbol;
  }

  /**
   * Call function decimals() public view returns (uint8).
   * <p>
   * Returns the number of decimals the token uses - e.g. 8, means to divide the token amount by 100000000 to get its
   * user representation
   *
   * @return the number of decimals the token uses
   */
  public BigInteger decimals() {
    if (decimals == null) {
      Function function = new Function("decimals", emptyList(), singletonList(new TypeReference<Uint8>() {}));

      TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
          Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
      //Convert constant result to human readable text
      String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
      decimals = (BigInteger) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
    }
    return decimals;
  }

  /**
   * Call function totalSupply() public view returns (uint256).
   * <p>
   * Returns the total token supply.
   *
   * @return the total token supply
   */
  public BigInteger totalSupply() {
    Function function = new Function("totalSupply", emptyList(), singletonList(new TypeReference<Uint256>() {}));

    TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    //Convert constant result to human readable text
    String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
    return (BigInteger) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
  }

  /**
   * Call function balanceOf(address _owner) public view returns (uint256 balance).
   * <p>
   * Returns the account balance of another account with address _owner.
   *
   * @param accountAddr The token owner's address
   * @param callerAddr  The caller's address
   * @param cntrAddr    The contract's address
   * @return the account balance of another account with address _owner
   */
  public BigInteger balanceOf(String accountAddr) {
    Function function = new Function("balanceOf",
        singletonList(new Address(accountAddr)), singletonList(new TypeReference<Uint256>() {}));

    TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    //Convert constant result to human readable text
    String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
    return (BigInteger) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
  }

  /**
   * Call function transfer(address _to, uint256 _value) public returns (bool success).
   * <p>
   * Transfers _value amount of tokens to address _to.
   *
   * @param destAddr The address to receive the token
   * @param amount   The transfer amount
   * @param memo     The transaction memo
   * @param feeLimit The energy fee limit
   * @return A TransactionReturn object contains the trigger result(true / false)
   */
  public TransactionReturn transfer(String destAddr, long amount,
      String memo, long feeLimit) {
    Function function = new Function("transfer", List.of(new Address(destAddr),
            new Uint256(BigInteger.valueOf(amount).multiply(BigInteger.valueOf(10).pow(decimals().intValue())))),
        singletonList(new TypeReference<Bool>() {}));

    TransactionBuilder builder = client.triggerCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    builder.setFeeLimit(feeLimit);
    builder.setMemo(memo);

    Transaction signedTxn = client.signTransaction(builder.build());
    return client.broadcastTransaction(signedTxn);
  }

  /**
   * call function transferFrom(address _from, address _to, uint256 _value) public returns (bool success)
   * <p>
   * The transferFrom method is used for a withdraw workflow, allowing contracts to transfer tokens on your behalf. This
   * can only be called when someone has allowed you some amount.
   *
   * @param fromAddr The address who sends tokens (or the address to withdraw from)
   * @param destAddr The address to receive the token
   * @param amount   The transfer amount
   * @param memo     The transaction memo
   * @param feeLimit The energy fee limit
   * @return A TransactionReturn object contains the trigger result(true / false)
   */
  public TransactionReturn transferFrom(String fromAddr, String destAddr, long amount,
      String memo, long feeLimit) {
    Function function = new Function("transferFrom", List.of(new Address(fromAddr), new Address(destAddr),
            new Uint256(BigInteger.valueOf(amount).multiply(BigInteger.valueOf(10).pow(decimals().intValue())))),
        singletonList(new TypeReference<Bool>() {}));

    TransactionBuilder builder = client.triggerCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    builder.setFeeLimit(feeLimit);
    builder.setMemo(memo);

    Transaction signedTxn = client.signTransaction(builder.build());
    return client.broadcastTransaction(signedTxn);
  }

  /**
   * Call function approve(address _spender, uint256 _value) public returns (bool success)
   * <p>
   * Allows _spender to withdraw from your account multiple times, up to the _value amount. If this function is called
   * again it overwrites the current allowance with _value.
   *
   * @param spender  The address who is allowed to withdraw.
   * @param amount   The amount allowed to withdraw.
   * @param memo     The transaction memo
   * @param feeLimit The energy fee limit
   * @return A TransactionReturn object contains the trigger result(true / false)
   */
  public TransactionReturn approve(String spender, long amount, String memo, long feeLimit) {
    Function function = new Function("approve",
        List.of(new Address(spender),
            new Uint256(BigInteger.valueOf(amount).multiply(BigInteger.valueOf(10).pow(decimals().intValue())))),
        singletonList(new TypeReference<Bool>() {}));

    TransactionBuilder builder = client.triggerCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    builder.setFeeLimit(feeLimit);
    builder.setMemo(memo);

    Transaction signedTxn = client.signTransaction(builder.build());
    return client.broadcastTransaction(signedTxn);
  }

  /**
   * Call function allowance(address _owner, address _spender) public view returns (uint256 remaining).
   * <p>
   * Returns the amount which _spender is still allowed to withdraw from _owner.
   *
   * @param owner      The address to be withdrew from.
   * @param spender    The address of the withdrawer.
   * @param callerAddr The caller's address
   * @param cntrAddr   The contract's address
   * @return the amount which _spender is still allowed to withdraw from _owner
   */
  public BigInteger allowance(String owner, String spender) {
    Function function = new Function("allowance",
        List.of(new Address(owner), new Address(spender)), singletonList(new TypeReference<Uint256>() {}));

    TransactionExtention txnExt = client.constantCall(Base58Check.bytesToBase58(ownerAddr.toByteArray()),
        Base58Check.bytesToBase58(cntrAddr.toByteArray()), function);
    //Convert constant result to human readable text
    String result = Numeric.toHexString(txnExt.getConstantResult(0).toByteArray());
    return (BigInteger) FunctionReturnDecoder.decode(result, function.getOutputParameters()).get(0).getValue();
  }

}