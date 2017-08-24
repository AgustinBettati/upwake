package upwake;

import upwake.services.AnalyticsService;
import upwake.structures.PhotonReading;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.List;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("analytics")
public class AnalyticsResource {

    private AnalyticsService service = new AnalyticsService();

    @GET
    public List<PhotonReading> getReadings(){return service.getReadings();}

    @GET
    @Path("/{id}")
    public List<PhotonReading> getReading(@PathParam("id") long id){
        return service.filterReadings(t -> t.getId() == id);
    }

    @GET
    public List<PhotonReading> filterReading(@QueryParam("day")int day,@QueryParam("month")int month,@QueryParam("year")int year){
        if(day != 0 && month != 0 && year != 0) return service.filterReadings(t -> t.getDate().equals(LocalDate.of(year,month,day)));
        if(day == 0 && month != 0 && year != 0) return service.filterReadings(t -> t.getDate().getYear() == year && t.getDate().getMonth().equals(Month.of(month)));
        if(day == 0 && month == 0 && year != 0) return service.filterReadings(t -> t.getDate().getYear() == year);
        return service.getReadings();
    }

    @POST
    public PhotonReading addReading(PhotonReading reading){
        return service.addReading(reading);
    }
}
