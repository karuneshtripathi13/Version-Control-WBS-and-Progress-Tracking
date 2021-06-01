import java.util.*;
class Employeec{

    String first_name,last_name;
    double monthly_salary;
    Scanner sc=new Scanner(System.in);
    Employeec()
    {
    first_name="";
    last_name="";
    monthly_salary=0.0;
    }
    public String getFirst_name() {
        System.out.println("Enter First name: ");
        return sc.nextLine();
    }
    public String getLast_name() {
        System.out.println("Enter Last name: ");
        return sc.nextLine();
    }
    public double getMonthly_salary() {
        System.out.println("Enter the monthly salary: ");
        return sc.nextDouble();
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setMonthly_salary(double monthly_salary) {
        if(monthly_salary>0.0)
        this.monthly_salary = monthly_salary;
        else
        this.monthly_salary=0.0;
    }
public Double raise()
{
    return (0.1*yearsal());
}
public Double yearsal(){
return(12*monthly_salary);
}
}
class Employee_salary{
    public static void main(String[] args) {
        
        Employeec e1=new Employeec();
        Employeec e2=new Employeec();
        e1.setFirst_name(e1.getFirst_name());
        e1.setLast_name(e1.getLast_name()); 
        e1.setMonthly_salary(e1.getMonthly_salary());
        e2.setFirst_name(e2.getFirst_name());
        e2.setLast_name(e2.getLast_name()); 
        e2.setMonthly_salary(e2.getMonthly_salary());
        System.out.println("Yearly Salary of 1st Employee is: "+e1.yearsal());
        System.out.println("Yearly Salary of 2nd Employee is: "+e2.yearsal());
        System.out.println("Yearly Salary of 1st Employee after raise is: "+(e1.yearsal()+e1.raise()));
        System.out.println("Yearly Salary of 2nd Employee after raise is: "+(e2.yearsal()+e2.raise()));
    }
}