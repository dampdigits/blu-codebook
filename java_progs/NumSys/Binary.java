package NumSys; 
public class Binary
{
    public static String decToBi(int n)
    {
        String str="";
        while(n!=0)
        {
            str=(n%2)+str;
            n/=2;
        }
        return str;
    }
}