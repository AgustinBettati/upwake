package upwake.services;

import upwake.structures.Alarm;
import upwake.structures.PhotonReading;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
public class AnalyticsService {

    public List<PhotonReading> getReadings(){return UpwakeDB.getReadings();}

    public List<PhotonReading> filterReadings(Predicate<PhotonReading> cond){
        return UpwakeDB.getReadings().stream()
                .filter(cond)
                .collect(Collectors.toList());
    }

    public void addReading(PhotonReading reading){
        UpwakeDB.addReading(reading);
    }

    public void addAlarm(Alarm alarm){
        UpwakeDB.addAlarm(alarm);
    }

}
