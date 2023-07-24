import java.util.*;

class CodeCrypt1
{
	int A[], count=0, lastEleCounted=0, lastSubArrCounted=0;
	static Scanner sc=new Scanner(System.in);
	
	public void input(int N)
	{
		A=new int[N];
		String str=sc.nextLine();
		String elements[]=str.trim().split(" ");	//taking elements
		
		for(int i=0; i<N; i++)
			A[i]=Integer.parseInt(elements[i]);
	}
	
	
	public void calc(int N)
	{
		int subArrStrt=0;
		lastEleCounted=1;
		lastSubArrCounted=1;
		
		for(int k=0; k<N-1; k++)
		{
			lastEleCounted=1;	//assuming last element was counted in a subarray
			
			if((A[k] & A[k+1]) == 0)
			calcAgain(k, subArrStrt, N);
		
			else
			{
				subArrStrt=k+1;	//A[k+1] becomes the 1st element of next subarray
				count++;		//prev elements form 1 subarray
				
				if(k+1==N-1)
					lastEleCounted=0;	//last element not counted
			}
			
		}
		if(lastEleCounted==0 || lastSubArrCounted==0 || (count==0 && N>0))	/*if last element wasnt counted
		or last subarray wasnt counted or all elements form just 1 subarray */
			count+=1;
	}
	
	
	public void calcAgain(int k, int subArrStrt, int N)
	{
		for(int l=k; l>=subArrStrt; l--)
		{
			lastSubArrCounted=1;	//assuming last subarray was counted
			if((A[k+1] & A[l]) != 0)//if encountered element doesnt give 0 with one of the elements in the current subarray
			{
				if(k+1==N-1)
				lastEleCounted=0;	//last element not counted
				
				count++;			//subarray counted except A[k+1]
				break;
			}
			else
			lastSubArrCounted=0;	//last subArray wasnt counted
		}
	}
	
	
	public void display()
	{
		System.out.println(count);
	}
	
	
    public static void main(String args[])
    {   
		int T=sc.nextInt();		//T-> test cases
		
		for(int i=1; i<=T; i++)	//loop for each test case
		{
			int N=sc.nextInt();	//N-> No. of elements in array
			
			CodeCrypt1 obj=new CodeCrypt1();	//creating object
			
			obj.input(N);	//taking elements
			obj.calc(N);	//calculating min. subarrays
			obj.display();	//printing output
		}
    }
}