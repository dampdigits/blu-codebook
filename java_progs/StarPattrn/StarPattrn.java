import java.util.*;
public class StarPattrn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of layers");
int n=sc.nextInt();
for(int i=n;i>0;i--)
{
for(int j=i;j>0;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}