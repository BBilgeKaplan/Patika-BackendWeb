class Employee{
    String name;
    int salary,workHours,hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(int salary){
        if(salary>1000){
            double tax=salary*(0.03);
            return tax;
        } else {
            System.out.println("Tax was not applied.");
            return 0;        
        }
    }

    public int bonus(int workHours){
        if(workHours>40){
            int bonus = ((workHours-40)*30);
            return bonus;
        }else return 0;
    }

    public double raiseSalary(int hireYear,int salary){
        double raiseSalary;
        int year=2021-hireYear;
        if(year<10){
            raiseSalary=salary*0.05;
            return raiseSalary;
        }else if(year>9 && year<20){
            raiseSalary=salary*0.1;
            return raiseSalary;
        }else if(year>19 ){
            raiseSalary=salary*0.15;
            return raiseSalary;
        }
        return 0;    
    }

    public double totalSalary(int salary, double tax, int bonus){
        double totalSalary=salary-tax+bonus;
        return totalSalary;
    }

    public void writeInfo(){
        System.out.println("Name \t: "+ name);
        System.out.println("Salary \t: "+ salary);
        System.out.println("Work hours \t: "+ workHours);
        System.out.println("Hire year \t: "+ hireYear);
        System.out.println("Tax \t:"+ tax(salary));
        System.out.println("Bonus \t: "+ bonus(workHours));
        System.out.println("Raise salary\t: "+ raiseSalary(hireYear, salary));
        System.out.println("Salary with tax and bonus \t:"+ totalSalary(salary, tax(salary), bonus(workHours)));
        System.out.println("Total Salary\t: "+(raiseSalary(hireYear, salary) + totalSalary(salary, tax(salary), bonus(workHours))));
    }
}


public class salaryCalculation {
    public static void main(String[] args) {
        Employee emp = new Employee("Daniel Miller", 2500, 45, 15);
        emp.writeInfo();
    }
}