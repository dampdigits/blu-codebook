import java.util.*;
class Disarium_Number//135=(1^1)+(3^2)+(5^3)=135
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if(disarium(n)==true)
        System.out.println("It is a disarium no.");
        else
        System.out.println("It is not a disarium no.");
    }
    public static boolean disarium(int n1)
    {
        int dig=0,tmp=n1,r=0,sum=0;
        while(tmp!=0)
        {
            tmp/=10;
            dig++;
        }
        tmp=n1;
        for(int i=dig;i>0;i--)
        {
            r=tmp%10;
            tmp/=10;
            sum+=(int)Math.pow(r,i);
        }
        if(sum==n1)
        return true;
        else
        return false;
    }
}