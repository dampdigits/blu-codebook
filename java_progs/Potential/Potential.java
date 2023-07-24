import java.util.*;
class Potential
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine(), word="";
        str=str.trim();
        int len=str.length();
        char ch=' ';
        System.out.println("The potential of the word(s) :");
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(Character.isLetter(ch))
            word+=ch;
            if(ch==' ')
            {
                System.out.println(word+" = "+pot(word));
                word="";
            }
        }
    }
    public static int pot(String w)
    {
        int p=0, l=w.length(), n=0;
        char ch=' ';
        for(int i=0;i<l;i++)
        {
            ch=w.charAt(i);
            n=ch;
            p+=n;
        }
        return p;
    }
}