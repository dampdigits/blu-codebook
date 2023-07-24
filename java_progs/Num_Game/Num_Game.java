import java.util.*;
public class Num_Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Imagine you want to run a business, and have some amount of money.");
        System.out.println("Then you borrowed the same amount from a friend.");
        System.out.println("Assuming its not enough for your business, you borrowed some the bank.");
        System.out.println("Enter the amount of money you borrowed from the bank.");
        double n=sc.nextInt();
        System.out.println("Now somehow you decided to invest only half the money you have.");
        System.out.println("And return the sum you borrowed from your friend.");
        System.out.println("If I'm not wrong the amount of money you are left with is "+ n/2);
    }
}