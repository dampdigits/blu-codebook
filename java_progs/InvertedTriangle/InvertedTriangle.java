import java.util.*;

class InvertedTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter a the no. of rows");
		int n=sc.nextInt();
		
		for(int r=n; r>0; r--)
		{
			for(int c=1; c<=r; c++)
				System.out.print("*");
			System.out.println();
		}
    }
}