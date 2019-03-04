package compPro2019;

import java.util.*;
class scalarMatrix
{
    int[][] accept()//accepting the 2-D matrix
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns:");
        int m=sc.nextInt();//rowa
        int n=sc.nextInt();//columns
        int arr[][]=new int[m][n];//creating matrix
        System.out.println("Enter data:");//inputing data from user
        for(int i=0;i<m;i++)//iterating through the rows
        {
            for(int j=0;j<n;j++)//iterating through the columns
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    boolean isDiagonal(int arr[][])
    {
        boolean flag=true;//flag variable for checking validity
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i!=j&&arr[i][j]!=0)//if non-diagonal elements are non zero,
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }

    boolean isScalar(int arr[][])
    {
        boolean flag=true;//for checking validity
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr[0].length-1;j++)
            {
                if(arr[i][j]!=arr[i+1][j+1])//if one diagonal element is npt equal to the next diagonal element,
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    void display(int arr[][])//displaying matrix
    {
        System.out.println("Matrix: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        scalarMatrix obj=new scalarMatrix();
        int arr[][]=obj.accept();//acpting matrix
        obj.display(arr);//displaying matrix
        if(obj.isDiagonal(arr))//checking if matrix is diagonal
            if(obj.isScalar(arr))//checking if it is scalar
                System.out.println("It is a scalar matrix.");
            else
                System.out.println("It is not a scalar matrix.");
        else
            System.out.println("It is not a scalar matrix.");
    }
}