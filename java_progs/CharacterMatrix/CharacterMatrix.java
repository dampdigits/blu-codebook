import java.util.*;
class CharacterMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int c=sc.nextInt();
        System.out.println("Enter 1st character");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter 2nd character");
        char ch2=sc.next().charAt(0);
        System.out.println("Enter 3rd character");
        char ch3=sc.next().charAt(0), arr[][]=new char[4][4];
        System.out.println("\nThe character String is as follows :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j||(i+j==c-1))
                System.out.print(ch3+" ");
                else if((i<(r-1)/2 || i>r/2)&&(j!=0&&j!=c-1))
                System.out.print(ch1+" ");
                else
                System.out.print(ch2+" ");
            }
            System.out.println();
        }
    }
}