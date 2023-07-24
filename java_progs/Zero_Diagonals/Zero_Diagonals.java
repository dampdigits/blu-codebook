import java.util.*;
class Zero_Diagonals
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
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                System.out.print("0 ");
                else if(i+j==c-1)
                System.out.print("0 ");
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}