
import {Component, OnInit} from "@angular/core";

import {Alarm} from "./alarm";
import {AlarmService} from "./alarm.service";

@Component({
  selector: 'dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit{

  alarms: Alarm[] = [];
  selectedAlarm: Alarm;

  constructor(private alarmService: AlarmService) {}

  ngOnInit(): void {
    this.alarmService.getAlarms().then(alarms => this.alarms  = alarms);
  }

  onSelect(alarm: Alarm): void {
    this.selectedAlarm = alarm;
  }

  handleDeleteSubmit(alarm: Alarm): void {
    console.log("The Alarm " + alarm.hour + " will be deleted");
    this.selectedAlarm = null;
    this.alarmService.deleteAlarm(alarm.id);

  }
  add(hour: number, minute: number): void {
    this.alarmService.create(hour, minute);
      // .then(alarm => {
      //   this.alarms.push(alarm);
      //   //this.selectedHero = null;
      // });
  }

}
