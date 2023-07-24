import java.util.*;
public class DecToHex
{
    int num[]=new int[]{10,11,12,13,14,15};
    char alpha[]=new char[]{'A','B','C','D','E','F'};
    
    public String decToHex(int n1)
    {
        if(n1==0)        
        return "0";
        else
        {
            int r = n1 % 16;

            for(int i=0;i<6;i++) // to check if any remainder lies between 10 to 15
            {
                if(r==num[i])
                {
                    return decToHex(n1/16)+alpha[i];
                }
            }
            return decToHex(n1/16)+r;

        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter a no.");
        int n=sc.nextInt();

        DecToHex obj=new DecToHex();
        String str = obj.decToHex(n);

        int length=str.length();

        if(length<4)
        for(int i=1; i<=4-length; i++)
        str="0"+str;

        System.out.println("\033[0;96mThe hexadecimal form of this no. is = "+str+"\033[0m");
    }
}