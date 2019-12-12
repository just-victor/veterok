package net.wind.anemometr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

import static java.time.ZoneOffset.UTC;

@RestController
@RequestMapping("/service")
public class ServiceController {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(UTC);

    @GetMapping("/time")
    public String getCurrentTime() {
        return FORMATTER.format(Instant.now());
    }
}
