import java.util.*;
public class day
{

    public static void main(String[] args)
    {
        Random r=new Random();
        int w=0,l=0;
        for(int i=0;i<100000;i++)
        {
            int x=r.nextInt(999999);
            if(x%2==0)
            w++;
            else
            l++;
        }
        if(w>l)
        System.out.println("Win: "+w);
        else if(w<l)
        System.out.println("Loss: "+l);
        else
        System.out.println("Tie");
    }
}