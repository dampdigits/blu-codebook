import NumSys.*;
import java.util.*;
class BiToDec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Decimal obj=new Decimal();
        System.out.println("\nEnter a binary no.");
        int bi=sc.nextInt();
        System.out.println("The decimal form of this no. = "+obj.biToDec(bi));
    }
}