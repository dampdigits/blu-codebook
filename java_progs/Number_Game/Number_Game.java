import java.util.*;
class Number_Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String obj=new String("Tony");
        System.out.println("\nAI:\tHi, I am "+obj+", an Artificial Intelligence.\n   \tWhat is your name ?");
        String name=sc.nextLine();
        System.out.print("\nAI:\tSo "+name+", lets play a game where I'll guess the number u think of.\n   \tTake a two or three digit number in your mind.\n   \tNow reverse it such that the resulting number is not greater than the original number."); 
        System.out.println("\n   \tIf the resulting number is greater, then assume it to be your original number and the original number to be the reversed number.\n   \tNow subtract the reversed number from the original number.");
        System.out.println("\n   \tNow "+name+", tell me whether you took a two-digit or three-digit number. Type 2 or 3.");
        int dig=sc.nextInt();
        if(dig==2||dig==3)
        {
            System.out.println("\nAI:\tOk, now tell me the last digit of the remainder after subtraction.");
            int rl=sc.nextInt();
            System.out.println("\nAI:\tWhat is the last digit of the reversed number ?");
            int ff=sc.nextInt(), fl=(ff+rl)%10, orig, rev, rem;
            if(dig==2)
            {
                orig=ff*10+fl;
                rev=fl*10+ff;
                rem=orig-rev;
                System.out.print("\nAI:\tNow "+name+", I will tell you what number you took in mind and the reversed number as well as the remainder !\n   \tThe remainder is "+rem+", the reversed number is "+rev+" and the original number is "+orig+" !\n   \tThank You "+name+" for trying this game. Hope you enjoyed it :)");
            }
            else
            {
                System.out.println("\nAI:\tEnter the middle digit of the reversed number");
                int fm=sc.nextInt();
                orig=ff*100+fm*10+fl;
                rev=fl*100+fm*10+ff;
                rem=orig-rev;
                System.out.print("\nAI:\tNow "+name+", I will tell you what number you took in mind and the reversed number as well as the remainder !\n   \tThe remainder is "+rem+", the reversed number is "+rev+" and the original number is "+orig+" !\n   \tThank You "+name+" for trying this game. Hope you enjoyed it :)");
            }
        }
        else
        {
            System.out.print("\nAI:\tSorry! WRONG number of digits taken please TRY AGAIN !");
        }
    }
}