package com.github.comrada.tron4j.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionReturn> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionReturn> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionReturn> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionReturn.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
              .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonTransaction",
      requestType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateCommonTransactionMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateCommonTransactionMethod;
    if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
          WalletGrpc.getCreateCommonTransactionMethod = getCreateCommonTransactionMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateCommonTransaction"))
              .build();
        }
      }
    }
    return getCreateCommonTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = com.github.comrada.tron4j.proto.Contract.AccountCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract, com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAccountMethod;
    if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
          WalletGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AccountCreateContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount"))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount2",
      requestType = com.github.comrada.tron4j.proto.Contract.AccountCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAccount2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAccount2Method;
    if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
          WalletGrpc.getCreateAccount2Method = getCreateAccount2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AccountCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount2"))
              .build();
        }
      }
    }
    return getCreateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = com.github.comrada.tron4j.proto.Contract.AccountUpdateContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract, com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
          WalletGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount"))
              .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount2",
      requestType = com.github.comrada.tron4j.proto.Contract.AccountUpdateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAccount2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAccount2Method;
    if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
          WalletGrpc.getUpdateAccount2Method = getUpdateAccount2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AccountUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount2"))
              .build();
        }
      }
    }
    return getUpdateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.SetAccountIdContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getSetAccountIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountId",
      requestType = com.github.comrada.tron4j.proto.Contract.SetAccountIdContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.SetAccountIdContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getSetAccountIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.SetAccountIdContract, com.github.comrada.tron4j.proto.Chain.Transaction> getSetAccountIdMethod;
    if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
          WalletGrpc.getSetAccountIdMethod = getSetAccountIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.SetAccountIdContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.SetAccountIdContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SetAccountId"))
              .build();
        }
      }
    }
    return getSetAccountIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPermissionUpdate",
      requestType = com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getAccountPermissionUpdateMethod;
    if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
          WalletGrpc.getAccountPermissionUpdateMethod = getAccountPermissionUpdateMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPermissionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AccountPermissionUpdate"))
              .build();
        }
      }
    }
    return getAccountPermissionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = com.github.comrada.tron4j.proto.Contract.TransferContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract, com.github.comrada.tron4j.proto.Chain.Transaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
          WalletGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TransferContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateTransaction2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction2",
      requestType = com.github.comrada.tron4j.proto.Contract.TransferContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateTransaction2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateTransaction2Method;
    if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
          WalletGrpc.getCreateTransaction2Method = getCreateTransaction2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TransferContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction2"))
              .build();
        }
      }
    }
    return getCreateTransaction2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue",
      requestType = com.github.comrada.tron4j.proto.Contract.AssetIssueContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAssetIssueMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract, com.github.comrada.tron4j.proto.Chain.Transaction> getCreateAssetIssueMethod;
    if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
          WalletGrpc.getCreateAssetIssueMethod = getCreateAssetIssueMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AssetIssueContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue"))
              .build();
        }
      }
    }
    return getCreateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue2",
      requestType = com.github.comrada.tron4j.proto.Contract.AssetIssueContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAssetIssue2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.AssetIssueContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateAssetIssue2Method;
    if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
          WalletGrpc.getCreateAssetIssue2Method = getCreateAssetIssue2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.AssetIssueContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue2"))
              .build();
        }
      }
    }
    return getCreateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
      requestType = com.github.comrada.tron4j.proto.Contract.UpdateAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
          WalletGrpc.getUpdateAssetMethod = getUpdateAssetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset"))
              .build();
        }
      }
    }
    return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset2",
      requestType = com.github.comrada.tron4j.proto.Contract.UpdateAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAsset2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateAsset2Method;
    if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
          WalletGrpc.getUpdateAsset2Method = getUpdateAsset2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UpdateAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset2"))
              .build();
        }
      }
    }
    return getUpdateAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset",
      requestType = com.github.comrada.tron4j.proto.Contract.TransferAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getTransferAssetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction> getTransferAssetMethod;
    if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
          WalletGrpc.getTransferAssetMethod = getTransferAssetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TransferAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset"))
              .build();
        }
      }
    }
    return getTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTransferAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset2",
      requestType = com.github.comrada.tron4j.proto.Contract.TransferAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTransferAsset2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TransferAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getTransferAsset2Method;
    if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
          WalletGrpc.getTransferAsset2Method = getTransferAsset2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TransferAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset2"))
              .build();
        }
      }
    }
    return getTransferAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getParticipateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue",
      requestType = com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getParticipateAssetIssueMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract, com.github.comrada.tron4j.proto.Chain.Transaction> getParticipateAssetIssueMethod;
    if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
          WalletGrpc.getParticipateAssetIssueMethod = getParticipateAssetIssueMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue"))
              .build();
        }
      }
    }
    return getParticipateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue2",
      requestType = com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getParticipateAssetIssue2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getParticipateAssetIssue2Method;
    if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
          WalletGrpc.getParticipateAssetIssue2Method = getParticipateAssetIssue2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue2"))
              .build();
        }
      }
    }
    return getParticipateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset",
      requestType = com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeAssetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeAssetMethod;
    if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
          WalletGrpc.getUnfreezeAssetMethod = getUnfreezeAssetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset"))
              .build();
        }
      }
    }
    return getUnfreezeAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset2",
      requestType = com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeAsset2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeAsset2Method;
    if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
          WalletGrpc.getUnfreezeAsset2Method = getUnfreezeAsset2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset2"))
              .build();
        }
      }
    }
    return getUnfreezeAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness",
      requestType = com.github.comrada.tron4j.proto.Contract.WitnessCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getCreateWitnessMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract, com.github.comrada.tron4j.proto.Chain.Transaction> getCreateWitnessMethod;
    if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
          WalletGrpc.getCreateWitnessMethod = getCreateWitnessMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness"))
              .build();
        }
      }
    }
    return getCreateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = com.github.comrada.tron4j.proto.Contract.WitnessCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WitnessCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
              .build();
        }
      }
    }
    return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness",
      requestType = com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateWitnessMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract, com.github.comrada.tron4j.proto.Chain.Transaction> getUpdateWitnessMethod;
    if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
          WalletGrpc.getUpdateWitnessMethod = getUpdateWitnessMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness"))
              .build();
        }
      }
    }
    return getUpdateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness2",
      requestType = com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateWitness2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateWitness2Method;
    if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
          WalletGrpc.getUpdateWitness2Method = getUpdateWitness2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness2"))
              .build();
        }
      }
    }
    return getUpdateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBrokerage",
      requestType = com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateBrokerageMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateBrokerageMethod;
    if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
          WalletGrpc.getUpdateBrokerageMethod = getUpdateBrokerageMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBrokerage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateBrokerage"))
              .build();
        }
      }
    }
    return getUpdateBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getVoteWitnessAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount",
      requestType = com.github.comrada.tron4j.proto.Contract.VoteWitnessContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getVoteWitnessAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract, com.github.comrada.tron4j.proto.Chain.Transaction> getVoteWitnessAccountMethod;
    if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
          WalletGrpc.getVoteWitnessAccountMethod = getVoteWitnessAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount"))
              .build();
        }
      }
    }
    return getVoteWitnessAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getVoteWitnessAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount2",
      requestType = com.github.comrada.tron4j.proto.Contract.VoteWitnessContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getVoteWitnessAccount2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getVoteWitnessAccount2Method;
    if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
          WalletGrpc.getVoteWitnessAccount2Method = getVoteWitnessAccount2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.VoteWitnessContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount2"))
              .build();
        }
      }
    }
    return getVoteWitnessAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getFreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance",
      requestType = com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getFreezeBalanceMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction> getFreezeBalanceMethod;
    if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
          WalletGrpc.getFreezeBalanceMethod = getFreezeBalanceMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance"))
              .build();
        }
      }
    }
    return getFreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getFreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance2",
      requestType = com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getFreezeBalance2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getFreezeBalance2Method;
    if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
          WalletGrpc.getFreezeBalance2Method = getFreezeBalance2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance2"))
              .build();
        }
      }
    }
    return getFreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance",
      requestType = com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeBalanceMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction> getUnfreezeBalanceMethod;
    if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
          WalletGrpc.getUnfreezeBalanceMethod = getUnfreezeBalanceMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance"))
              .build();
        }
      }
    }
    return getUnfreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance2",
      requestType = com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeBalance2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUnfreezeBalance2Method;
    if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
          WalletGrpc.getUnfreezeBalance2Method = getUnfreezeBalance2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance2"))
              .build();
        }
      }
    }
    return getUnfreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getWithdrawBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance",
      requestType = com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
      com.github.comrada.tron4j.proto.Chain.Transaction> getWithdrawBalanceMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction> getWithdrawBalanceMethod;
    if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
          WalletGrpc.getWithdrawBalanceMethod = getWithdrawBalanceMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance"))
              .build();
        }
      }
    }
    return getWithdrawBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
              .build();
        }
      }
    }
    return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalCreate",
      requestType = com.github.comrada.tron4j.proto.Contract.ProposalCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalCreateMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalCreateMethod;
    if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
          WalletGrpc.getProposalCreateMethod = getProposalCreateMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ProposalCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ProposalCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalCreate"))
              .build();
        }
      }
    }
    return getProposalCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalApproveContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalApprove",
      requestType = com.github.comrada.tron4j.proto.Contract.ProposalApproveContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalApproveContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalApproveMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalApproveContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalApproveMethod;
    if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
          WalletGrpc.getProposalApproveMethod = getProposalApproveMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ProposalApproveContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ProposalApproveContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalApprove"))
              .build();
        }
      }
    }
    return getProposalApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDelete",
      requestType = com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalDeleteMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getProposalDeleteMethod;
    if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
          WalletGrpc.getProposalDeleteMethod = getProposalDeleteMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalDelete"))
              .build();
        }
      }
    }
    return getProposalDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.CreateSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = com.github.comrada.tron4j.proto.Contract.CreateSmartContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.CreateSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.CreateSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.CreateSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateSettingContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSetting",
      requestType = com.github.comrada.tron4j.proto.Contract.UpdateSettingContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateSettingContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateSettingMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateSettingContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateSettingMethod;
    if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
          WalletGrpc.getUpdateSettingMethod = getUpdateSettingMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UpdateSettingContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UpdateSettingContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateSetting"))
              .build();
        }
      }
    }
    return getUpdateSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnergyLimit",
      requestType = com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getUpdateEnergyLimitMethod;
    if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
          WalletGrpc.getUpdateEnergyLimitMethod = getUpdateEnergyLimitMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnergyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateEnergyLimit"))
              .build();
        }
      }
    }
    return getUpdateEnergyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ClearABIContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getClearContractABIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearContractABI",
      requestType = com.github.comrada.tron4j.proto.Contract.ClearABIContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ClearABIContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getClearContractABIMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ClearABIContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getClearContractABIMethod;
    if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
          WalletGrpc.getClearContractABIMethod = getClearContractABIMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ClearABIContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearContractABI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ClearABIContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ClearContractABI"))
              .build();
        }
      }
    }
    return getClearContractABIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = com.github.comrada.tron4j.proto.Contract.TriggerSmartContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
              .build();
        }
      }
    }
    return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = com.github.comrada.tron4j.proto.Contract.TriggerSmartContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.TriggerSmartContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
              .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeCreate",
      requestType = com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeCreateMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeCreateMethod;
    if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
          WalletGrpc.getExchangeCreateMethod = getExchangeCreateMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeCreate"))
              .build();
        }
      }
    }
    return getExchangeCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeInjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeInject",
      requestType = com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeInjectMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeInjectMethod;
    if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
          WalletGrpc.getExchangeInjectMethod = getExchangeInjectMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeInject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeInject"))
              .build();
        }
      }
    }
    return getExchangeInjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeWithdraw",
      requestType = com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeWithdrawMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeWithdrawMethod;
    if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
          WalletGrpc.getExchangeWithdrawMethod = getExchangeWithdrawMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeWithdraw"))
              .build();
        }
      }
    }
    return getExchangeWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeTransaction",
      requestType = com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeTransactionMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getExchangeTransactionMethod;
    if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
          WalletGrpc.getExchangeTransactionMethod = getExchangeTransactionMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeTransaction"))
              .build();
        }
      }
    }
    return getExchangeTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketSellAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketSellAsset",
      requestType = com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketSellAssetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketSellAssetMethod;
    if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
          WalletGrpc.getMarketSellAssetMethod = getMarketSellAssetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketSellAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketSellAsset"))
              .build();
        }
      }
    }
    return getMarketSellAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketCancelOrder",
      requestType = com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract, com.github.comrada.tron4j.proto.Response.TransactionExtention> getMarketCancelOrderMethod;
    if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
          WalletGrpc.getMarketCancelOrderMethod = getMarketCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketCancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketCancelOrder"))
              .build();
        }
      }
    }
    return getMarketCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.NodeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
              .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.ChainParameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
              .build();
        }
      }
    }
    return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
              .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
              .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionSignWeight.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
              .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction,
      com.github.comrada.tron4j.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Chain.Transaction, com.github.comrada.tron4j.proto.Response.TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionApprovedList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
              .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage,
      com.github.comrada.tron4j.proto.Response.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage,
      com.github.comrada.tron4j.proto.Response.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage, com.github.comrada.tron4j.proto.Response.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage, com.github.comrada.tron4j.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AccountNetMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
              .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AccountResourceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
              .build();
        }
      }
    }
    return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
              .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
              .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
              .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Chain.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
              .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
              .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Chain.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
              .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
      com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BlockLimit.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
      com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit, com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit, com.github.comrada.tron4j.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
      com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BlockLimit.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
      com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit, com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BlockLimit, com.github.comrada.tron4j.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
      com.github.comrada.tron4j.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage, com.github.comrada.tron4j.proto.Response.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Common.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Common.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Common.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Common.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Common.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Common.SmartContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
              .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
              .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage,
      com.github.comrada.tron4j.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage,
      com.github.comrada.tron4j.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage, com.github.comrada.tron4j.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage, com.github.comrada.tron4j.proto.Response.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
              .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
              .build();
        }
      }
    }
    return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
              .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
      com.github.comrada.tron4j.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage, com.github.comrada.tron4j.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
              .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters, com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters, com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters, com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters, com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters.class,
      responseType = com.github.comrada.tron4j.proto.Response.NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters,
      com.github.comrada.tron4j.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters, com.github.comrada.tron4j.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters, com.github.comrada.tron4j.proto.Response.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
              .build();
        }
      }
    }
    return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.proto.Response.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
              .build();
        }
      }
    }
    return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair,
      com.github.comrada.tron4j.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = com.github.comrada.tron4j.proto.Response.MarketOrderPair.class,
      responseType = com.github.comrada.tron4j.proto.Response.MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair,
      com.github.comrada.tron4j.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair, com.github.comrada.tron4j.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.MarketOrderPair, com.github.comrada.tron4j.proto.Response.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
              .build();
        }
      }
    }
    return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair,
      com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = com.github.comrada.tron4j.proto.Response.MarketOrderPair.class,
      responseType = com.github.comrada.tron4j.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair,
      com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.MarketOrderPair, com.github.comrada.tron4j.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.MarketOrderPair, com.github.comrada.tron4j.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
              .build();
        }
      }
    }
    return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
      requestType = com.github.comrada.tron4j.proto.Response.TransactionSign.class,
      responseType = com.github.comrada.tron4j.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Chain.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
              .build();
        }
      }
    }
    return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
      requestType = com.github.comrada.tron4j.proto.Response.TransactionSign.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Response.TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
              .build();
        }
      }
    }
    return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
              .build();
        }
      }
    }
    return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAssetByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
              .build();
        }
      }
    }
    return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage,
      com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage, com.github.comrada.tron4j.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
              .build();
        }
      }
    }
    return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSign",
      requestType = com.github.comrada.tron4j.proto.Response.TransactionSign.class,
      responseType = com.github.comrada.tron4j.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign,
      com.github.comrada.tron4j.proto.Response.TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Response.TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.proto.Response.TransactionSign, com.github.comrada.tron4j.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
              .build();
        }
      }
    }
    return getAddSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
              .build();
        }
      }
    }
    return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
              .build();
        }
      }
    }
    return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
              .build();
        }
      }
    }
    return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
              .build();
        }
      }
    }
    return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage, com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage, com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
              .build();
        }
      }
    }
    return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
              .build();
        }
      }
    }
    return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
              .build();
        }
      }
    }
    return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
              .build();
        }
      }
    }
    return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
              .build();
        }
      }
    }
    return getGetRcmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters, com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters, com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersWithoutAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod =
              io.grpc.MethodDescriptor.<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.comrada.tron4j.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
              .build();
        }
      }
    }
    return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
        @java.lang.Override
        public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletStub(channel, callOptions);
        }
      };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
        @java.lang.Override
        public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletBlockingStub(channel, callOptions);
        }
      };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
        @java.lang.Override
        public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletFutureStub(channel, callOptions);
        }
      };
    return WalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createCommonTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommonTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createAccount(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void createAccount2(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccount2Method(), responseObserver);
    }

    /**
     */
    public void updateAccount(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateAccount2(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccount2Method(), responseObserver);
    }

    /**
     */
    public void setAccountId(com.github.comrada.tron4j.proto.Contract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccountIdMethod(), responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPermissionUpdateMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(com.github.comrada.tron4j.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction2(com.github.comrada.tron4j.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransaction2Method(), responseObserver);
    }

    /**
     */
    public void createAssetIssue(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void createAssetIssue2(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void updateAsset(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     */
    public void updateAsset2(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAsset2Method(), responseObserver);
    }

    /**
     */
    public void transferAsset(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void transferAsset2(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferAsset2Method(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParticipateAssetIssueMethod(), responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParticipateAssetIssue2Method(), responseObserver);
    }

    /**
     */
    public void unfreezeAsset(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeAssetMethod(), responseObserver);
    }

    /**
     */
    public void unfreezeAsset2(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeAsset2Method(), responseObserver);
    }

    /**
     */
    public void createWitness(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void createWitness2(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     */
    public void updateWitness(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWitnessMethod(), responseObserver);
    }

    /**
     */
    public void updateWitness2(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWitness2Method(), responseObserver);
    }

    /**
     */
    public void updateBrokerage(com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBrokerageMethod(), responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteWitnessAccountMethod(), responseObserver);
    }

    /**
     */
    public void voteWitnessAccount2(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteWitnessAccount2Method(), responseObserver);
    }

    /**
     */
    public void freezeBalance(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeBalanceMethod(), responseObserver);
    }

    /**
     */
    public void freezeBalance2(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeBalance2Method(), responseObserver);
    }

    /**
     */
    public void unfreezeBalance(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeBalanceMethod(), responseObserver);
    }

    /**
     */
    public void unfreezeBalance2(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeBalance2Method(), responseObserver);
    }

    /**
     */
    public void withdrawBalance(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawBalanceMethod(), responseObserver);
    }

    /**
     */
    public void withdrawBalance2(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     */
    public void proposalCreate(com.github.comrada.tron4j.proto.Contract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalCreateMethod(), responseObserver);
    }

    /**
     */
    public void proposalApprove(com.github.comrada.tron4j.proto.Contract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalApproveMethod(), responseObserver);
    }

    /**
     */
    public void proposalDelete(com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deployContract(com.github.comrada.tron4j.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     */
    public void updateSetting(com.github.comrada.tron4j.proto.Contract.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingMethod(), responseObserver);
    }

    /**
     */
    public void updateEnergyLimit(com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnergyLimitMethod(), responseObserver);
    }

    /**
     */
    public void clearContractABI(com.github.comrada.tron4j.proto.Contract.ClearABIContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearContractABIMethod(), responseObserver);
    }

    /**
     */
    public void triggerContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    public void triggerConstantContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    public void exchangeCreate(com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeCreateMethod(), responseObserver);
    }

    /**
     */
    public void exchangeInject(com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeInjectMethod(), responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void exchangeTransaction(com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeTransactionMethod(), responseObserver);
    }

    /**
     */
    public void marketSellAsset(com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketSellAssetMethod(), responseObserver);
    }

    /**
     */
    public void marketCancelOrder(com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketCancelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    public void listNodes(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    public void getChainParameters(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ChainParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    public void totalTransaction(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountById(com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAccountNet(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountNetMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    public void getAccountResource(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    public void getNowBlock2(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    public void getContract(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Common.SmartContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    public void listWitnesses(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.WitnessList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    public void getRewardInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResource(com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    public void listProposals(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    public void getProposalById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Proposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    public void listExchanges(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    public void getExchangeById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Exchange> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NullifierResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketPriceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    public void getMarketPairList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionSign2(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     */
    public void easyTransferAsset(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void easyTransfer(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     */
    public void createAddress(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    public void generateAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    public void addSign(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getAkFromAsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    public void getNkFromNsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    public void getDiversifier(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    public void getRcm(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBroadcastTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Chain.Transaction,
                com.github.comrada.tron4j.proto.Response.TransactionReturn>(
                  this, METHODID_BROADCAST_TRANSACTION)))
          .addMethod(
            getCreateCommonTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Chain.Transaction,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_COMMON_TRANSACTION)))
          .addMethod(
            getCreateAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getCreateAccount2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AccountCreateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_ACCOUNT2)))
          .addMethod(
            getUpdateAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getUpdateAccount2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AccountUpdateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ACCOUNT2)))
          .addMethod(
            getSetAccountIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.SetAccountIdContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_SET_ACCOUNT_ID)))
          .addMethod(
            getAccountPermissionUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_ACCOUNT_PERMISSION_UPDATE)))
          .addMethod(
            getCreateTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TransferContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getCreateTransaction2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TransferContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_TRANSACTION2)))
          .addMethod(
            getCreateAssetIssueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_CREATE_ASSET_ISSUE)))
          .addMethod(
            getCreateAssetIssue2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.AssetIssueContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_ASSET_ISSUE2)))
          .addMethod(
            getUpdateAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_ASSET)))
          .addMethod(
            getUpdateAsset2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UpdateAssetContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ASSET2)))
          .addMethod(
            getTransferAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_TRANSFER_ASSET)))
          .addMethod(
            getTransferAsset2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TransferAssetContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_TRANSFER_ASSET2)))
          .addMethod(
            getParticipateAssetIssueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE)))
          .addMethod(
            getParticipateAssetIssue2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_PARTICIPATE_ASSET_ISSUE2)))
          .addMethod(
            getUnfreezeAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_UNFREEZE_ASSET)))
          .addMethod(
            getUnfreezeAsset2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UNFREEZE_ASSET2)))
          .addMethod(
            getCreateWitnessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_CREATE_WITNESS)))
          .addMethod(
            getCreateWitness2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WitnessCreateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CREATE_WITNESS2)))
          .addMethod(
            getUpdateWitnessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_UPDATE_WITNESS)))
          .addMethod(
            getUpdateWitness2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_WITNESS2)))
          .addMethod(
            getUpdateBrokerageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_BROKERAGE)))
          .addMethod(
            getVoteWitnessAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT)))
          .addMethod(
            getVoteWitnessAccount2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.VoteWitnessContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_VOTE_WITNESS_ACCOUNT2)))
          .addMethod(
            getFreezeBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_FREEZE_BALANCE)))
          .addMethod(
            getFreezeBalance2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_FREEZE_BALANCE2)))
          .addMethod(
            getUnfreezeBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_UNFREEZE_BALANCE)))
          .addMethod(
            getUnfreezeBalance2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UNFREEZE_BALANCE2)))
          .addMethod(
            getWithdrawBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_WITHDRAW_BALANCE)))
          .addMethod(
            getWithdrawBalance2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_WITHDRAW_BALANCE2)))
          .addMethod(
            getProposalCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ProposalCreateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_CREATE)))
          .addMethod(
            getProposalApproveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ProposalApproveContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_APPROVE)))
          .addMethod(
            getProposalDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_PROPOSAL_DELETE)))
          .addMethod(
            getDeployContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.CreateSmartContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_DEPLOY_CONTRACT)))
          .addMethod(
            getUpdateSettingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UpdateSettingContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_SETTING)))
          .addMethod(
            getUpdateEnergyLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_UPDATE_ENERGY_LIMIT)))
          .addMethod(
            getClearContractABIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ClearABIContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_CLEAR_CONTRACT_ABI)))
          .addMethod(
            getTriggerContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_TRIGGER_CONTRACT)))
          .addMethod(
            getTriggerConstantContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.TriggerSmartContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_TRIGGER_CONSTANT_CONTRACT)))
          .addMethod(
            getExchangeCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_CREATE)))
          .addMethod(
            getExchangeInjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_INJECT)))
          .addMethod(
            getExchangeWithdrawMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_WITHDRAW)))
          .addMethod(
            getExchangeTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_EXCHANGE_TRANSACTION)))
          .addMethod(
            getMarketSellAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_MARKET_SELL_ASSET)))
          .addMethod(
            getMarketCancelOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_MARKET_CANCEL_ORDER)))
          .addMethod(
            getGetNodeInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.NodeInfo>(
                  this, METHODID_GET_NODE_INFO)))
          .addMethod(
            getListNodesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.NodeList>(
                  this, METHODID_LIST_NODES)))
          .addMethod(
            getGetChainParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.ChainParameters>(
                  this, METHODID_GET_CHAIN_PARAMETERS)))
          .addMethod(
            getTotalTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>(
                  this, METHODID_TOTAL_TRANSACTION)))
          .addMethod(
            getGetNextMaintenanceTimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_NEXT_MAINTENANCE_TIME)))
          .addMethod(
            getGetTransactionSignWeightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Chain.Transaction,
                com.github.comrada.tron4j.proto.Response.TransactionSignWeight>(
                  this, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
          .addMethod(
            getGetTransactionApprovedListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Chain.Transaction,
                com.github.comrada.tron4j.proto.Response.TransactionApprovedList>(
                  this, METHODID_GET_TRANSACTION_APPROVED_LIST)))
          .addMethod(
            getGetAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
                com.github.comrada.tron4j.proto.Response.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage,
                com.github.comrada.tron4j.proto.Response.Account>(
                  this, METHODID_GET_ACCOUNT_BY_ID)))
          .addMethod(
            getGetAccountNetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
                com.github.comrada.tron4j.proto.Response.AccountNetMessage>(
                  this, METHODID_GET_ACCOUNT_NET)))
          .addMethod(
            getGetAccountResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
                com.github.comrada.tron4j.proto.Response.AccountResourceMessage>(
                  this, METHODID_GET_ACCOUNT_RESOURCE)))
          .addMethod(
            getGetAssetIssueByAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage,
                com.github.comrada.tron4j.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
          .addMethod(
            getGetAssetIssueByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_NAME)))
          .addMethod(
            getGetAssetIssueListByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
          .addMethod(
            getGetAssetIssueByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Contract.AssetIssueContract>(
                  this, METHODID_GET_ASSET_ISSUE_BY_ID)))
          .addMethod(
            getGetAssetIssueListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.AssetIssueList>(
                  this, METHODID_GET_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetPaginatedAssetIssueListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
                com.github.comrada.tron4j.proto.Response.AssetIssueList>(
                  this, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
          .addMethod(
            getGetNowBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Chain.Block>(
                  this, METHODID_GET_NOW_BLOCK)))
          .addMethod(
            getGetNowBlock2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.BlockExtention>(
                  this, METHODID_GET_NOW_BLOCK2)))
          .addMethod(
            getGetBlockByNumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.proto.Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_NUM)))
          .addMethod(
            getGetBlockByNum2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.proto.Response.BlockExtention>(
                  this, METHODID_GET_BLOCK_BY_NUM2)))
          .addMethod(
            getGetBlockByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Chain.Block>(
                  this, METHODID_GET_BLOCK_BY_ID)))
          .addMethod(
            getGetBlockByLimitNextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
                com.github.comrada.tron4j.proto.Response.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
          .addMethod(
            getGetBlockByLimitNext2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BlockLimit,
                com.github.comrada.tron4j.proto.Response.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
          .addMethod(
            getGetBlockByLatestNumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.proto.Response.BlockList>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM)))
          .addMethod(
            getGetBlockByLatestNum2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.proto.Response.BlockListExtention>(
                  this, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
          .addMethod(
            getGetTransactionCountByBlockNumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
          .addMethod(
            getGetTransactionByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_BY_ID)))
          .addMethod(
            getGetTransactionInfoByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.TransactionInfo>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_ID)))
          .addMethod(
            getGetTransactionInfoByBlockNumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage,
                com.github.comrada.tron4j.proto.Response.TransactionInfoList>(
                  this, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
          .addMethod(
            getGetContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Common.SmartContract>(
                  this, METHODID_GET_CONTRACT)))
          .addMethod(
            getGetContractInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper>(
                  this, METHODID_GET_CONTRACT_INFO)))
          .addMethod(
            getListWitnessesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.WitnessList>(
                  this, METHODID_LIST_WITNESSES)))
          .addMethod(
            getGetBrokerageInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_BROKERAGE_INFO)))
          .addMethod(
            getGetRewardInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>(
                  this, METHODID_GET_REWARD_INFO)))
          .addMethod(
            getGetDelegatedResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage,
                com.github.comrada.tron4j.proto.Response.DelegatedResourceList>(
                  this, METHODID_GET_DELEGATED_RESOURCE)))
          .addMethod(
            getGetDelegatedResourceAccountIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex>(
                  this, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
          .addMethod(
            getListProposalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.ProposalList>(
                  this, METHODID_LIST_PROPOSALS)))
          .addMethod(
            getGetProposalByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.Proposal>(
                  this, METHODID_GET_PROPOSAL_BY_ID)))
          .addMethod(
            getGetPaginatedProposalListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
                com.github.comrada.tron4j.proto.Response.ProposalList>(
                  this, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
          .addMethod(
            getListExchangesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.ExchangeList>(
                  this, METHODID_LIST_EXCHANGES)))
          .addMethod(
            getGetExchangeByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.Exchange>(
                  this, METHODID_GET_EXCHANGE_BY_ID)))
          .addMethod(
            getGetPaginatedExchangeListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage,
                com.github.comrada.tron4j.proto.Response.ExchangeList>(
                  this, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
          .addMethod(
            getScanShieldedTRC20NotesByIvkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters,
                com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
          .addMethod(
            getScanShieldedTRC20NotesByOvkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters,
                com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>(
                  this, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
          .addMethod(
            getIsShieldedTRC20ContractNoteSpentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters,
                com.github.comrada.tron4j.proto.Response.NullifierResult>(
                  this, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
          .addMethod(
            getGetMarketOrderByAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
          .addMethod(
            getGetMarketOrderByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.proto.Response.MarketOrder>(
                  this, METHODID_GET_MARKET_ORDER_BY_ID)))
          .addMethod(
            getGetMarketPriceByPairMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.MarketOrderPair,
                com.github.comrada.tron4j.proto.Response.MarketPriceList>(
                  this, METHODID_GET_MARKET_PRICE_BY_PAIR)))
          .addMethod(
            getGetMarketOrderListByPairMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.MarketOrderPair,
                com.github.comrada.tron4j.proto.Response.MarketOrderList>(
                  this, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
          .addMethod(
            getGetMarketPairListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.MarketOrderPairList>(
                  this, METHODID_GET_MARKET_PAIR_LIST)))
          .addMethod(
            getGetTransactionSignMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.TransactionSign,
                com.github.comrada.tron4j.proto.Chain.Transaction>(
                  this, METHODID_GET_TRANSACTION_SIGN)))
          .addMethod(
            getGetTransactionSign2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.TransactionSign,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_GET_TRANSACTION_SIGN2)))
          .addMethod(
            getEasyTransferAssetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage,
                com.github.comrada.tron4j.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET)))
          .addMethod(
            getEasyTransferAssetByPrivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage,
                com.github.comrada.tron4j.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
          .addMethod(
            getEasyTransferMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage,
                com.github.comrada.tron4j.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER)))
          .addMethod(
            getEasyTransferByPrivateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage,
                com.github.comrada.tron4j.proto.Response.EasyTransferResponse>(
                  this, METHODID_EASY_TRANSFER_BY_PRIVATE)))
          .addMethod(
            getCreateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_CREATE_ADDRESS)))
          .addMethod(
            getGenerateAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage>(
                  this, METHODID_GENERATE_ADDRESS)))
          .addMethod(
            getAddSignMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.proto.Response.TransactionSign,
                com.github.comrada.tron4j.proto.Response.TransactionExtention>(
                  this, METHODID_ADD_SIGN)))
          .addMethod(
            getGetSpendingKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_SPENDING_KEY)))
          .addMethod(
            getGetExpandedSpendingKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage>(
                  this, METHODID_GET_EXPANDED_SPENDING_KEY)))
          .addMethod(
            getGetAkFromAskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_AK_FROM_ASK)))
          .addMethod(
            getGetNkFromNskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_NK_FROM_NSK)))
          .addMethod(
            getGetIncomingViewingKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage>(
                  this, METHODID_GET_INCOMING_VIEWING_KEY)))
          .addMethod(
            getGetDiversifierMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage>(
                  this, METHODID_GET_DIVERSIFIER)))
          .addMethod(
            getGetZenPaymentAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
                com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage>(
                  this, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
          .addMethod(
            getGetNewShieldedAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo>(
                  this, METHODID_GET_NEW_SHIELDED_ADDRESS)))
          .addMethod(
            getGetRcmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_RCM)))
          .addMethod(
            getCreateShieldedContractParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters,
                com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
          .addMethod(
            getCreateShieldedContractParametersWithoutAskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
                com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>(
                  this, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
          .addMethod(
            getGetTriggerInputForShieldedTRC20ContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
                com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>(
                  this, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
          .build();
    }
  }

  /**
   */
  public static final class WalletStub extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommonTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount2(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount2(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccountId(com.github.comrada.tron4j.proto.Contract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPermissionUpdate(com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(com.github.comrada.tron4j.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction2(com.github.comrada.tron4j.proto.Contract.TransferContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetIssue2(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset2(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferAsset2(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void participateAssetIssue2(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeAsset(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeAsset2(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWitness(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWitness2(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWitness(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWitness2(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBrokerage(com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteWitnessAccount(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteWitnessAccount2(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void freezeBalance(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void freezeBalance2(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeBalance(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfreezeBalance2(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance2(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalCreate(com.github.comrada.tron4j.proto.Contract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalApprove(com.github.comrada.tron4j.proto.Contract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalDelete(com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deployContract(com.github.comrada.tron4j.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSetting(com.github.comrada.tron4j.proto.Contract.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnergyLimit(com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearContractABI(com.github.comrada.tron4j.proto.Contract.ClearABIContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeCreate(com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeInject(com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeTransaction(com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketSellAsset(com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketCancelOrder(com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ChainParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(com.github.comrada.tron4j.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountNetMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock2(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Common.SmartContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.WitnessList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Proposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Exchange> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NullifierResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketPriceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSign2(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAsset(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransfer(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(com.github.comrada.tron4j.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.TransactionReturn broadcastTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention createCommonTransaction(com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommonTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction createAccount(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention createAccount2(com.github.comrada.tron4j.proto.Contract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction updateAccount(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateAccount2(com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction setAccountId(com.github.comrada.tron4j.proto.Contract.SetAccountIdContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccountIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention accountPermissionUpdate(com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPermissionUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction createTransaction(com.github.comrada.tron4j.proto.Contract.TransferContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention createTransaction2(com.github.comrada.tron4j.proto.Contract.TransferContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransaction2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction createAssetIssue(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention createAssetIssue2(com.github.comrada.tron4j.proto.Contract.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction updateAsset(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateAsset2(com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction transferAsset(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention transferAsset2(com.github.comrada.tron4j.proto.Contract.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction participateAssetIssue(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParticipateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention participateAssetIssue2(com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParticipateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction unfreezeAsset(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention unfreezeAsset2(com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction createWitness(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention createWitness2(com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction updateWitness(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWitnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateWitness2(com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateBrokerage(com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBrokerageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction voteWitnessAccount(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteWitnessAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention voteWitnessAccount2(com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteWitnessAccount2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction freezeBalance(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention freezeBalance2(com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction unfreezeBalance(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention unfreezeBalance2(com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction withdrawBalance(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention withdrawBalance2(com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention proposalCreate(com.github.comrada.tron4j.proto.Contract.ProposalCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention proposalApprove(com.github.comrada.tron4j.proto.Contract.ProposalApproveContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention proposalDelete(com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention deployContract(com.github.comrada.tron4j.proto.Contract.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateSetting(com.github.comrada.tron4j.proto.Contract.UpdateSettingContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention updateEnergyLimit(com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnergyLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention clearContractABI(com.github.comrada.tron4j.proto.Contract.ClearABIContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearContractABIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention triggerContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention triggerConstantContract(com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention exchangeCreate(com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention exchangeInject(com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeInjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention exchangeWithdraw(com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention exchangeTransaction(com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention marketSellAsset(com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketSellAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention marketCancelOrder(com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.NodeInfo getNodeInfo(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.NodeList listNodes(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.ChainParameters getChainParameters(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.NumberMessage totalTransaction(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.NumberMessage getNextMaintenanceTime(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionSignWeight getTransactionSignWeight(com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionApprovedList getTransactionApprovedList(com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.Account getAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.Account getAccountById(com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AccountNetMessage getAccountNet(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AccountResourceMessage getAccountResource(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AssetIssueList getAssetIssueByAccount(com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Contract.AssetIssueContract getAssetIssueByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AssetIssueList getAssetIssueListByName(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Contract.AssetIssueContract getAssetIssueById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AssetIssueList getAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AssetIssueList getPaginatedAssetIssueList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Block getNowBlock(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockExtention getNowBlock2(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Block getBlockByNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockExtention getBlockByNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Chain.Block getBlockById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockList getBlockByLimitNext(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockListExtention getBlockByLimitNext2(com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockList getBlockByLatestNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.BlockListExtention getBlockByLatestNum2(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.NumberMessage getTransactionCountByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction getTransactionById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionInfo getTransactionInfoById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionInfoList getTransactionInfoByBlockNum(com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Common.SmartContract getContract(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper getContractInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.WitnessList listWitnesses(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.NumberMessage getBrokerageInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.NumberMessage getRewardInfo(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.DelegatedResourceList getDelegatedResource(com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.ProposalList listProposals(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.Proposal getProposalById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.ProposalList getPaginatedProposalList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.ExchangeList listExchanges(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.Exchange getExchangeById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.ExchangeList getPaginatedExchangeList(com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.NullifierResult isShieldedTRC20ContractNoteSpent(com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Response.MarketOrderList getMarketOrderByAccount(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.MarketOrder getMarketOrderById(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.MarketPriceList getMarketPriceByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.MarketOrderList getMarketOrderListByPair(com.github.comrada.tron4j.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.MarketOrderPairList getMarketPairList(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.github.comrada.tron4j.proto.Chain.Transaction getTransactionSign(com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention getTransactionSign2(com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.EasyTransferResponse easyTransferAsset(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.EasyTransferResponse easyTransferAssetByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.EasyTransferResponse easyTransfer(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.EasyTransferResponse easyTransferByPrivate(com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage createAddress(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage generateAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.proto.Response.TransactionExtention addSign(com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage getSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage getAkFromAsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage getNkFromNsk(com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage getDiversifier(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage getZenPaymentAddress(com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage getRcm(com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.comrada.tron4j.api.GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionReturn> broadcastTransaction(
        com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> createCommonTransaction(
        com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> createAccount(
        com.github.comrada.tron4j.proto.Contract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> createAccount2(
        com.github.comrada.tron4j.proto.Contract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> updateAccount(
        com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateAccount2(
        com.github.comrada.tron4j.proto.Contract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> setAccountId(
        com.github.comrada.tron4j.proto.Contract.SetAccountIdContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> accountPermissionUpdate(
        com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> createTransaction(
        com.github.comrada.tron4j.proto.Contract.TransferContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> createTransaction2(
        com.github.comrada.tron4j.proto.Contract.TransferContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> createAssetIssue(
        com.github.comrada.tron4j.proto.Contract.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> createAssetIssue2(
        com.github.comrada.tron4j.proto.Contract.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> updateAsset(
        com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateAsset2(
        com.github.comrada.tron4j.proto.Contract.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> transferAsset(
        com.github.comrada.tron4j.proto.Contract.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> transferAsset2(
        com.github.comrada.tron4j.proto.Contract.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> participateAssetIssue(
        com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> participateAssetIssue2(
        com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> unfreezeAsset(
        com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> unfreezeAsset2(
        com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> createWitness(
        com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> createWitness2(
        com.github.comrada.tron4j.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> updateWitness(
        com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateWitness2(
        com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateBrokerage(
        com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> voteWitnessAccount(
        com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> voteWitnessAccount2(
        com.github.comrada.tron4j.proto.Contract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> freezeBalance(
        com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> freezeBalance2(
        com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> unfreezeBalance(
        com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> unfreezeBalance2(
        com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> withdrawBalance(
        com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> withdrawBalance2(
        com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> proposalCreate(
        com.github.comrada.tron4j.proto.Contract.ProposalCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> proposalApprove(
        com.github.comrada.tron4j.proto.Contract.ProposalApproveContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> proposalDelete(
        com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> deployContract(
        com.github.comrada.tron4j.proto.Contract.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateSetting(
        com.github.comrada.tron4j.proto.Contract.UpdateSettingContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> updateEnergyLimit(
        com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> clearContractABI(
        com.github.comrada.tron4j.proto.Contract.ClearABIContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> triggerContract(
        com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> triggerConstantContract(
        com.github.comrada.tron4j.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> exchangeCreate(
        com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> exchangeInject(
        com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> exchangeWithdraw(
        com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> exchangeTransaction(
        com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> marketSellAsset(
        com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> marketCancelOrder(
        com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.NodeInfo> getNodeInfo(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.NodeList> listNodes(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.ChainParameters> getChainParameters(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> totalTransaction(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getNextMaintenanceTime(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionSignWeight> getTransactionSignWeight(
        com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionApprovedList> getTransactionApprovedList(
        com.github.comrada.tron4j.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.Account> getAccount(
        com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.Account> getAccountById(
        com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AccountNetMessage> getAccountNet(
        com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AccountResourceMessage> getAccountResource(
        com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AssetIssueList> getAssetIssueByAccount(
        com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getAssetIssueByName(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AssetIssueList> getAssetIssueListByName(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Contract.AssetIssueContract> getAssetIssueById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AssetIssueList> getAssetIssueList(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AssetIssueList> getPaginatedAssetIssueList(
        com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Block> getNowBlock(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockExtention> getNowBlock2(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Block> getBlockByNum(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockExtention> getBlockByNum2(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Block> getBlockById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockList> getBlockByLimitNext(
        com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockListExtention> getBlockByLimitNext2(
        com.github.comrada.tron4j.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockList> getBlockByLatestNum(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.BlockListExtention> getBlockByLatestNum2(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> getTransactionById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionInfo> getTransactionInfoById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionInfoList> getTransactionInfoByBlockNum(
        com.github.comrada.tron4j.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Common.SmartContract> getContract(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper> getContractInfo(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.WitnessList> listWitnesses(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getBrokerageInfo(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage> getRewardInfo(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.DelegatedResourceList> getDelegatedResource(
        com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.ProposalList> listProposals(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.Proposal> getProposalById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.ProposalList> getPaginatedProposalList(
        com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.ExchangeList> listExchanges(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.Exchange> getExchangeById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.ExchangeList> getPaginatedExchangeList(
        com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.NullifierResult> isShieldedTRC20ContractNoteSpent(
        com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.MarketOrderList> getMarketOrderByAccount(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.MarketOrder> getMarketOrderById(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.MarketPriceList> getMarketPriceByPair(
        com.github.comrada.tron4j.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.MarketOrderList> getMarketOrderListByPair(
        com.github.comrada.tron4j.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.MarketOrderPairList> getMarketPairList(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Chain.Transaction> getTransactionSign(
        com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> getTransactionSign2(
        com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> easyTransferAsset(
        com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> easyTransferAssetByPrivate(
        com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> easyTransfer(
        com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.EasyTransferResponse> easyTransferByPrivate(
        com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> createAddress(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage> generateAddress(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.proto.Response.TransactionExtention> addSign(
        com.github.comrada.tron4j.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getSpendingKey(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getAkFromAsk(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getNkFromNsk(
        com.github.comrada.tron4j.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage> getDiversifier(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getRcm(
        com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BROADCAST_TRANSACTION = 0;
  private static final int METHODID_CREATE_COMMON_TRANSACTION = 1;
  private static final int METHODID_CREATE_ACCOUNT = 2;
  private static final int METHODID_CREATE_ACCOUNT2 = 3;
  private static final int METHODID_UPDATE_ACCOUNT = 4;
  private static final int METHODID_UPDATE_ACCOUNT2 = 5;
  private static final int METHODID_SET_ACCOUNT_ID = 6;
  private static final int METHODID_ACCOUNT_PERMISSION_UPDATE = 7;
  private static final int METHODID_CREATE_TRANSACTION = 8;
  private static final int METHODID_CREATE_TRANSACTION2 = 9;
  private static final int METHODID_CREATE_ASSET_ISSUE = 10;
  private static final int METHODID_CREATE_ASSET_ISSUE2 = 11;
  private static final int METHODID_UPDATE_ASSET = 12;
  private static final int METHODID_UPDATE_ASSET2 = 13;
  private static final int METHODID_TRANSFER_ASSET = 14;
  private static final int METHODID_TRANSFER_ASSET2 = 15;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE = 16;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE2 = 17;
  private static final int METHODID_UNFREEZE_ASSET = 18;
  private static final int METHODID_UNFREEZE_ASSET2 = 19;
  private static final int METHODID_CREATE_WITNESS = 20;
  private static final int METHODID_CREATE_WITNESS2 = 21;
  private static final int METHODID_UPDATE_WITNESS = 22;
  private static final int METHODID_UPDATE_WITNESS2 = 23;
  private static final int METHODID_UPDATE_BROKERAGE = 24;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT = 25;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT2 = 26;
  private static final int METHODID_FREEZE_BALANCE = 27;
  private static final int METHODID_FREEZE_BALANCE2 = 28;
  private static final int METHODID_UNFREEZE_BALANCE = 29;
  private static final int METHODID_UNFREEZE_BALANCE2 = 30;
  private static final int METHODID_WITHDRAW_BALANCE = 31;
  private static final int METHODID_WITHDRAW_BALANCE2 = 32;
  private static final int METHODID_PROPOSAL_CREATE = 33;
  private static final int METHODID_PROPOSAL_APPROVE = 34;
  private static final int METHODID_PROPOSAL_DELETE = 35;
  private static final int METHODID_DEPLOY_CONTRACT = 36;
  private static final int METHODID_UPDATE_SETTING = 37;
  private static final int METHODID_UPDATE_ENERGY_LIMIT = 38;
  private static final int METHODID_CLEAR_CONTRACT_ABI = 39;
  private static final int METHODID_TRIGGER_CONTRACT = 40;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 41;
  private static final int METHODID_EXCHANGE_CREATE = 42;
  private static final int METHODID_EXCHANGE_INJECT = 43;
  private static final int METHODID_EXCHANGE_WITHDRAW = 44;
  private static final int METHODID_EXCHANGE_TRANSACTION = 45;
  private static final int METHODID_MARKET_SELL_ASSET = 46;
  private static final int METHODID_MARKET_CANCEL_ORDER = 47;
  private static final int METHODID_GET_NODE_INFO = 48;
  private static final int METHODID_LIST_NODES = 49;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 50;
  private static final int METHODID_TOTAL_TRANSACTION = 51;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 52;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 53;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 54;
  private static final int METHODID_GET_ACCOUNT = 55;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 56;
  private static final int METHODID_GET_ACCOUNT_NET = 57;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 58;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 59;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 60;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 61;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 62;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 63;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 64;
  private static final int METHODID_GET_NOW_BLOCK = 65;
  private static final int METHODID_GET_NOW_BLOCK2 = 66;
  private static final int METHODID_GET_BLOCK_BY_NUM = 67;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 68;
  private static final int METHODID_GET_BLOCK_BY_ID = 69;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 70;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 71;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 72;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 73;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 74;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 75;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 76;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 77;
  private static final int METHODID_GET_CONTRACT = 78;
  private static final int METHODID_GET_CONTRACT_INFO = 79;
  private static final int METHODID_LIST_WITNESSES = 80;
  private static final int METHODID_GET_BROKERAGE_INFO = 81;
  private static final int METHODID_GET_REWARD_INFO = 82;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 83;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 84;
  private static final int METHODID_LIST_PROPOSALS = 85;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 86;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 87;
  private static final int METHODID_LIST_EXCHANGES = 88;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 89;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 90;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 91;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 92;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 93;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 94;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 95;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 96;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 97;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 98;
  private static final int METHODID_GET_TRANSACTION_SIGN = 99;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 100;
  private static final int METHODID_EASY_TRANSFER_ASSET = 101;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 102;
  private static final int METHODID_EASY_TRANSFER = 103;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 104;
  private static final int METHODID_CREATE_ADDRESS = 105;
  private static final int METHODID_GENERATE_ADDRESS = 106;
  private static final int METHODID_ADD_SIGN = 107;
  private static final int METHODID_GET_SPENDING_KEY = 108;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 109;
  private static final int METHODID_GET_AK_FROM_ASK = 110;
  private static final int METHODID_GET_NK_FROM_NSK = 111;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 112;
  private static final int METHODID_GET_DIVERSIFIER = 113;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 114;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 115;
  private static final int METHODID_GET_RCM = 116;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 117;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 118;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 119;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((com.github.comrada.tron4j.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionReturn>) responseObserver);
          break;
        case METHODID_CREATE_COMMON_TRANSACTION:
          serviceImpl.createCommonTransaction((com.github.comrada.tron4j.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((com.github.comrada.tron4j.proto.Contract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT2:
          serviceImpl.createAccount2((com.github.comrada.tron4j.proto.Contract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((com.github.comrada.tron4j.proto.Contract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT2:
          serviceImpl.updateAccount2((com.github.comrada.tron4j.proto.Contract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_ID:
          serviceImpl.setAccountId((com.github.comrada.tron4j.proto.Contract.SetAccountIdContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_ACCOUNT_PERMISSION_UPDATE:
          serviceImpl.accountPermissionUpdate((com.github.comrada.tron4j.proto.Contract.AccountPermissionUpdateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((com.github.comrada.tron4j.proto.Contract.TransferContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION2:
          serviceImpl.createTransaction2((com.github.comrada.tron4j.proto.Contract.TransferContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE:
          serviceImpl.createAssetIssue((com.github.comrada.tron4j.proto.Contract.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE2:
          serviceImpl.createAssetIssue2((com.github.comrada.tron4j.proto.Contract.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((com.github.comrada.tron4j.proto.Contract.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET2:
          serviceImpl.updateAsset2((com.github.comrada.tron4j.proto.Contract.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET:
          serviceImpl.transferAsset((com.github.comrada.tron4j.proto.Contract.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET2:
          serviceImpl.transferAsset2((com.github.comrada.tron4j.proto.Contract.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE:
          serviceImpl.participateAssetIssue((com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE2:
          serviceImpl.participateAssetIssue2((com.github.comrada.tron4j.proto.Contract.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET:
          serviceImpl.unfreezeAsset((com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET2:
          serviceImpl.unfreezeAsset2((com.github.comrada.tron4j.proto.Contract.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS:
          serviceImpl.createWitness((com.github.comrada.tron4j.proto.Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((com.github.comrada.tron4j.proto.Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS:
          serviceImpl.updateWitness((com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS2:
          serviceImpl.updateWitness2((com.github.comrada.tron4j.proto.Contract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_BROKERAGE:
          serviceImpl.updateBrokerage((com.github.comrada.tron4j.proto.Contract.UpdateBrokerageContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT:
          serviceImpl.voteWitnessAccount((com.github.comrada.tron4j.proto.Contract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT2:
          serviceImpl.voteWitnessAccount2((com.github.comrada.tron4j.proto.Contract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE:
          serviceImpl.freezeBalance((com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE2:
          serviceImpl.freezeBalance2((com.github.comrada.tron4j.proto.Contract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE:
          serviceImpl.unfreezeBalance((com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE2:
          serviceImpl.unfreezeBalance2((com.github.comrada.tron4j.proto.Contract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE:
          serviceImpl.withdrawBalance((com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((com.github.comrada.tron4j.proto.Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_CREATE:
          serviceImpl.proposalCreate((com.github.comrada.tron4j.proto.Contract.ProposalCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_APPROVE:
          serviceImpl.proposalApprove((com.github.comrada.tron4j.proto.Contract.ProposalApproveContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_DELETE:
          serviceImpl.proposalDelete((com.github.comrada.tron4j.proto.Contract.ProposalDeleteContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((com.github.comrada.tron4j.proto.Contract.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_SETTING:
          serviceImpl.updateSetting((com.github.comrada.tron4j.proto.Contract.UpdateSettingContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ENERGY_LIMIT:
          serviceImpl.updateEnergyLimit((com.github.comrada.tron4j.proto.Contract.UpdateEnergyLimitContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_CLEAR_CONTRACT_ABI:
          serviceImpl.clearContractABI((com.github.comrada.tron4j.proto.Contract.ClearABIContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((com.github.comrada.tron4j.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((com.github.comrada.tron4j.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_CREATE:
          serviceImpl.exchangeCreate((com.github.comrada.tron4j.proto.Contract.ExchangeCreateContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_INJECT:
          serviceImpl.exchangeInject((com.github.comrada.tron4j.proto.Contract.ExchangeInjectContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_WITHDRAW:
          serviceImpl.exchangeWithdraw((com.github.comrada.tron4j.proto.Contract.ExchangeWithdrawContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_TRANSACTION:
          serviceImpl.exchangeTransaction((com.github.comrada.tron4j.proto.Contract.ExchangeTransactionContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_SELL_ASSET:
          serviceImpl.marketSellAsset((com.github.comrada.tron4j.proto.Contract.MarketSellAssetContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_CANCEL_ORDER:
          serviceImpl.marketCancelOrder((com.github.comrada.tron4j.proto.Contract.MarketCancelOrderContract) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeInfo>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NodeList>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ChainParameters>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((com.github.comrada.tron4j.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((com.github.comrada.tron4j.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((com.github.comrada.tron4j.api.GrpcAPI.AccountIdMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((com.github.comrada.tron4j.api.GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((com.github.comrada.tron4j.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((com.github.comrada.tron4j.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((com.github.comrada.tron4j.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Common.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.WitnessList>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((com.github.comrada.tron4j.proto.Response.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Proposal>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.Exchange>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((com.github.comrada.tron4j.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((com.github.comrada.tron4j.api.GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((com.github.comrada.tron4j.api.GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((com.github.comrada.tron4j.api.GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.NullifierResult>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((com.github.comrada.tron4j.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((com.github.comrada.tron4j.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.MarketOrderPairList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((com.github.comrada.tron4j.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((com.github.comrada.tron4j.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((com.github.comrada.tron4j.api.GrpcAPI.EasyTransferAssetByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((com.github.comrada.tron4j.api.GrpcAPI.EasyTransferMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((com.github.comrada.tron4j.api.GrpcAPI.EasyTransferByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((com.github.comrada.tron4j.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((com.github.comrada.tron4j.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((com.github.comrada.tron4j.api.GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((com.github.comrada.tron4j.api.GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((com.github.comrada.tron4j.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((com.github.comrada.tron4j.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((com.github.comrada.tron4j.api.GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<com.github.comrada.tron4j.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.comrada.tron4j.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getCreateCommonTransactionMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getCreateAccount2Method())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getUpdateAccount2Method())
              .addMethod(getSetAccountIdMethod())
              .addMethod(getAccountPermissionUpdateMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateTransaction2Method())
              .addMethod(getCreateAssetIssueMethod())
              .addMethod(getCreateAssetIssue2Method())
              .addMethod(getUpdateAssetMethod())
              .addMethod(getUpdateAsset2Method())
              .addMethod(getTransferAssetMethod())
              .addMethod(getTransferAsset2Method())
              .addMethod(getParticipateAssetIssueMethod())
              .addMethod(getParticipateAssetIssue2Method())
              .addMethod(getUnfreezeAssetMethod())
              .addMethod(getUnfreezeAsset2Method())
              .addMethod(getCreateWitnessMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getUpdateWitnessMethod())
              .addMethod(getUpdateWitness2Method())
              .addMethod(getUpdateBrokerageMethod())
              .addMethod(getVoteWitnessAccountMethod())
              .addMethod(getVoteWitnessAccount2Method())
              .addMethod(getFreezeBalanceMethod())
              .addMethod(getFreezeBalance2Method())
              .addMethod(getUnfreezeBalanceMethod())
              .addMethod(getUnfreezeBalance2Method())
              .addMethod(getWithdrawBalanceMethod())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getProposalCreateMethod())
              .addMethod(getProposalApproveMethod())
              .addMethod(getProposalDeleteMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getUpdateSettingMethod())
              .addMethod(getUpdateEnergyLimitMethod())
              .addMethod(getClearContractABIMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getExchangeCreateMethod())
              .addMethod(getExchangeInjectMethod())
              .addMethod(getExchangeWithdrawMethod())
              .addMethod(getExchangeTransactionMethod())
              .addMethod(getMarketSellAssetMethod())
              .addMethod(getMarketCancelOrderMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getGetTransactionSignMethod())
              .addMethod(getGetTransactionSign2Method())
              .addMethod(getEasyTransferAssetMethod())
              .addMethod(getEasyTransferAssetByPrivateMethod())
              .addMethod(getEasyTransferMethod())
              .addMethod(getEasyTransferByPrivateMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGenerateAddressMethod())
              .addMethod(getAddSignMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
