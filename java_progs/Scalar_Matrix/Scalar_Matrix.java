import java.util.*;
class Scalar_Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        if(scal_mat(arr)==true)
        System.out.println("It is a scalar matrix");
        else
        System.out.println("It is not a scalar matrix");
    }
    public static boolean scal_mat(int a[][])
    {
        int x=a[0][0],flag=0,m=a.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    if(a[i][j]!=x)
                    flag=1;
                }
                else
                {
                    if(a[i][j]!=0)
                    flag=1;
                }
            }
            if(flag==1)
            break;
        }
        if(flag==1)
        return false;
        else
        return true;
    }
}