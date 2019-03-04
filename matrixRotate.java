package compPro2019;
import java.util.*;
class matrixRotate
{
    int acceptM()//accepting M
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter M: ");
        int M=sc.nextInt();
        if(M<2||M>10)//checking validity
        {
            return 0;
        }
        else
            return M;
    }

    int[][] accept(int M)//accepting the matrix
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[M][M];//creating the matrix
        System.out.println("Enter data: ");
        for(int i=0;i<M;i++)//to iterate through the rows
        {
            for(int j=0;j<M;j++)//to iterate through the columns
            {
                arr[i][j]=sc.nextInt();//accepting each element
            }
        }
        return arr;
    }

    int[][] rotate(int arr[][])
    {
        int rot[][]=new int[arr.length][arr.length];//a matrix to store the rotated result
        for(int i=0;i<arr.length;i++)//iterating through the rows
        {
            for(int j=0;j<arr.length;j++)//iterating through the columns
            {
                rot[j][arr.length-i-1]=arr[i][j];//assigning each element ot its corresponding rotated position
            }
        }
        return rot;
    }

    void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)//to iterate through the rows
        {
            for(int j=0;j<arr.length;j++)//to iterate through the columns
            {
                System.out.print(arr[i][j]+" ");//outputing each element
            }
            System.out.println();
        }
    }

    int sumOfCorners(int arr[][])
    {
        int sum=0;//to calculate sum of corners
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if((i==0||i==arr.length-1)&&(j==0||j==arr.length-1))//only first and last
                    sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main()
    {
        matrixRotate obj=new matrixRotate();
        int M=obj.acceptM();
        if(M>0)//checking validity
        {
            int arr[][]=obj.accept(M);//putting the accepted array in arr
            System.out.println("Original Matrix");
            obj.display(arr);
            int[][] rot=obj.rotate(arr);//rotating the matrix
            System.out.println("Rotated matrix: ");
            obj.display(rot);
            System.out.println("Sum of corners: "+obj.sumOfCorners(arr));//displaying sum of corners
        }
        else
        System.out.println("Invalid input.");//error message
    }
}