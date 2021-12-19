package dev.fermatsolutions;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@ConfigurationProperties("team")
@AllArgsConstructor
@Getter
@Setter
public class TeamConfiguration {

    private String name;
    private String color;
    private List<String> coach;
}
