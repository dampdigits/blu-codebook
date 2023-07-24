//19=(1*1)+(9*9)=1+81=82=(8*8)+(2*2)=64+4=68=(6*6)+(8*8)=36+64=100=(1*1)+(0*0)+(0*0)=1
import java.util.*;

class HappyNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt(), sum=0;
		
		while (sum==0 || sum >9) //will repeat if sum isn't single digit
		{
			sum=0;
			
			while(n>0)	//to calc sum of sq. digits
			{
				int rem=n%10;	//finding remainder
				n/=10;			//reducing n by one digit
				sum+=(rem*rem);	//adding sq. of digit
			}
			
			n=sum;
		}
		if(sum == 1)
			System.out.println("Its a Happy No.");
		else
			System.out.println("Its not a Happy No.");
    }
}