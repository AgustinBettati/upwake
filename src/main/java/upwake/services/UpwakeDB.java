package upwake.services;

import upwake.structures.Alarm;
import upwake.structures.PhotonReading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
public class UpwakeDB {
    private static Map<Long, PhotonReading> readings = new HashMap<>();
    private static Map<Long, Alarm> alarms = new HashMap<>();

    public static Map<Long, PhotonReading> getReadings() {
        return readings;
    }

    public static Map<Long, Alarm> getAlarms() {
        return alarms;
    }

    public static PhotonReading addReading(PhotonReading reading){
        reading.setId(readings.size() + 1);
        readings.put(reading.getId(),reading);
        return reading;
    }

    public static Alarm addAlarm(Alarm alarm){
        alarm.setId(alarms.size() + 1);
        alarms.put(alarm.getId(),alarm);
        return alarm;
    }

    public static Alarm updateAlarm(Alarm alarm){
        alarms.put(alarm.getId(),alarm);
        return alarm;
    }

    public static void removeAlarm(long id){
        alarms.remove(id);
    }
}

