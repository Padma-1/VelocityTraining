import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  //properties
  serverID:number=10;
  serverStatus:string='OnLine';
  mainServer:boolean=true;

  name:string = 'Padma U';
  age:number=20;
  salary:number=50000;

  firstName:string='Padma';
  lastName:string='U';

  imagePath:string="https://akm-img-a-in.tosshub.com/indiatoday/images/story/201307/wipro_660_071913035442.jpg";

  constructor() { }

  ngOnInit(): void {
  }

  getFullName():string{
    return this.firstName+' '+this.lastName;
  }
 
  convertToDate(){
    const date = new Date();
    return date.toLocaleDateString();
  }

}
