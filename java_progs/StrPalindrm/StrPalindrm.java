import java.util.*;
public class StrPalindrm
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in); System.out.println("\nEnter a string"); String str=sc.next(),rev="";
      int len=str.length();
      for(int i=len-1;i>=0;i--)
      {
         rev+=str.charAt(i);
      }
      check(str,rev);
   }
   public static void check(String str1,String rev1)
   {
      if(rev1.equals(str1))
      {
         System.out.println("Its a palindrome ");
      }
      else if(rev1.equalsIgnoreCase(str1))
      {
         System.out.println("Its a palindrome on ignoring case");
      }
      else
      {
         System.out.println("Its not a palindrome");
      }
   }}