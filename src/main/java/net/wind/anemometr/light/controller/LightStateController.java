package net.wind.anemometr.light.controller;


import lombok.RequiredArgsConstructor;
import net.wind.anemometr.light.dto.LightStateDto;
import net.wind.anemometr.light.service.LightStateServiceWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/light/devices/{deviceId}/states")
@RequiredArgsConstructor
public class LightStateController {
    private final LightStateServiceWrapper stateService;

    @PostMapping
    public ResponseEntity addCurrentState(@RequestBody final LightStateDto stateDto) {
        stateService.addCurrentState(stateDto);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
