import {Component, Input} from '@angular/core';
import {Alarm} from "./alarm";
import {AlarmService} from "./alarm.service";
import { EventEmitter, Output } from "@angular/core";

@Component({
  selector: 'alarm-detail',
  template: `
    <div *ngIf="alarm">
      <h4>Details of selected alarm</h4>
      <br>
      <div>
        <label>Time is set to: </label>
        
        <input [(ngModel)]="alarm.hour" placeholder="hour"/>
        
        <input [(ngModel)]="alarm.minute" placeholder="minute"/>
        
      </div>
      <br>
      <button (click)="deleteAlarm();">
          Delete alarm
      </button>
     
    </div>
    <br>
  `
})

export class AlarmDetailComponent {

  @Input() alarm: Alarm;
  @Output() deleteSubmit$: EventEmitter<Alarm>;

  constructor(private alarmService: AlarmService) {
    this.deleteSubmit$ = new EventEmitter();
  }

  deleteAlarm(): void{
    this.deleteSubmit$.emit(this.alarm);
  }
}
