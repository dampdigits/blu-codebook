import java.util.*;//better prog done in android
class Fibonacci
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        
        System.out.print("1 1 ");
        
        int sum=0,a=1,b=1;
        
        while(sum<n)
        {
            sum=a+b;
            if(sum<=n)
            {
                System.out.print(sum+" ");
                a=b;
                b=sum;
            }
        }
    }
}