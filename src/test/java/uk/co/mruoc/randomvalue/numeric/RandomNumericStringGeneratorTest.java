package uk.co.mruoc.randomvalue.numeric;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumericStringGeneratorTest {

    private final NumericStringGenerator generator = new RandomNumericStringGenerator();

    @ParameterizedTest(name = "should generate random numeric string of length {0}")
    @ValueSource(ints = {1, 3, 5, 8, 15})
    void shouldReturnStringWithRandomDigitsMatchingLength(int length) {
        String value = generator.generate(length);

        assertThat(value).containsOnlyDigits().hasSize(length);
    }

}
