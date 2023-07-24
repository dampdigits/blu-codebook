import java.util.*;
class TransposeMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int c=sc.nextInt(),arr[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nThe Transposed Matrix :");
        for(int j=0;j<c;j++)
        {
            for(int i=0;i<r;i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}