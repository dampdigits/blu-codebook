import java.util.*;
class Interchange_Diagonals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the rows");
        int r=sc.nextInt();
        System.out.println("Enter the columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2-D array or the "+r+"X"+c+" matrix after interchanging the diagonals is as follows :");
        swapDiagonals(arr,r,c);
    }
    public static void swapDiagonals(int arr1[][],int r1,int c1)
    {
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                if(i==j)
                System.out.print(arr1[i][c1-(j+1)]+" ");
                else if(i+j==c1-1)
                System.out.print(arr1[i][c1-(j+1)]+" ");
                else
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}