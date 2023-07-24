import java.util.*;
class Palindrome_Words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a sentence");
        String str=sc.nextLine();
        System.out.println("The no. of palindrome words in this sentence are "+pw(str));
    }
    public static int pw(String str1)
    {
        String word="";
        str1=str1.trim();
        str1+=" ";
        StringBuffer rev;
        int len=str1.length(), count=0;
        char ch=' ';
        for(int i=0;i<len;i++)
        {
            ch=str1.charAt(i);
            if(ch==' ')
            {
                rev=new StringBuffer(word);
                rev=rev.reverse();
                if(word.equalsIgnoreCase(rev.toString()))
                    count++;
                word="";
            }
            else
                word+=ch;
        }
        return count;
    }
}