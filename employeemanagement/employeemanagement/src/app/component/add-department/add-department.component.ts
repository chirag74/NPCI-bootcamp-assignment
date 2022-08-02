import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';

@Component({
  selector: 'app-add-department',
  templateUrl: './add-department.component.html',
  styleUrls: ['./add-department.component.css']
})
export class AddDepartmentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  
  deptModel : Department = new Department (0,"","")
  onSubmit(deptModel : Department) { 
    
    this.deptModel = deptModel;
    console.log(this.deptModel);
  }

}
