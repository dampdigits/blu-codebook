import java.util.*;
class Bubble_Sort
{
    public static void main(int array[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for ascending order or 2 for descending order");
        int a=sc.nextInt();
        if(a==1|a==2)
        {
            int n=array.length;
            for(int i=0;i<n-1;i++)
            {
               int flag=0;
               for(int j=0;j<n-1-i;j++)//-i, so that sorted elements at the last dont get compared again and again
               {
                   if(a==1)//for ascending order
                   {
                      if(array[j]>array[j+1])
                      {
                          int temp=array[j];
                          array[j]=array[j+1];
                          array[j+1]=temp;
                          flag=1;
                      }
                   }
                   else if(a==2)//for descending order
                   {
                       if(array[j]<array[j+1])
                       {
                           int temp=array[j];
                           array[j]=array[j+1];
                           array[j+1]=temp;
                           flag=1;
                       }
                   }
               }
               if(flag==0)//flag will remain as 0 when swap doesnt take place which means elements are sorted & cant b sorted any further
               {
                   break;//the for loop will come to a stop if elements are sorted 
               }
            } 
            for(int k=0;k<n;k++)
            {
                System.out.print(array[k]+" ");
            }
        }
        else
        {
            System.out.println("\nERROR: Wrong input");
        }
    }
}