import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  a="";

  powers = ['Smart Coder', 'Super Flexible',  
  'Logical Thinker', 'Excellent Analyst'];

  //ID we are initializing, name, power,dept will be taken from employee.ts
  emp = new Employee(18, '', '', '');
 
  submitted = true;  

  onSubmit() { this.submitted = true; 
    alert("Data submitted")
  }


  constructor() { }

  ngOnInit(): void {
  }

  clearValue(){
    this.a="";
  }
}
