package projects;
import java.util.*;
class circularPrime
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();//storing accepted number
        boolean notPrime=false;//flag to check whether the nuber is circular prime or not
        int copy=n;//making a copy of n
        do
        {       
            System.out.println(copy);
            if(isPrime(copy)==false)
                notPrime=true;//setting the flag as true
            copy=nextCircle(copy);//converting copy to next circular number
        }while(copy!=n);
        if(notPrime)//checking if flag is true
            System.out.println(n+" is not a circular prime.");
        else
            System.out.println(n+" is a circular prime.");
    }

    int nextCircle(int n)
    {
        String str="";
        str=str.valueOf(n);//converting int to string
        str=str.substring(1)+str.substring(0,1);//adding the first character to the end
        n=Integer.valueOf(str);//converting back to int
        return n;
    }

    boolean isPrime(int n)
    {
        int ctr=0;//to count the number of factors
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)//checking wheteher i is a factor of n
                ctr++;
        }
        if(ctr==2)//checking if number of factors is 2
            return true;
        else
            return false;
    }
}