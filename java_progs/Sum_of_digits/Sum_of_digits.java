class Sum_of_digits
{
    public static long main(long n)
    {
        long s=0,d;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s+=d;
        }
        return s;
    }
}