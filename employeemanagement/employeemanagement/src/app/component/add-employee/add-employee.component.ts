import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/common/employee';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';
@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private service:ManagmentServiceService,private route:Router) { }

  ngOnInit(): void {
  }

  employeeModel : Employee = new Employee (0,"","",new Date(Date.now()),0,0,0,0)
  onSubmit(employeeModel : Employee) { 
    
    this.employeeModel = employeeModel;
    this.service.saveEmployee(this.employeeModel).subscribe(()=>{
      this.route.navigateByUrl("/employees")
    })
  }



}
