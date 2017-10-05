
import {Component} from "@angular/core";
import {AlarmService} from "./alarm.service";

@Component({
  selector: 'my-app',
  template: `
    <ul class="nav nav-tabs" >
      <a class="navbar-brand" >UpWake</a>
      <li class="nav-item">
        <a class="nav-link" routerLink="/dashboard">Alarms</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" routerLink="/demo">Demo</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" routerLink="/about">About</a>
      </li>
      
    </ul>
    
    <router-outlet></router-outlet>
  `,
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'UpWake';

  constructor(private alarmService: AlarmService) {}

  ngOnInit() {
    let time = new Date();
    this.alarmService.setUpAlarms(time);
  }

}
