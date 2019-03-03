package compPro2019;
import java.util.*;
class pro1
{
    public static void main()
    {
        int carton[]={48,24,12,6};//to store and iterate through different carton sizes
        int sum=0;//to store total no. of cartons used
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of boxes N:");//accepting no. of boxes
        int N=sc.nextInt();//storing no. of boxes
        if(N>1000)//checking validity condition
            System.out.println("Invalid Length");//error message
        else
        {
            int copy=N;//creating a copy
            for(int i=0;i<4;i++)//iterating through carton sizes
            {
                int div=N/carton[i];//storing quotient
                if(div>0)//only want to print if >0
                System.out.println(carton[i]+" X "+div+" = "+carton[i]*div);//printing info
                N=N-carton[i]*div;//updating no. of boxes
                sum+=div;//counting cartons
            }
            if(N==0)
                System.out.println("Remaining boxes = "+N);//displaying remainder as 0
            else
            {
                System.out.println("Remaining boxes "+N+" X "+" 1"+" = "+N);//displaying remainder as non 0
                sum++;//adding a box
            }
            System.out.println("Total no. of boxes = "+copy);//printing original box no.
            System.out.println("Total no. of cartons = "+sum);//printing total cartons used
        }
    }
}