import NumSys.*;
import java.util.*;

class DecToBi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		
        System.out.println("\nEnter a no.");
        int n=sc.nextInt();
		
        Binary obj=new Binary();
        System.out.println("The binary form of this no. is = "+obj.decToBi(n));
    }
}