import java.util.*;
public class Mersenne_nums
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        mersenne(n);
    }
    public static void mersenne(int n)
    {
        int count=0, x=0;
        do
        {
            count++;
            x=(int)Math.pow(2,count)-1;
            System.out.println(x);
        }while(x<n);
        System.out.println("The "+count+"th mersenne no. exceeds the limit");
    }
}