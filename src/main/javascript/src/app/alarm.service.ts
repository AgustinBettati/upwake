import { Injectable } from '@angular/core';
import {Alarm} from "./alarm";

@Injectable()
export class AlarmService {


  public getAlarms(): Promise<Alarm[]> {
    // Aca se hace el request a la API.
    return Promise.resolve(alarms);
  }

  public create(hour: number, minute: number): Promise<Alarm> {
    //tener cuidado con lo del id.
    var newAlarm: Alarm = { id: 0, hour: hour, minute: minute};

    alarms.push(newAlarm);
    this.setUpAlarms(new Date);
    return Promise.resolve(newAlarm);
  }

  public getAlarm(id: number) {
    return this.getAlarms()
      .then(alarms => alarms.find(alarm => alarm.id === id));
  }

  public setUpAlarms(time: Date){
    this.clearAllTimers();
    this.getAlarms().then(alarms => alarms
       .filter(alarm => this.checkAlarm(alarm, time))
       .forEach(alarm => setTimeout(() => console.log("ALARM ALERT of "+ alarm.hour+":"+alarm.minute), this.getTime(alarm, time))));

  }

  public getTime(alarm: Alarm, currentTime: Date): number{
    console.log("Alarm: " + alarm.hour +":"+alarm.minute +",  actual time: " + currentTime.getHours() + ":" + currentTime.getMinutes());
    return (alarm.hour - currentTime.getHours())*3600000 + (alarm.minute - currentTime.getMinutes())*60000;
  }

  private clearAllTimers(): void{
    // Set a fake timeout to get the highest timeout id
    var highestTimeoutId = setTimeout(";");
    for (var i = 0 ; i < highestTimeoutId ; i++) {
      clearTimeout(i);
    }
  }

  private checkAlarm(alarm: Alarm, currentTime: Date): boolean{
    if (alarm.hour < currentTime.getHours()) {
      if(alarm.hour == currentTime.getHours()) {
        if (alarm.minute >= currentTime.getMinutes()) {
          return false;
        }
        return true;
      }
      return false;
    }
    return true;
  }
}

var alarms: Alarm[] = [
  { id: 2, hour: 21, minute: 39},
  { id: 3, hour: 21, minute: 40},
  { id: 4, hour: 3, minute: 50},
];

// create(name: string): Promise<Hero> {
//   return this.http
//     .post(this.heroesUrl, JSON.stringify({name: name}), {headers: this.headers})
//     .toPromise()
//     .then(res => res.json().data as Hero)
//     .catch(this.handleError);
// }

// getHeroes(): Promise<Hero[]> {
//   return this.http.get(this.heroesUrl)
//     .toPromise()
//     .then(response => response.json().data as Hero[])
//     .catch(this.handleError);
// }
//
// private handleError(error: any): Promise<any> {
//   console.error('An error occurred', error); // for demo purposes only
// return Promise.reject(error.message || error);
// }
