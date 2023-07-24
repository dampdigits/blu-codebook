import java.io.*;
import java.util.*;
class Grades
{
    public static void main(String args[])throws IOException
    {
        FileWriter fr=new FileWriter("Performance.txt");
        BufferedWriter br=new BufferedWriter(fr);
        PrintWriter pr=new PrintWriter(br);
        Scanner sc=new Scanner(System.in);
        String name1,name2,gr="";
        int p,c,b,n,total=0;
        double avg=0;
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
             System.out.println("Enter first name");
             name1=sc.next();
             System.out.println("Enter surname");
             name2=sc.next();
             System.out.println("Enter marks in Physics");
             p=sc.nextInt();
             System.out.println("Enter marks in Chemistry");
             c=sc.nextInt();
             System.out.println("Enter marks in Biology");
             b=sc.nextInt();
             total=p+c+b;
             avg=(p+c+b)/3;
             pr.println(name1);
             pr.println(name2);
             pr.println(p);
             pr.println(c);
             pr.println(b);
             pr.println(total);
             pr.println(avg);
        }
        pr.close();
        br.close();
        fr.close();
        Scanner s=new Scanner(new File("Performance.txt"));
        System.out.println("\nName          Total     Average     Grade");
        while(s.hasNext())
        {
            name1=s.next();
            name2=s.next();
            p=s.nextInt();
            c=s.nextInt();
            b=s.nextInt();
            total=s.nextInt();
            avg=s.nextDouble();
            if(avg>=80)
            gr="A";
            if(avg>=60&&avg<80)
            gr="B";
            if(avg>=40&&avg<60)
            gr="c";
            if(avg<40)
            gr="No Grade awarded";
            System.out.println(name1+" "+name2+"      "+total+"       "+avg+"         "+gr+"\n");
        }
        s.close();
    }
}