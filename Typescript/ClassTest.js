var Employee = /** @class */ (function () {
    function Employee(name, age) {
        this.name = name;
        this.age = age;
    }
    Employee.prototype.display = function () {
        console.log("Name : ".concat(this.name, " with Age : ").concat(this.age));
    };
    return Employee;
}());
var e1 = new Employee("yaswanth", 22);
e1.display();
