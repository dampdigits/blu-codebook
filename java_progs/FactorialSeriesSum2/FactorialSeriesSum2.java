import java.util.*;

class FactorialSeriesSum2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
		int n=sc.nextInt();
		double sum=0.0;
		for(int i=0; i<=n; i++)//to calc each term and add to sum
		{
			double t=0.0, f1=1, f2=1;
			
			for(int j=2; j<=i; j++)
			{
				f1*=j;	//numerator's factorial
			}
			
			for(int j=2; j<=(i+1); j++)
			{
				f2*=j;	//denominator's factorial 
			}
			
			t=f1/f2;
			sum+=t;
		}
		System.out.println("Sum = "+sum);
    }
}