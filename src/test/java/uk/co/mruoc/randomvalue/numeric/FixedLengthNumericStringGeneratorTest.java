package uk.co.mruoc.randomvalue.numeric;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class FixedLengthNumericStringGeneratorTest {

    private final int length = 8;
    private final NumericStringGenerator generator = mock(NumericStringGenerator.class);

    private final FixedLengthNumericStringGenerator fixedLengthGenerator = new FixedLengthNumericStringGenerator(generator, length);

    @Test
    void shouldReturnStringWithIncrementingDigitsMatchingLength() {
        String expectedValue = "12345678";
        given(generator.generate(length)).willReturn(expectedValue);

        String value = fixedLengthGenerator.generate();

        assertThat(value).isEqualTo(expectedValue);
    }

}
