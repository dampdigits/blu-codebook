import java.util.*;
class Series1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a no.");
        int a=sc.nextInt();
        System.out.println("\nEnter the limit");
        int n=sc.nextInt();
        System.out.println("\n"+calc(a,n));
    }
    public static double calc(int a,int n)
    {
        int flag=0;
        double s=0;
        for(int i=1;i<=n;i++)
        {
            int a1=1,fact=1;
            for(int j=1;j<=i;j++)
            {
                a1*=a;
                fact*=j;
            }
            if(flag==0)
            {
                s+=(a1/fact);
                flag=1;
            }
            else
            {
                s-=(a1/fact);
                flag=0;
            }
        }
        return s;
    }
}