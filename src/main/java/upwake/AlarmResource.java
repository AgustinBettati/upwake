package upwake;

import upwake.services.AlarmService;
import upwake.structures.Alarm;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 13/08/2017.
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("alarms")
public class AlarmResource {

    private AlarmService service = new AlarmService();

    @GET
    @Path("/{alarmID}")
    public Alarm getAlarm(@PathParam("alarmID")long id){
        return service.getAlarm(id);
    }

    @GET
    public List<Alarm> getAlarms(){
        return service.getAlarms();
    }

    @GET
    public List<Alarm> filterByHour(@QueryParam("hour")int hour, @QueryParam("min") int min){
        if( hour != 0 && min != 0) return service.filterAlarms(a -> a.getHour() == hour && a.getMin() == min);
        else return service.getActiveAlarms();
    }

    @PUT
    @Path("/{alarmID}")
    public Alarm updateAlarm(@PathParam("alarmID")long id, Alarm alarm){
        alarm.setId(id);
        return service.updateAlarm(alarm);
    }

    @POST
    public Alarm addAlarm(Alarm alarm){
        return service.addAlarm(alarm);
    }

    @DELETE
    @Path("/{alarmID}")
    public void deleteAlarm(@PathParam("alarmID")long id){
        service.deleteAlarm(id);
    }
}
