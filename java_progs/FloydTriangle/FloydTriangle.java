import java.util.*;
public class FloydTriangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of layers");
int n=sc.nextInt(),a=1;
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(a+" ");
a++;
}
System.out.println();
}
}
}