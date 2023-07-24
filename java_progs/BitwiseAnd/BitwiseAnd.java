import java.util.*;
public class BitwiseAnd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 no.s");
		System.out.print("no. 1 = ");
		int n1=sc.nextInt();
		System.out.print("no. 2 = ");
		int n2=sc.nextInt();
		int ans=n1&n2;
		System.out.println(n1+"&"+n2+" = "+ans);
	}
}