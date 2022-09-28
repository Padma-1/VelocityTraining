import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  a ='right';

  title:string='Welcome to Angular Property Binding';

  img:string='https://www.wipro.com/content/dam/nexus/en/brand/images/wipro-primary-logo-color-rbg.png';
 
  btnDisabled=true;
 
  color = 'yellow';
  nameDetails = 'The name is Bond <b>James Bond<b/>';
  fontSize='20px';

  college="JNTUK";
 
  name='Padma';
 
  constructor() { }

  ngOnInit(): void {
  }

  updateName(){
    this.name='Padma Uppalapati';
  }

}
