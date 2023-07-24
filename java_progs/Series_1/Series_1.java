import java.util.*;
class Series_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of times u want the series 2 b printed");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=i;
            int b=i+1;
            System.out.print(a+"/"+b);
            if(a<n)
            {
                System.out.print("+");
            }
        }
    }
}