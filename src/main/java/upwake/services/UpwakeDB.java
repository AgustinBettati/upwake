package upwake.services;

import upwake.structures.Alarm;
import upwake.structures.PhotonReading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
public class UpwakeDB {
    private static List<PhotonReading> readings = new ArrayList<>();
    private static List<Alarm> alarms = new ArrayList<>();

    public static List<PhotonReading> getReadings() {
        return readings;
    }

    public static List<Alarm> getAlarms() {
        return alarms;
    }

    public static void addReading(PhotonReading reading){
        reading.setId(readings.size() + 1);
        readings.add(reading);
    }

    public static void addAlarm(Alarm alarm){
        alarm.setId(alarms.size() + 1);
        alarms.add(alarm);
    }
}

