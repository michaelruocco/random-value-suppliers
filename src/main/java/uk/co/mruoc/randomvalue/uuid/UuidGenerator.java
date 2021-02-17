package uk.co.mruoc.randomvalue.uuid;

import java.util.UUID;
import java.util.function.Supplier;

public interface UuidGenerator extends Supplier<UUID> {

    default UUID generate() {
        return get();
    }

}
