package uk.co.mruoc.randomvalue.numeric;

import org.apache.commons.text.RandomStringGenerator;

import java.security.SecureRandom;

public class RandomNumericStringGenerator implements NumericStringGenerator {

    private final RandomStringGenerator randomDigitStringGenerator;

    public RandomNumericStringGenerator() {
        this.randomDigitStringGenerator = new RandomStringGenerator.Builder()
                .usingRandom(new SecureRandom()::nextInt)
                .selectFrom("0123456789".toCharArray())
                .build();
    }

    @Override
    public String apply(int length) {
        return randomDigitStringGenerator.generate(length);
    }

}
