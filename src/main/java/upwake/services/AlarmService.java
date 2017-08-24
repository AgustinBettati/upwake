package upwake.services;

import upwake.structures.Alarm;
import upwake.structures.PhotonReading;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
public class AlarmService {

    public List<Alarm> filterAlarms(Predicate<Alarm> cond){
        return UpwakeDB.getAlarms().values().stream()
                                            .filter(cond)
                                            .collect(Collectors.toList());
    }

    public Alarm getAlarm(long id){return UpwakeDB.getAlarms().get(id);}

    public List<Alarm> getAlarms(){
        return new ArrayList<>(UpwakeDB.getAlarms().values());
    }

    public List<Alarm> getActiveAlarms(){
        return UpwakeDB.getAlarms().values().stream()
                                            .filter(Alarm::isActive)
                                            .collect(Collectors.toList());
    }

    public Alarm addAlarm(Alarm alarm){
        return UpwakeDB.addAlarm(alarm);
    }

    public Alarm updateAlarm(Alarm alarm){
        return UpwakeDB.getAlarms().put(alarm.getId(),alarm);
    }

    public void deleteAlarm(long id){
        UpwakeDB.getAlarms().remove(id);
    }
}
