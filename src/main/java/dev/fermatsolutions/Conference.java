package dev.fermatsolutions;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Introspected
@Getter
@AllArgsConstructor
public class Conference {

    private final String name;
}
