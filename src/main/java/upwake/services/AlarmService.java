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
public class AlarmService {
    private static List<Alarm> alarms = UpwakeDB.getAlarms();

    public List<Alarm> getAlarms(){return alarms;}

    public List<Alarm> filterAlarms(Predicate<Alarm> cond){
        return alarms.stream()
                .filter(cond)
                .collect(Collectors.toList());
    }
}
