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
public class StaticArray18<T extends Type> extends StaticArray<T> {
    @Deprecated
    public StaticArray18(List<T> values) {
        super(18, values);
    }

    @Deprecated
    @SafeVarargs
    public StaticArray18(T... values) {
        super(18, values);
    }

    public StaticArray18(Class<T> type, List<T> values) {
        super(type, 18, values);
    }

    @SafeVarargs
    public StaticArray18(Class<T> type, T... values) {
        super(type, 18, values);
    }
}
