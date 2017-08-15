package upwake.structures;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
@XmlRootElement
public class Alarm {
    private ArrayList<String> days;
    private LocalTime hour;
    private String soundURL;
    private long id;

    public Alarm(ArrayList<String> days, LocalTime hour, String soundURL) {
        this.days = days;
        this.hour = hour;
        this.soundURL = soundURL;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public String getSoundURL() {
        return soundURL;
    }

    public void setSoundURL(String soundURL) {
        this.soundURL = soundURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
