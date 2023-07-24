import java.util.*;
class Selection_Sort
{
    public static void main(int array[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for ascending order or 2 for descending order");
        int a=sc.nextInt();
        int n=array.length;
        for(int i=0;i<n-1;i++)
        {
            int factor=array[i],pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(a==1)//for ascending order
                {
                    if(array[j]<factor)
                    {
                        factor=array[j];
                        pos=j;
                    }
                }
                else if(a==2)//for descending order
                {
                    if(array[j]>factor)
                    {
                        factor=array[j];
                        pos=j;
                    }
                }
            }
            int temp=array[i];
            array[i]=factor;
            array[pos]=temp;
        }
        /*the if & else will facilitate us for not print the elements incase the user enters a wrong input, i.e., neither 1 nor 2 */
        if(a==1|a==2)
        {
            for(int k=0;k<n;k++)
            {
                System.out.print(array[k]+" ");
            }
        }
        else
        {
            System.out.println("ERROR: Wrong input");
        }
    }
}