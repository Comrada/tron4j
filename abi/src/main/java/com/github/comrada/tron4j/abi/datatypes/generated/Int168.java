package com.github.comrada.tron4j.abi.datatypes.generated;

import com.github.comrada.tron4j.abi.datatypes.Int;
import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int168 extends Int {
    public static final Int168 DEFAULT = new Int168(BigInteger.ZERO);

    public Int168(BigInteger value) {
        super(168, value);
    }

    public Int168(long value) {
        this(BigInteger.valueOf(value));
    }
}
