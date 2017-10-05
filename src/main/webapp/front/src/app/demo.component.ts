import {Component} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'demo',
  template: `
  <div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-8">
    <button (click)="alert();">
          Turn on LED
      </button>
    
    </div>
    <div class="col-sm-2"></div>
  </div>
  `,
  styleUrls: ['./app.component.css']
})

export class DemoComponent {

  alert(): void{
    this.http.post<any>('https://api.particle.io/v1/devices/300037001647343337363432/alarm?access_token=461d04082f5703bce5d87efa4d905fe2e856b7f4&args=40','')
  }
  constructor(private http: HttpClient){
  }

}
