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
    private int hour;
    private int min;
    private String soundURL;
    private long id;
    private boolean active;

    public Alarm(ArrayList<String> days, int hour, int min, String soundURL) {
        this.days = days;
        this.hour = hour;
        this.min = min;
        this.soundURL = soundURL;
        this.active = false;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public void setHour(int hour) {
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

    public void setMin(int min) {
        this.min = min;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
