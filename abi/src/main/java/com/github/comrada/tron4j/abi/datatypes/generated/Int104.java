package com.github.comrada.tron4j.abi.datatypes.generated;

import com.github.comrada.tron4j.abi.datatypes.Int;
import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int104 extends Int {
    public static final Int104 DEFAULT = new Int104(BigInteger.ZERO);

    public Int104(BigInteger value) {
        super(104, value);
    }

    public Int104(long value) {
        this(BigInteger.valueOf(value));
    }
}
