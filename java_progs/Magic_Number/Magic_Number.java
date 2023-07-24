class Magic_Number//Magic No.: A no. whose sum of digits is equal to 1
{
    public static void main(double n)
    {
        double sum=0,d;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            sum=sum+d;
        }
            if(sum==1)
        {
            System.out.println("\nIt is a magic no.");
        }
            else if(sum>9)
        {
            double sum1=0;
             while(sum!=0)
             {
                d=sum%10;
                sum=sum/10;
                sum1=sum1+d;
            }
            if(sum1==1)
            {
                System.out.println("\nIt is a magic no.");
            }
            else
            {
                System.out.println("\nIt is not a magic no.");
            }
        }
            else
            {
                System.out.println("\nIt is not a magic no.");
            }
        }
    }