package dev.fermatsolutions;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class InfoTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    public void testGitCommitInfoAppearsInJson() {
        val httpRequest = HttpRequest.GET("/info");
        val response = httpClient.toBlocking()
                .exchange(httpRequest, Map.class);
        assertEquals(200, response.status().getCode());

        val body = response.body();
        assertNotNull(body.get("git"));
        assertNotNull(((Map) body.get("git")).get("commit"));
    }
}
