import java.util.*;
class X
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine(), xtr="X";
        str=str.trim();
        char ch=' ';
        int len=str.length();
        for(int i=1;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch==' '&& str.charAt(i++)!=' ')
            {
                xtr+=" X";
                i++;
            }
            else
            xtr+=ch;
        }
        System.out.println("Modified sentence :\n"+xtr);
    }
}