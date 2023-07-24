import java.util.*;
public class Add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no. ");
        int m=sc.nextInt();
        System.out.print("Enter 2nd no. ");
        int n=sc.nextInt();
        System.out.println("\nsum = "+add(m,n));
    }
    public static int add(int a,int b)
    {
        int s=a+b;
        return s;
    }
}