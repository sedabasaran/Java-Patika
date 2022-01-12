public class Employee {
    String name;
    double salary;
    double workHouse;
    int hireYear;


    Employee(String name, double salary, double workHouse, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary < 1000){
            return 0;
        }else{
            return (this.salary * 0.03);
        }
    }

    double bonus(){
        if(this.workHouse > 40){
            return (this.workHouse - 40) * 30;
        }else {
            return 0;
        }
    }

    double raiseSalary(){
        if((2021 - this.hireYear) < 10){
            return this.salary * 0.05;
        }
        else if((2021 - this.hireYear) >= 10 && (2021- this.hireYear) < 20){
            return this.salary * 0.10;
        }
        else{
            return this.salary * 0.15;
        }
    }

    void EmployeeInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("WorkHouse : " + this.workHouse);
        System.out.println("HireYear : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Raise Salary : " + this.raiseSalary());
        System.out.println("Tax and Bonus + salary : " + (this.salary + this.bonus() -  this.tax() ));
        System.out.println("Total Salary : " + (salary + raiseSalary()));
        System.out.println("*-------------------*-------------------*");

    }


}
