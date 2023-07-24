import java.util.*;
class Pattern_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the limit");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    }