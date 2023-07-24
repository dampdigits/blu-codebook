import java.util.*;
class Mobiousfn
{
    int n, n1, rep, prime, flag, ans;
    Mobiousfn()
    {
        n=0;
        n1=0;
        rep=0;
        prime=0;
        flag=1;
        ans=1;
    }
    int input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a no.");
        int n=sc.nextInt();
        return n;
    }
    int primefact(int n)
    {
        if(n!=1)
        {
            for(int i=2;i<=n;i++)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    n1=n;
                    while(n1%i==0&&n1!=0)
                    {
                        n1/=n;
                        rep++;
                        if(rep>1)
                        break;
                    }
                    if(n%i==0)
                    prime++;
                    else if(rep>1)
                    break;
                    else
                    rep=0;
                }
                flag=1;
            }
        }
        return prime;
    }
    void display(int n)
    {
        if(n==1)
        ans=1;
        else if(rep>1)
        ans=0;
        else
        {
            for(int i=1;i<=prime;i++)
            ans*=-1;
        }
        System.out.println("\nM("+n+")="+ans);
    }
    public static void main(String args[])
    {
        Mobiousfn obj=new Mobiousfn();
        int n2=obj.input();
        obj.primefact(n2);
        obj.display(n2);
    }
}