import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 no.s");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int sum=n1+n2+n3+n4+n5;
		double dis1, dis2, dis3, dis4, dis5;
		double avg=sum/5;
		if(avg>n1)
			dis1=avg-n1;
		else
			dis1=n1-avg;
        if(avg>n2)
			dis2=avg-n2;
		else
			dis2=n2-avg;
		if(avg>n3)
			dis3=avg-n3;
		else
			dis3=n3-avg;
		if(avg>n4)
			dis4=avg-n4;
		else
			dis4=n4-avg;
		if(avg>n5)
			dis5=avg-n5;
		else
			dis5=n5-avg;
		double min=dis1;
		if(min>dis1)
			min=dis1;
		if(min>dis2)
			min=dis2;
		if(min>dis3)
			min=dis3;
		if(min>dis4)
			min=dis4;
		if(min>dis5)
			min=dis5;
		double close = avg + min;
		System.out.println(close);
    }
}