import {Component} from "@angular/core";
import {Http} from "@angular/http";

@Component({
  selector: 'about',
  template: `
  <div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-8">
    <p>Aca va un parrafo cortito explicado de que se trata UpWake, y las tecnologias
    con la cual es implementada.</p>
    </div>
    <div class="col-sm-2"></div>
  </div>
  `,
  styleUrls: ['./app.component.css']
})

export class AboutComponent {

}
