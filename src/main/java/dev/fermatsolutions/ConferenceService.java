package dev.fermatsolutions;

import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class ConferenceService {

    private static final List<Conference> CONFERENCES = Arrays.asList(
            new Conference("SpaceX"),
            new Conference("Tesla"),
            new Conference("Google IO"),
            new Conference("Apple WWDC")
    );

    public Conference randomConference() {
        return CONFERENCES.get(new Random().nextInt(CONFERENCES.size()));
    }
}
