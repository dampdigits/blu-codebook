import java.util.*;//e.g. 153 since 153%(1+5+3)=0 
public class Niven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
int n=sc.nextInt(),n1=n,sum=0,d=0;
while(n1!=0)
{
d=n1%10;
n1/=10;
sum+=d;
}
if(n%sum==0)
{
System.out.println("Its a niven no.");
}
else
{
System.out.println("Its not a niven no.");
}
}
}