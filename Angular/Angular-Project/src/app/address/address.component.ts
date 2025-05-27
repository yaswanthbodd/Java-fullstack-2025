import { Component } from '@angular/core';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrl: './address.component.css'
})
export class AddressComponent {
  user: any;
  constructor(){
    this.user = {
      name: "yaswanth",
      address : {
        street: "origanti reddy Street",
        city: "vetapalem",
        state: "Andhra Pradesh",
        country: "India",
      },
      phone: ['123-442-4443', '12343-22123', '123-442-4443','12312-42243'],
      email : []
    }
  }
}
