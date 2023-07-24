import java.util.*;
public class Pattern1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of layers");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}