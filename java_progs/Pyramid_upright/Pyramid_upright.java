import java.util.*;
public class Pyramid_upright
{
        public static void main (String args[])
    {
        Scanner sc  = new Scanner (System.in);
        System.out.println ("Enter number of levels u want in the pyramid");
        int n= sc.nextInt();    // n= total no. of rows
        for (int r=1; r<=n; r++)
        {
            for (int c=1; c<=(n+r-1); c++ )
            {
                if(r+c<=n) 
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}