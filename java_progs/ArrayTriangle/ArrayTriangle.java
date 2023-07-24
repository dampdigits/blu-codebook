import java.util.*;
class ArrayTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();        
        int arr[][]=new int[n][n];
        System.out.println("Enter the numeric elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
            System.out.println();
        }
        System.out.println("The matrix :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("Triangle-1 :");        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            if(j<=i)//or (i>=j)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("Triangle-2 :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            if(j<i)//or (i>j)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("Triangle-3 :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            if(i<=j)//or (j>=i)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("Triangle-4 :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            if(i<j)//or (j>i)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}