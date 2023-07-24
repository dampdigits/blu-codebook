import java.util.*;
class TimeInWords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the hours");
        int h=sc.nextInt();
        System.out.println("Enter minutes");
        int m=sc.nextInt();
        System.out.println("Enter '1' for a.m. or '2' for p.m.");
        int n=sc.nextInt();
        String plu="",a="",hh="";
        if((h>-1 && h<13) && (m>-1 && m<61) && (n==1 || n==2))
        {
            String word[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty-one","twenty-two","twenty-three","twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eight","twenty-nine","thirty"};
            if(m==1 || m==59)
            plu="minute";
            else
            plu="minutes";
            if(n==1)
            {
                hh=word[h];
                a=word[h+1]+" hours";
            }
            else
            {
                hh=word[h+12];
                if(h<12)
                a=word[h+1+12]+" hours";
                else
                a="one hour";
            }
            System.out.println("Output of "+h+":"+m);
            if(m==0)
            System.out.println(hh+" hours");
            else if(m==15)
            System.out.println("Quarter-past "+hh+" hours");
            else if(m==30)
            System.out.println("Half-past "+hh+" hours");
            else if(m==45)
            System.out.println("Quarter to "+a);
            else if(m<30)
            System.out.println(word[m]+" "+plu+" past "+hh+" hours");
            else
            System.out.println(word[60-m]+" "+plu+" to "+a);
        }
        else
        System.out.println("ERROR !! INVALID INPUT !!");
    }
}