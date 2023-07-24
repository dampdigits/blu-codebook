import java.util.*;
class Replace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine(), s="";
        str=str.trim();
        str=" "+str;
        System.out.println("Enter the word by which u want to replace the word with");
        String word =sc.nextLine();
        System.out.println("Enter the word no. which u want to replace if the first word is assumed to be 'no. 1'");
        int n=sc.nextInt(), len=str.length(), count=0, flag=0;
        char ch1=' ',ch2=' ';
        for(int i=0;i<len-1;i++)
        {
            ch1=str.charAt(i);
            ch2=str.charAt(i+1);
            if(ch1==' ' && ch2!=' ')
            {
                count++;
                s+=ch1;
                if(flag==0 && count==n)
                {
                    s+=word;
                    flag=1;
                }
            }
            if(count==n)
            i++;
            else
            s+=ch1;
        }
        System.out.println("Modified sentence :\n"+s+str.substring(len-1));
    }
}