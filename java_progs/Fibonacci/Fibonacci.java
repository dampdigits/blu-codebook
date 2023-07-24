import java.util.*;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the limit");
        int n=sc.nextInt();
        if(n==0)
        System.out.println("0");
        else
        {
            int a=0,b=1,sum=0;
            System.out.print("0, 1");
            while(sum<n)
            {
                sum=a+b;
                if(sum<=n)
                {
                    System.out.print(", "+sum);
                    a=b;
                    b=sum;
                }
            }
        }
    }
}