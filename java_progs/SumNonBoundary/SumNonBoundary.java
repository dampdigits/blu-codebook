import java.util.*;
class SumNonBoundary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Sum of the non-boundary elements = "+snb(arr,r,c));
    }
    public static int snb(int arr1[][],int r1,int c1)
    {
        int sum=0;
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                if(i!=0&&i!=r1-1&&j!=0&&j!=c1-1)
                    sum+=arr1[i][j];
        return sum;
    }
}