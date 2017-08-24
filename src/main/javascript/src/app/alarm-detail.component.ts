import {Component, Input} from '@angular/core';
import {Alarm} from "./alarm";

@Component({
  selector: 'alarm-detail',
  template: `
    <div *ngIf="alarm">
      <h2>Details of selected alarm</h2>
      <div>
      <label>Time is set to: </label>
        <input [(ngModel)]="alarm.hour" placeholder="hour"/>
         <input [(ngModel)]="alarm.minute" placeholder="minute"/>
      </div>
      
    </div>
  `
})
export class AlarmDetailComponent {

  @Input() alarm: Alarm;
}
