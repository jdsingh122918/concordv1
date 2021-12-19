package dev.fermatsolutions;

import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Singleton
@Slf4j
public class EmailUseCase {

    void send(String user, String message) {
        log.info("Sending email to {}: {} at {}", user, message,
                new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date()));
    }
}
