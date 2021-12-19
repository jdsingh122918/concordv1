package dev.fermatsolutions;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;

@Controller("/conferences")
@AllArgsConstructor
public class ConferenceController {

    private final ConferenceService conferenceService;

    @Get("/random")
    public Conference randomConference() {
        return conferenceService.randomConference();
    }
}
