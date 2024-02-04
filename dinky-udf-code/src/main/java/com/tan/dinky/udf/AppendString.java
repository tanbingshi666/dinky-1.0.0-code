package com.tan.dinky.udf;

import org.apache.flink.table.functions.ScalarFunction;

public class AppendString extends ScalarFunction {
    public String eval(String input, String append) {
        return input + append;
    }
}
