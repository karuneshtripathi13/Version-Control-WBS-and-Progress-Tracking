import java.util.*;
public class employee {
    String name,eid,doj;
    int age,ep;
    double sal;
    void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the name of the employee: ");
    name=sc.nextLine();
    System.out.print("Enter the employee id: ");
    eid=sc.nextLine();
    System.out.print("Enter the age of the employee: ");
    age=sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the date of joining of the employee: ");
    doj=sc.nextLine();
    System.out.print("Enter the salary of the employee: ");
    sal=sc.nextDouble();
    System.out.print("Enter the evaluation points in last financial year of the employee: ");
    ep=sc.nextInt();
    }
    void display()
    {
        if(ep==10)
        {
            sal+=sal*0.15;
        }
        System.out.println("Name:\t\t"+name+"\nEmployee id:\t"+eid+"\nAge:\t\t"+age+"Years\nDate of joining:"+doj+"\nEvaluation points:"+ep+"\nSalary:\t\tRs."+sal);
    }
}
class trainee extends employee
{
    int tp;
    String post="Trainee";
    void input1()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the training period in months: ");
    tp=sc.nextInt();
    }
    @Override
    void display() {
        super.display();
        System.out.println("Position:\t"+post+"\nTraining period:"+tp+" Months\n");
    }
}
class developer extends employee
{
    String sp,post="Developer";
    void input2()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the specialisation language (Eg. Java, Python etc.): ");
    sp=sc.nextLine();
    }
@Override
void display() {
    super.display();
    System.out.println("Position:\t"+post+"\nSpecialisation Language:"+sp+"\n");
}
}
class teamlead extends employee
{
    String tn,prn,post="Team leader";
    int nm;
    void input3()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the team name: ");
    tn=sc.nextLine();
    System.out.print("Enter the project name: ");
    prn=sc.nextLine();
    System.out.print("Enter the number of team members: ");
    nm=sc.nextInt();
    }
    @Override
    void display() {
        super.display();
        System.out.println("Position:\t"+post+"\nTeam name:\t"+tn+"\nProject name:\t"+prn+"\nTeam strength:\t"+nm+"\n");
    }
}
class manager extends employee
{
    int nt;
    String post="Manager";
    void input4()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teams in the company: ");
        nt=sc.nextInt();
    }
    @Override
    void display() {
        super.display();
        System.out.println("Position:\t"+post+"\nNumber of teams:"+nt+"\n");
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n=sc.nextInt();
        int t=0,d=0,te=0;
        manager mo=new manager();
        teamlead to[]=new teamlead[n];
        developer dvo[]=new developer[n];
        trainee tno[]=new trainee[n];
        for(int i=0;i<n;i++)
        {
            int ch;
            System.out.print("Enter\n1.To enter the data of Manager\n2.To enter data of teamleader\n3.To enter data of developer\n4.To enter data of trainee\nChoice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    mo.input();
                    mo.input4();
                    break;
                }
                case 2:
                {
                    to[t]=new teamlead();
                    to[t].input();
                    to[t].input3();
                    t++;
                    break;
                }
                case 3:
                {
                    dvo[d]=new developer();
                    dvo[d].input();
                    dvo[d].input2();
                    d++;
                    break;
                }
                case 4:
                {
                    tno[te]=new trainee();
                    tno[te].input();
                    tno[te].input1();
                    te++;
                    break;
                }
                default:System.out.println("Enter correct choice");
            }
        }
        System.out.println("\n\nManager data\n");
        mo.display();
        System.out.println("Team leaders data\n");
        for(int i=0;i<t;i++)
        {
          to[i].display();
        }
        System.out.println("Developers data\n");
        for(int i=0;i<d;i++)
        {
          dvo[i].display();
        }
        System.out.println("Trainee data\n");
        for(int i=0;i<te;i++)
        {
          tno[i].display();
        }
    }
}