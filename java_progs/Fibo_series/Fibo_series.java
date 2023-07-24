import java.util.*;
public class Fibo_series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
}