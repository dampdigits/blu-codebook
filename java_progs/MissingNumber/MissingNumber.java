import java.util.*;
public class MissingNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[20],flag;
System.out.println("Enter no.s b/w 0-21, u may repeat certain no.s or add no.s which r out of the range");
for(int i=0;i<20;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Missing no.(s) are:");
for(int j=1;j<=20;j++)
{
flag=0;
for(int k=0;k<20;k++)
{
if(j==arr[k])
{
flag=1;
}
}
if(flag==0)
{
System.out.println(j);
}
}
}
}