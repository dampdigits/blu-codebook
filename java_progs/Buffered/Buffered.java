import java.io.*;
public class Buffered
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a word");
    String str=sc.readLine();
    System.out.println("Enter a no.");
    int n=Integer.parseInt(sc.readLine());
    System.out.println("Enter a character");
    char ch=sc.readLine().charAt(0);
    System.out.println("Enter a float");
    float fl=Float.parseFloat(sc.readLine());
    System.out.println("Enter a double");
    double d=Double.parseDouble(sc.readLine());
    System.out.println(str);
    System.out.println(n);
    System.out.println(ch);
    System.out.println(fl);
    System.out.println(d);
  }
}