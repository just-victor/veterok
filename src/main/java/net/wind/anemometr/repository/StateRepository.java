package net.wind.anemometr.repository;

import net.wind.anemometr.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findAllByDeviceId(long deviceId);
}
