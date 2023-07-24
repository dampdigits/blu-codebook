 /*Better than Reverse1 for reversing. But not suitable for palindrome since func.s like 'equals' compare strings & not StringBuffer types */
import java.util.*;
public class Reverse2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    StringBuffer rev=new StringBuffer(str);
    rev=rev.reverse();
    System.out.println(rev);
  }
}