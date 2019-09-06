package net.wind.anemometr.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.Instant;

import static net.wind.anemometr.util.CommonUtils.truncate;

@Data
@NoArgsConstructor
public class StateDto {
    @JsonIgnore
    private Long deviceId;
    private Instant stateTime;
    private Double windSpeedMin;
    private Double windSpeedAvg;
    private Double windSpeedMax;
    private Integer windDirection;

    public void setStateTime(final Instant stateTime) {
        this.stateTime = truncate(stateTime);
    }
}
