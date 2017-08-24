import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';

import { AppComponent } from './app.component';
import {DashboardComponent} from "./dashboard.component";
import {AppRoutingModule} from "./app-routing.module";
import {AboutComponent} from "./about.component";
import {AlarmService} from "./alarm.service";
import {AlarmDetailComponent} from "./alarm-detail.component";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,

    AboutComponent,
    AlarmDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [AlarmService],
  bootstrap: [AppComponent]
})
export class AppModule { }
