import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
  cid : string  = '';
  cname : string = '';
  cage : string = '';
  onClickSubmit(customer : any){
    this.cid = customer.cid;
    this.cname = customer.cname;
    this.cage = customer.cage;
  }
}
