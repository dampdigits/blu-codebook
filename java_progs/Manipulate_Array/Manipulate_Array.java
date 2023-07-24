import java.util.*;
class Manipulate_Array
{
    public static void main(int array[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to be searched");
        int a=sc.nextInt(),n=array.length;
        System.out.println("Before reversing elements:");
        int flag=search(array,a);
        if(n%2==0)
        {
            int L=0,U=n-1,r=n/2;
            for(int i=0;i<=r;i++)
            {
                int temp=array[L+i];
                array[L+i]=array[U-i];
                array[U-i]=temp;
            }
        }
        else
        {
            int M=n/2;
            for(int i=1;i<=M;i++)
            {
                int temp=array[M-i];
                array[M-i]=array[M+i];
                array[M+i]=temp;
            }
        }
        if(flag==1)
        {
            System.out.println("After reversing elements:");
            search(array,a);
        }
        System.out.print("Elements in their reversed order:");
        for(int j=0;j<n;j++)
        {
        System.out.print(" "+array[j]);
        }
        System.out.println();
        for(int k=0;k<(n-1);k++)
        {
            for(int l=k+1;l<n;l++)
            {
                if(array[l]<array[k])
                {
                    int temp=array[k];
                    array[k]=array[l];
                    array[l]=temp;
                }
            }
        }
        System.out.println("Largest no.- "+array[n-1]);
        System.out.println("Smallest no.- "+array[0]);
    }
    public static int search(int array1[],int a1)
    {
        int n=array1.length,flag=0,i;
        for(i=0;i<n;i++)
        {
            if(a1==array1[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("The no. is present at position: "+(i+1));
        }
        else
        {
            System.out.println("The no. is not present");
        }
        return flag;
    }
}