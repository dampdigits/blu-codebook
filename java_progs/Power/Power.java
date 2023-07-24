import java.util.*;
class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nEnter a no.");
        long n=sc.nextLong();
        System.out.println("Enter the no. of times u want the no. to be multiplied");
        long p=sc.nextLong();
        long r=Power.pow(n,p);
        System.out.println("\n"+n+"^"+p+"="+r);
    }
    public static long pow(long n1,long p1)
    {
        long r1=1;
        for(int i=1;i<=p1;i++)
        {
            r1=r1*n1;
        }
        return r1;
    }
}