import java.util.*;
class Emirp
{
    public static boolean prime(int n1)
    {
        int flag=1;
        for(int i=2;i<n1;i++)
        {
            if(n1%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }
    public static int reverse(int n1,int sum)
    {
        if(n1==0)
        return sum;
        else
        {
            sum=(sum*10)+(n1%10);
            return reverse(n1/10,sum);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if(prime(n)==false)
        System.out.println("Not an Emirp no.\n");
        else
        {
            int rev=reverse(n,0);
            if(n==rev)
            System.out.println("Not an Emirp no.\n");
            else
            {
                if(prime(rev))
                System.out.println("It is an Emirp no.\n");
                else
                System.out.println("Not an Emirp no.\n");
            }
        }
    }
}