package uk.co.mruoc.randomvalue.uuid;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUuidGeneratorTest {

    private final UuidGenerator generator = new RandomUuidGenerator();

    @Test
    void shouldReturnRandomId() {
        UUID id1 = generator.generate();
        UUID id2 = generator.generate();

        assertThat(id1).isNotEqualTo(id2);
    }

}
