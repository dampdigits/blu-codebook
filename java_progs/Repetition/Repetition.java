import java.util.*;
public class Repetition
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char n=' ',n1=' ',e=' ';
    System.out.println("Enter a sentence ");
    String sen=sc.nextLine();
    sen=sen.trim();
    sen=sen.toUpperCase();
    int len=sen.length(),count=0;
    for(int i=0;i<len-1;i++)
    {
      n=sen.charAt(i);
      n1=sen.charAt(i+1);
      if(n!=e&&n==n1)
      {
      if(n!=' ')
        count++;
        e=n;
        i++;
      }
    }
    System.out.println(count);
  }
}