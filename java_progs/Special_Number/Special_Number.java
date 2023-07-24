import java.util.*;//eg. 145 since 1!+4!+5!=145 
class Special_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if(special(n)==true)
            System.out.println("Its a special no.");
        else
            System.out.println("Its not a special no.");
    }
    public static boolean special(int n1)
    {
        int sum=0, n2=n1;
        while(n2!=0)
        {
            int r=n2%10, f=1;
            for(int i=1;i<=r;i++)
                f*=i;
            sum+=f;
            n2/=10;                                 
        }
        if(sum==n1)
            return true;
        else
            return false;
    }
}