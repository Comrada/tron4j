package com.github.comrada.tron4j.abi.datatypes.generated;

import com.github.comrada.tron4j.abi.datatypes.Int;
import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Int192 extends Int {
    public static final Int192 DEFAULT = new Int192(BigInteger.ZERO);

    public Int192(BigInteger value) {
        super(192, value);
    }

    public Int192(long value) {
        this(BigInteger.valueOf(value));
    }
}
