import java.util.*;
class TwoD_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int c=sc.nextInt(),array[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<r;k++)
        {
            for(int l=0;l<c;l++)
            {
                System.out.print(array[k][l]+" ");
            }
            System.out.println();
        }
    }
}