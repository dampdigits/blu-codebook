import java.util.*;
public class Pyramid_Chain_Horizontal
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println ("\nEnter number of pyramids you want");
        int N = sc.nextInt();
        System.out.println ("\nEnter number of levels you want in one pyramid");
        int R = sc.nextInt(), C=(2*R)-1;
        
        for(int r=1; r<=R; r++) //for rows
        {
            for(int block=1; block<=N; block++ ) //for each pyramid(block)
            {
                int c;
                if(block%2==0) //for reverse pyramid
                {
                    for (c=1; (r+c)<=(2*R); c++) //for columns
                    {
                        if(c<r) 
                        {
                            System.out.print(" ");
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                else //for upstraight pyramid
                {
                    for (c=1;c<=(R+r-1);c++) //for columns
                    {
                        if(r+c<=R) 
                        {
                            System.out.print(" ");
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                }
                for(int i=1;i<=C-(c-1);i++) //for spaces after pyramid
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}