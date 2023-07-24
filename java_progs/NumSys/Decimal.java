package NumSys;
public class Decimal
{
    public static int biToDec(int n)
    {
        int sum=0, i=0;
        while(n!=0)
        {
            sum+=(n%10)*Math.pow(2,i);
            i++;
            n/=10;
        }
        return sum;
    }
}