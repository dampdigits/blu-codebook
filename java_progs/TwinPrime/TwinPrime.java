import java.util.*;
class TwinPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the no. right before your range");
        int n=sc.nextInt();
        System.out.println("Enter the no. right after your range");
        int nn=sc.nextInt();
        tp(n,nn);
    }
    public static void tp(int n1,int n2)
    {
        int count=0;
        for(int i=n1+1;i<n2;i++)
        {
            int flag1=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag1=1;
                    break;
                }
            }
            if(flag1==0)
            {
                for(int k=i+1;k<n2;k++)
                {
                    int flag2=0;
                    for(int j=2;j<k;j++)
                    {
                        if(k%j==0)
                        {
                            flag2=1;
                            break;
                        }
                    }
                    if(flag2==0)
                    {
                        System.out.println(i+" & "+k);
                        count++;
                        i=k;
                        break;
                    }
                }
            }
        }
        if(count==0)
        System.out.println("There is no twin prime within the range");
    }
}