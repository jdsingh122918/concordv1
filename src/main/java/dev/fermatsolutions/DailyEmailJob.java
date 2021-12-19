package dev.fermatsolutions;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;

@Singleton
@AllArgsConstructor
public class DailyEmailJob {
    protected final EmailUseCase emailUseCase;

    @Scheduled(cron = "0 31 15 1/1 * ?")
    void execute() {
        emailUseCase.send("john.doe@micronaut.example", "Test Message");
    }
}
