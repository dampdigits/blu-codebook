import java.util.*;
class Bank_Account
{
    String name,actype;
    long acno;
    double bal;
    Bank_Account()
    {
        name="";
        actype="";
        acno=0;
        bal=0.0;
    }
    Bank_Account(String name1,String actype1,long acno1,double bal1)
    {
        name=name1;
        actype=actype1;
        acno=acno1;
        bal=bal1;
    }
    void deposit(double amt)
    {
        bal=bal+amt;
    }
    void withdraw(double wit)
    {
         if(wit<=bal)
        {
        bal=bal-wit;
        }
        else
        {
        System.out.println("You have insufficient balance");
        }
    }
    void display()
    {
        System.out.println("The name of the account holder is "+name);
        System.out.println("Balance:  "+bal);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String a=sc.nextLine();
        System.out.println("Enter your account type");
        String b=sc.nextLine();
        System.out.println("Enter your account no.");
        long c=sc.nextLong();
        System.out.println("Enter the balance present in your account");
        double d=sc.nextDouble();
        System.out.println("Enter the amount you want to deposit");
        double e=sc.nextDouble();
        System.out.println("Enter the amount you want to withdraw");
        double f=sc.nextDouble();
        Bank_Account obj=new Bank_Account(a,b,c,d);
        obj.deposit(e);
        obj.withdraw(f);
        obj.display();
    }
}