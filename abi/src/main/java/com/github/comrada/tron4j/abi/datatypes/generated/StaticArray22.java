package com.github.comrada.tron4j.abi.datatypes.generated;

import com.github.comrada.tron4j.abi.datatypes.StaticArray;
import com.github.comrada.tron4j.abi.datatypes.Type;
import java.util.List;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.github.comrada.tron4j.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class StaticArray22<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray22(List<T> values) {
        super(22, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray22(T... values) {
        super(22, values);
    }

    public StaticArray22(Class<T> type, List<T> values) {
        super(type, 22, values);
    }

    @SafeVarargs
    public StaticArray22(Class<T> type, T... values) {
        super(type, 22, values);
    }
}
