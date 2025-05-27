import { Component, OnInit } from '@angular/core';
import { Employee, HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent implements OnInit {
  
  employees : Employee[] = [];
  constructor(private httpClientService: HttpClientService){}
  ngOnInit(): void {
    this.httpClientService.getEmployees().subscribe(
      response => {this.employees = response;}
    )
  }
}
