class Prime
{
    public static void main(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The no. is prime");
        }
        else
        {
            System.out.println("The no. is not prime");
        }
    }
}