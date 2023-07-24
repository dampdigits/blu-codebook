import java.util.*;
class TwoD_Array_BubbleRowSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter a the no. of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter a the elemnts");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        bRsort(arr,r,c);
    }
    public static void bRsort(int arr[][],int r, int c)
    {
        int flag=0;
        for(int i=0;i<r;i++)
        for(int j=0;j<c-1;j++)
        {
            for(int k=0;k<c-1-j;k++)
            {
                flag=0;
                if(arr[i][k]>arr[i][k+1])
                {
                    flag=1;
                    int temp=arr[i][k];
                    arr[i][k]=arr[i][k+1];
                    arr[i][k+1]=temp;
                }
            }
            if(flag==0)
            break;
        }
        System.out.println();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}