 /*Use this method for string palindrome*/
import java.util.*;
public class Reverse1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.next(),rev="";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
      rev+=str.charAt(i);
    }
    System.out.println(rev);
  }
}