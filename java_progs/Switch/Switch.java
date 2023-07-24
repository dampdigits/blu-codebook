import java.util.*;
public class Switch
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a roll no.");
   int roll=sc.nextInt();
   switch(roll)
   {
     case 24:
     System.out.println("Roll of Soham");
     break;
     case 37:
     System.out.println("Roll of Sameer");
     break;
     case 36:
     System.out.println("Roll of Tiyasha");
     break;
     default:
     System.out.println("No student with roll "+roll);
   }
  }
}