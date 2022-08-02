import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit(): void {
  }
  employeeDetails(){
    this.route.navigateByUrl("/employees")
  }
  departmentDetails(){
    this.route.navigateByUrl("/departments")
  }

  addDepartment(){
    this.route.navigateByUrl("/addDepartment")
  }
  addEmployee(){
    this.route.navigateByUrl("/addEmployee")
  }
}
