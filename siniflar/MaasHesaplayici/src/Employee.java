public class Employee {
    String name;
    int salary;
    int workHours;
    int  hireYear;

    public Employee(String name, int salary,int workHours, int hireYear){
        this.hireYear=hireYear;
        this.name=name;
        this.workHours=workHours;
        this.salary=salary;
    }

    void tax(){
        if (this.salary>1000){
            this.salary=salary-(this.salary*3/100);
        }
    }
    void bonus(){
        if (this.workHours>40){
            int fark=this.workHours-40;
            this.salary+=fark*30;
        }
    }
    void raiseSalary(){
       int fark=this.hireYear-2021;
       if(fark<10){
           this.salary+=this.salary*5/100;
       }else if(fark>9 && fark<20){
           this.salary+=this.salary*10/100;
       }else if(fark>19){
           this.salary+=this.salary*15/100;
       }
    }

    void toStringg(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Work Hours : "+this.workHours);
        System.out.println("Hire Year : "+this.hireYear);
    }
}
