import java.util.*;
class Test1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        if(name.length() == 0)
        {
            return;
        }
        System.out.println("Hi " + name + "!");
    }
}