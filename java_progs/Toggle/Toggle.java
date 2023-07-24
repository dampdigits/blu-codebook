import java.util.*;
public class Toggle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
String sen=sc.nextLine(),sen1="";
char ch=' ';
sen=sen.trim();
int len=sen.length(),n=0;
for(int i=0;i<len;i++)
{
ch=sen.charAt(i);
n=ch;
if(n>64&&n<91)
{
n=n+32;
sen1+=(char)n;
}
else if(n>96&&n<123)
{
n=n-32;
sen1+=(char)n;
}
else
{
sen1=sen1+ch;
}
}
System.out.println(sen1);
}
}