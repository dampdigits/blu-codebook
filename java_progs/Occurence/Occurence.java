import java.util.*;
class Occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        String word="";
        char ch=' ';
        str=str.trim();
        str+=" ";
        int len=str.length();
        int count=0;
        System.out.println("Enter a word to be searched");
        String x=sc.nextLine();
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                if(x.equalsIgnoreCase(word))
                {
                    count++;
                }
                word="";
            }
        }
        System.out.println("Search word occurs: "+count+" times");
    }
}