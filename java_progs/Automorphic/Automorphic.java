import java.util.*;
public class Automorphic//Automorphic No.: A no. whose square's last digit(s) is equal to the no. itself
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. to check if its an automorphic no.");
        int n = sc.nextInt(), tmp=n, sq=n*n, div=1;
        while(tmp>0)
        {
            tmp/=10;
            div*=10;
        }
        if(sq%div==n)
        {
            System.out.println("\nIt is an automorphic no.");
        }
        else
        {
            System.out.println("\nIt is not an automorphic no.");
        }
    }
}