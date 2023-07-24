import java.util.*;
class DecimalToBinary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a no.");
        int n=sc.nextInt();
		
        System.out.println("Enter '1' to get the output using an array or '2' to get it using a string variable");
        int s=sc.nextInt();
		
        switch(s)
        {
            case 1:
            tobinary(n);
            break;
            case 2:
            System.out.println("Binary of decimal no. "+n+"= "+toBinary(n));
            break;
            default:
            System.out.println("WRONG INPUT");
            break;
        }
    }
    public static void tobinary(int n1)
    {
        int n2=n1, arr[]=new int[50], i=0;
        while(n2!=0)
        {
            arr[i]=n2%2;
            n2/=2;
            i++;
        }
        System.out.print("Binary of decimal no. "+n1+"= ");
        for(int j=i-1;j>=0;j--)
        System.out.print(arr[j]);
        System.out.println();
    }
    public static String toBinary(int n1)
    {
        String bi="";
        while(n1!=0)
        {
            bi=(n1%2)+bi;
            n1/=2;
        }
        return bi;
    }
}