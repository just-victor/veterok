package net.wind.anemometr.light.service;

import lombok.RequiredArgsConstructor;
import net.wind.anemometr.dto.StateDto;
import net.wind.anemometr.light.dto.LightStateDto;
import net.wind.anemometr.light.mapper.LightStateMapper;
import net.wind.anemometr.service.StateService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LightStateServiceWrapper {
    private final StateService stateService;
    private final LightStateMapper stateMapper;

    public StateDto addCurrentState(final LightStateDto lightStateDto) {
        StateDto stateDto = stateMapper.lightDtoToDto(lightStateDto);
        return stateService.addCurrentState(stateDto);
    }
}
