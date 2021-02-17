package uk.co.mruoc.randomvalue.uuid;

import java.util.UUID;

public class RandomUuidGenerator implements UuidGenerator {

    @Override
    public UUID get() {
        return UUID.randomUUID();
    }

}
