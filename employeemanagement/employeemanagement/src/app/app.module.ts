import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
 import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { from } from 'rxjs';
import { EmpListComponent } from './component/emp-list/emp-list.component';
import { DeptListComponent } from './component/dept-list/dept-list.component';
import { RouterModule, Routes } from '@angular/router';
import { AddDepartmentComponent } from './component/add-department/add-department.component';
import { AddEmployeeComponent } from './component/add-employee/add-employee.component';
import { WelcomeComponent } from './component/welcome/welcome.component';


const route : Routes = [
  {path : '', component : WelcomeComponent },
   {path : 'employees', component : EmpListComponent},
   {path: 'departments', component : DeptListComponent},
   {path: 'addEmployee', component : AddEmployeeComponent},
   {path: 'addDepartment', component : AddDepartmentComponent}
 ]

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    DeptListComponent,
    AddDepartmentComponent,
    AddEmployeeComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(route)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
