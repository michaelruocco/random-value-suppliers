package uk.co.mruoc.randomvalue.numeric;

import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
public class FixedLengthNumericStringGenerator implements Supplier<String> {

    private final NumericStringGenerator generator;
    private final int length;

    public String generate() {
        return get();
    }

    @Override
    public String get() {
        return generator.generate(length);
    }

}
