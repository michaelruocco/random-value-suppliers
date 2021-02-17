package uk.co.mruoc.randomvalue.numeric;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementingNumericStringGenerator implements NumericStringGenerator {

    private final AtomicInteger count = new AtomicInteger();

    @Override
    public String apply(int length) {
        return generateValueAndIncrementCounter(length);
    }

    private String generateValueAndIncrementCounter(int length) {
        String value = Integer.toString(count.incrementAndGet());
        return StringUtils.leftPad(value, length, "0");
    }

}
