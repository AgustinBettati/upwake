package upwake;

import upwake.services.AnalyticsService;
import upwake.structures.PhotonReading;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.time.LocalTime;
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
        //TODO handle arguments as 0 ; If not passed, QueryParam sets to 0
        LocalDate filterDate = LocalDate.of(year,month,day);
        return service.filterReadings(t -> t.getDate().equals(filterDate));
    }
}
