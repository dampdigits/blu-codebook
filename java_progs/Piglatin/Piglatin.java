import java.util.*;
public class Piglatin
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String str=sc.nextLine();
    String c="",rem="",word="";
    str=str.trim();
    char start=str.charAt(0),n=' ';
    int len=str.length(),flag=0;
    if(start=='a'||start=='e'||start=='i'||start=='o'||start=='u'||start=='A'||start=='E'||start=='I'||start=='O'||start=='U')
    {
      word=str+"yay";
      System.out.println("Piglatin of "+str+" is "+word);
    }
    else
    {
      for(int i=1;i<len;i++)
      {
        n=str.charAt(i);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
        {
          c=str.substring(0,i);
          rem=str.substring(i);
          word=rem+c+"ay";
          System.out.println("Piglatin of "+str+" is "+word);
          flag=1;
          break;
        }
      }
      if(flag==0)
      {
        rem=str.substring(len-1);
        c=str.substring(0,len-1);
        word=rem+c+"ay";
        System.out.println("Piglatin of "+str+" is "+word);
      }
    }
  }
}