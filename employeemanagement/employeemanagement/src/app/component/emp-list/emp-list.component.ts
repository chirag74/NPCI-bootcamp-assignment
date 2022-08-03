import { Component, OnInit } from '@angular/core';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';
import { Employee } from 'src/app/common/employee';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {
employees:Employee[]
  constructor(private service : ManagmentServiceService,private route:Router) { }

  ngOnInit(): void {
    this.listofEmployees()
  }

  listofEmployees(){
    this.service.getAllEmployee().subscribe(data=>{
      this.employees=data
    })
    
  }


  getEmployeeByName(ename:string){
    this.service.getEmployeeByName(ename).subscribe(data =>{
      this.employees = data
    })
  }
  updateEmp(empno:number){
    this.route.navigateByUrl("/update/"+empno)
   }
 
   deleteEmp(empno:number){
    
     this.service.deleteEmployee(empno).subscribe(()=>{
   
   this.listofEmployees()
  })
 }

}
