import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';
import { Employee } from 'src/app/common/employee';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';
@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private service:ManagmentServiceService,private route:Router,private activateRoute : ActivatedRoute) { }

  ngOnInit(): void {

    // this.activateRoute.paramMap.subscribe(()=>{this.getEmployeeByID()})
  }

  employeeModel : Employee = new Employee (0,"","",new Date(Date.now()),0,0,0,0)
  isEditable : boolean = false

  // getEmployeeByID(){
  //   // const empID = +this.activateRoute.snapshot.paramMap.get("empid");
  //   console.log(empID)
  //   if(empID > 0){
  //       this.isEditable = true
  //       this.service.getEmployeeById(empID).subscribe((data=>{
  //         this.employeeModel = data;
  //       }))
  //   }
  // }
  onSubmit(employeeModel : Employee) { 
    
    this.employeeModel = employeeModel;
    this.service.saveEmployee(this.employeeModel).subscribe(()=>{
      this.route.navigateByUrl("/employees")
    })
}


}
