import java.util.*;
class Currency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nEnter the amount");
        int n=sc.nextInt(), note[]=new int[]{2000,500,200,100,50,20,10,5,2,1}, f[]=new int[10], i=0, flag=0;
        while(n!=0)
        {            
            f[i]=n/note[i];
            n%=note[i];
            i++;
        }
        for(int j=0;j<10;j++)
        {
            if(f[j]!=0)
            {
                if(flag==0)
                {
                    System.out.print("= ("+note[j]+"*"+f[j]+") ");
                    flag=1;
                }
                else
                System.out.print("+ ("+note[j]+"*"+f[j]+") ");
            }
        }
    }
}