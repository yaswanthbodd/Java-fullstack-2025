class Employee {
    name : string;
    age : number;
    constructor(name: string, age: number){
        this.name = name;
        this.age = age;
    }
    display(): void{
        console.log(`Name : ${this.name} with Age : ${this.age}`);
    }
}

let e1 = new Employee("yaswanth",22);
e1.display();