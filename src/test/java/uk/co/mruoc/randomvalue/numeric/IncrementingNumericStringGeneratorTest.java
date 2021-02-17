package uk.co.mruoc.randomvalue.numeric;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncrementingNumericStringGeneratorTest {

    private final NumericStringGenerator generator = new IncrementingNumericStringGenerator();

    @Test
    void shouldReturnStringWithIncrementingDigitsMatchingLength() {
        int length = 8;

        assertThat(generator.generate(length)).isEqualTo("00000001");
        assertThat(generator.generate(length)).isEqualTo("00000002");
        assertThat(generator.generate(length)).isEqualTo("00000003");
    }

}
