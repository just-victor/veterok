package net.wind.anemometr.light.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LightStateDto {
    private Double min;
    private Double max;
    private Double avg;
    private Instant time;
}
