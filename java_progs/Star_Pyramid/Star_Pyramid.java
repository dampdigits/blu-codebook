import java.util.*;
class Star_Pyramid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of layers");
        int n=sc.nextInt(),n1=n-1,n2=n;
        for(int i=1;i<=n;i++)
        {
            ++n1;
            --n2;
            for(int j=1;j<=n1;j++)
            {
                if(j<=n2)
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