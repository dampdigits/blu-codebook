import java.util.*;
public class IntPalindrm
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no.");
    long n=sc.nextLong(),rem=0,rev=0,n1=n;
    while(n1!=0)
    {
      rem=n1%10;
      n1/=10;
      rev=(rev*10)+rem;
    }
    if(rev==n)
    {
      System.out.println("Palindrome");
    }
    else
    {
     System.out.println("Not Palindrome");
    }
  }
}