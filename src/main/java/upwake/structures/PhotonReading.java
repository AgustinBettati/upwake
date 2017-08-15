package upwake.structures;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
@XmlRootElement
public class PhotonReading {
    private double heat;
    private double humidity;
    private double giro;
    private double pressure;
    private LocalDate date;
    private LocalTime time;
    private long id;

    public PhotonReading(double heat, double humidity, double giro, double pressure) {
        this.heat = heat;
        this.humidity = humidity;
        this.giro = giro;
        this.pressure = pressure;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public double getHeat() {
        return heat;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getGiro() {
        return giro;
    }

    public double getPressure() {
        return pressure;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
