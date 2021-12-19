package dev.fermatsolutions;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


@MicronautTest
public class TeamConfigurationTest {

    @Test
    void testTeamConfiguration() {
        val names = Arrays.asList("JD Singh", "Misha Preet Kaur");
        Map<String, Object> items = new HashMap<>();
        items.put("team.name", "5100");
        items.put("team.color", "blue");
        items.put("team.coach", names);

        val ctx = ApplicationContext.run(items);
        val teamConfiguration = ctx.getBean(TeamConfiguration.class);

        assertEquals("5100", teamConfiguration.getName());
        assertEquals("blue", teamConfiguration.getColor());

        ctx.close();
    }
}
