import java.util.*;
class Three_Shift_Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("The 3-shift code of the above string is :");
        System.out.println(tsc(str));
    }
    public static String tsc(String str1)
    {
        int len=str1.length(), n=0;
        char ch=' ';
        String ans="";
        for(int i=0;i<len;i++)
        {
            ch=str1.charAt(i);
            n=ch;
            if((64<n&&n<88)||(96<n&&n<120))
            {
                n+=3;
                ans+=(char)n;
            }
            else if((87<n&&n<91)||(119<n&&n<123))
            {
                n-=23;
                ans+=(char)n;
            }
            else
            ans+=ch;
        }
        return ans;
    }
}