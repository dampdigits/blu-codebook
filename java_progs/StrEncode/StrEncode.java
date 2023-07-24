import java.util.*;
class StrEncode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        System.out.println("The encoded sentence is :");
        System.out.println(encode(str));
    }
    public static String encode(String str1)
    {
        int len=str1.length(),n=0;
        char ch=' ';
        String ans="";
        for(int i=0;i<len;i++)
        {
            ch=str1.charAt(i);
            n=ch;
            if(Character.isLetter(ch)==true)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                n+=3;
                else if((n>83 && n<91)||(n>115 && n<123))
                n-=19;
                else
                n+=7;
            }
            ans+=(char)n;
        }
        return ans;
    }
}