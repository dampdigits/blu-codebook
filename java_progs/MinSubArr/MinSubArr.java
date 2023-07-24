/*		
		Author: @its_triple_s_
		
		Program finds the minimum no. of contiguous subarrays an array can be 
		divided into such that bitwise AND of any 2 elements in a subarray = 0
		
		eg. {1,2,3,4} -> {1,2}, {3,4} Ans = 2 subarrays
		eg. {1,2,3,4,8} -> {1,2}, {3,4,8} Ans = 2 subarrays
		eg. {1,2,3,4,5} -> {1,2}, {3,4}, {5} Ans = 3 subarrays
		eg. {1,5,3,5,4} -> {1},{5},{3},{5},{4} Ans = 5 subarrays
		eg. null -> 0
*/

import java.util.*;

public class MinSubArr		//used in CodeCrypt_Q1
{
	public static int calc(int A[], int N)
	{
		int count=0, lastEleCounted=1, subArrStrt=0, lastSubArrCounted=1;
		for(int k=0; k<N-1; k++)
		{
			lastEleCounted=1;	//assuming last element was counted in a subarray
			if((A[k] & A[k+1]) == 0)
			{
				for(int l=k; l>=subArrStrt; l--)
				{
					lastSubArrCounted=1;	//assuming last subarray was counted
					if((A[k+1] & A[l]) != 0)//if an element on right doesnt give 0 with one of the elements in the current subarray
					{
						if(k+1==N-1)
							lastEleCounted=0;	//last element not counted
						
						count++;	//subarray counted except A[k+1]
						break;
					}
					else
						lastSubArrCounted=0;	//last subArray wasnt counted
				}
			}
			else
			{
				subArrStrt=k+1;	//A[k+1] becomes the 1st element of next subarray
				count++;	//prev elements form 1 subarray
				if(k+1==N-1)
					lastEleCounted=0;	//last element not counted
			}
			
		}
		if(lastEleCounted==0 || lastSubArrCounted==0)	//if last element wasnt counted or last subarray wasnt counted
			return(count+1);
		else if(count==0 && N>0)	//if all elements form 1 subarray
			return(1);
		else
			return(count);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no. of elements\nN = ");
		
		int N=sc.nextInt(), count=0;
		
		System.out.println("Enter elements");
		int A[]=new int[N];
		
		for(int i=0; i<N; i++)	//taking elements
		A[i]=sc.nextInt();
	
		count=calc(A,N);
		
		System.out.println(count);
	}
}