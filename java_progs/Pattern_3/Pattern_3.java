import java.util.*;
class Pattern_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of layers that u want in the pyramid");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}