import java.util.*;
class CaesarChipper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        System.out.println("The CaesarChipper form of the above sentence is as follows :");
        System.out.println(cc(str));
    }
    public static String cc(String str1)
    {
        int l=str1.length(),n=0;
        char ch=' ';
        String ans="";
        for(int i=0;i<l;i++)
        {
            ch=str1.charAt(i);
            n=ch;
            if(Character.isLetter(ch))
            {
                if(64<n&&n<78||96<n&&n<110)
                    n+=13;
                else 
                    n-=13;
                ans+=(char)n;
            }
            else
            ans+=ch;
        }
        return ans;
    }
}