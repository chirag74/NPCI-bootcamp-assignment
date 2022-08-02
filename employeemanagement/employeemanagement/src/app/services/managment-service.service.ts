import { Injectable } from '@angular/core';
import { Employee } from '../common/employee';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable,map} from 'rxjs';
import { Department } from '../common/department';


@Injectable({
  providedIn: 'root'
})
export class ManagmentServiceService {
empurl="http://localhost:8081/api/emp"
depturl="http://localhost:8081/api/dept"
  constructor(private httpClient:HttpClient) { }
  getAllEmployee():Observable<Employee[]>{
    return this.httpClient.get<getEmployeeResponse>(this.empurl).pipe(map(Response => Response._embedded.employees))
  }
  getAllDepartment():Observable<Department[]>{
    return this.httpClient.get<getDepartmentResponse>(this.depturl).pipe(map(Response=>Response._embedded.departments))
  }
  saveEmployee(employee:Employee):Observable<Employee>{
const httpOptions={
  headers: new HttpHeaders({
  'Content-type':'application/json',
  'Authorization':'auth-token',
  'Acces-Control-Allow-Origin':'*'
})}
return this.httpClient.post<Employee>(this.empurl,employee,httpOptions)
  }
}


interface getEmployeeResponse{
  _embedded:{
    employees: Employee[]
  }
}
interface getDepartmentResponse{
  _embedded:{
    departments:Department[]
  }
}

