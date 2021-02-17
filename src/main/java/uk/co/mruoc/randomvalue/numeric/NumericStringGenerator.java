package uk.co.mruoc.randomvalue.numeric;

import java.util.function.IntFunction;

public interface NumericStringGenerator extends IntFunction<String> {

    default String generate(int length) {
        return apply(length);
    }

}
