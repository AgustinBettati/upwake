import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';


import { AppComponent } from './app.component';
import { DemoComponent } from './demo.component';
import {DashboardComponent} from "./dashboard.component";
import {AppRoutingModule} from "./app-routing.module";
import {AboutComponent} from "./about.component";
import {AlarmService} from "./alarm.service";
import {AlarmDetailComponent} from "./alarm-detail.component";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AboutComponent,
    AlarmDetailComponent,
    DemoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AlarmService],
  bootstrap: [AppComponent]
})
export class AppModule { }
