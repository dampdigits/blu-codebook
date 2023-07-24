import java.util.*;
class Sum_of_diagonal_elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,array[][]=new int[4][4];
        System.out.println("\nEnter the elements");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<4;k++)
        {
            sum+=array[k][k];
        }
        System.out.println("\nSum of left diagonal elements: "+sum);
    }
}