import java.io.*;
import java.util.*;
public class Donor implements Serializable{
    String Name, Address, Contactnumber,bloodgroup,date_of_last_donation;
    int age;
}
class donormain{
    static boolean checkdate(String dt[],String td[])
    {
        if(!(td[2].equals(dt[2])))
            return true;
        else if((Integer.parseInt(td[1])-Integer.parseInt(dt[1]))>=6)
            return true;
        return false;
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Donors in Vellore: ");
        int n=sc.nextInt();
        Donor obj[]=new Donor[n];
        FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\DonorSave.txt"); 
        ObjectOutputStream out = new ObjectOutputStream(file);       
        for(int i=0;i<n;i++)
        {
            obj[i]=new Donor();
            System.out.print("Enter name of the Donor: ");
            obj[i].Name=br.readLine(); 
            System.out.print("Enter age of the Donor: ");
            obj[i].age=sc.nextInt();
            System.out.print("Enter Address of the Donor: ");
            obj[i].Address=br.readLine();
            System.out.print("Enter Contact number of the Donor: ");
            obj[i].Contactnumber=br.readLine();
            System.out.print("Enter Blood Group of the Donor in format(A+ve, B+ve, A-ve, B-ve, etc.): ");
            obj[i].bloodgroup=br.readLine();
            System.out.print("Enter Date of last Donation of the Donor in format dd/mm/yy: ");
            obj[i].date_of_last_donation=br.readLine();
            out.writeObject(obj[i]);
        }
        System.out.println("All Donor Objects has been saved"); 
        out.close(); 
        file.close();
        FileInputStream fi = new FileInputStream("C:\\Users\\hp\\Desktop\\DonorSave.txt"); 
        ObjectInputStream in = new ObjectInputStream(fi); 
        System.out.print("Enter Todays Date in format dd/mm/yy: ");
        String td=br.readLine();
        String ta[]=td.split("/");
        for(int i=0;i<n;i++)
        {
            obj[i] = (Donor)in.readObject();
            String d[]=obj[i].date_of_last_donation.split("/");
            if((obj[i].bloodgroup.equals("A+ve"))&&(checkdate(d,ta)))
            {
                System.out.println("\nName:"+obj[i].Name+"\nAge: "+obj[i].age+"\nAddress: "+obj[i].Address+"\nContact number: "+obj[i].Contactnumber+
                "\nBlood group: "+obj[i].bloodgroup+"\nDate_of_last_donation: "+obj[i].date_of_last_donation);
            }
        }  
            in.close(); 
            fi.close(); 
    }
}
