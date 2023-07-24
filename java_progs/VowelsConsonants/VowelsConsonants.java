import java.util.*;
class VowelsConsonants
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int len=str.length(),count=0,v[]=new int[5],c[]=new int[21],vc=0,cc=0;
        char ch=' ',vow[]=new char[5],con[]=new char[21];
        for(int i=65;i<91;i++)
        {
            for(int j=0;j<len;j++)
            {
                ch=str.charAt(j);
                if(ch==(char)i)
                count++;
            }
            if(i==65||i==69||i==73||i==79||i==85)
            {
                vow[vc]=(char)i;
                v[vc]=count;
                vc++;
            }
            else
            {
                con[cc]=(char)i;
                c[cc]=count;
                cc++;
            }
            count=0;
        }
        System.out.println("\nVOWEL(S) :");
        for(int i=0;i<5;i++)
        if(v[i]!=0)
        System.out.println(vow[i]+"="+v[i]);
        System.out.println("\nCONSONANT(S) :");
        for(int i=0;i<21;i++)
        if(c[i]!=0)
        System.out.println(con[i]+"="+c[i]);
    }
}