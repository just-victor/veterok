package net.wind.anemometr.light.mapper;

import net.wind.anemometr.dto.StateDto;
import net.wind.anemometr.light.dto.LightStateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface LightStateMapper {
    @Mapping(target = "windSpeedMin", source = "min" )
    @Mapping(target = "windSpeedMax", source = "max" )
    @Mapping(target = "windSpeedAvg", source = "avg" )
    @Mapping(target = "stateTime", source = "time" )
    StateDto lightDtoToDto(LightStateDto lightStateDto);
}
