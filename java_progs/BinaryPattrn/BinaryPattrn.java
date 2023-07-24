import java.util.*;
public class BinaryPattrn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of layers");
int n=sc.nextInt(),a=1;
for(int i=1;i<=n;i++)
{
if (i%2==0)
{
a=0;
}
else
{
a=1;
}
for(int j=1;j<=i;j++)
{
System.out.print(a+" ");
if (a==1)
{
a--;
}
else
{
a++;
}
}
System.out.println();
}
}
}