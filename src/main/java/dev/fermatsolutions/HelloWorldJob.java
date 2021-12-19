package dev.fermatsolutions;

import io.micronaut.context.annotation.Requires;
import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Singleton
@Slf4j
@Requires(notEnv = "test")
public class HelloWorldJob {

    @Scheduled(fixedDelay = "10s")
    void executeEveryTen() {
        log.info("Simple Job every 10 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                .format(new Date()));
    }

    @Scheduled(fixedDelay = "30s", initialDelay = "5s")
    void executeEveryThirty() {
        log.info("Simple Job every 30 seconds: {}", new SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                .format(new Date()));
    }
}
