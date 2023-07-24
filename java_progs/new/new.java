import java.util.*;

class new
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("HEIGHT: ");
		int height = sc.nextInt();
		int mid = height /2 + 1;
		
		for (int i = 1; i <= height; i++)
		{
			for (int j= 1; j <= mid; j++)
			{
				if ((i < mid && (i + j <= mid)) || (i > mid && (j <= i - mid) ))
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
    }
}
	