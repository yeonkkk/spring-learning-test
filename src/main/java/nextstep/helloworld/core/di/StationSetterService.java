package nextstep.helloworld.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationSetterService {
    private StationRepository stationRepository;

    public String sayHi() {
        return stationRepository.sayHi();
    }

    @Autowired
    public void setStationRepository(final StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }
}
