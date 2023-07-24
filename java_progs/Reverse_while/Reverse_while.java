import java.util.*;
public class Reverse_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer");
        int n=sc.nextInt(), rev=0;
        while(n!=0)
        {
            rev*=10;
            rev+=n%10;
            n/=10;
        }
        System.out.println("Reverse= "+rev);
    }
}