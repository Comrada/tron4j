package com.github.comrada.tron4j.abi.datatypes.generated;

import java.math.BigInteger;
import com.github.comrada.tron4j.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint32 extends Uint {
    public static final Uint32 DEFAULT = new Uint32(BigInteger.ZERO);

    public Uint32(BigInteger value) {
        super(32, value);
    }

    public Uint32(long value) {
        this(BigInteger.valueOf(value));
    }
}
