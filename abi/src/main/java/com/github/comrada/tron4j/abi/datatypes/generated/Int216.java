package com.github.comrada.tron4j.abi.datatypes.generated;

import com.github.comrada.tron4j.abi.datatypes.Int;
import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int216 extends Int {
    public static final Int216 DEFAULT = new Int216(BigInteger.ZERO);

    public Int216(BigInteger value) {
        super(216, value);
    }

    public Int216(long value) {
        this(BigInteger.valueOf(value));
    }
}
