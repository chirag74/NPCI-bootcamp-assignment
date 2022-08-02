import { Component, OnInit } from '@angular/core';
import { ManagmentServiceService } from 'src/app/services/managment-service.service';
import { Employee } from 'src/app/common/employee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {
employees:Employee[]
  constructor(private service : ManagmentServiceService) { }

  ngOnInit(): void {
    this.listofEmployees()
  }

  listofEmployees(){
    this.service.getAllEmployee().subscribe(data=>{
      this.employees=data
    })
    
  }

}
