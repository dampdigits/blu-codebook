import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while (testcases-- > 0)
		{
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for (int index = 0; index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    int ans = obj.partition(n,arr) ;
		    System.out.println(ans);
		}
		
	}
}

class Solution
{
    
    int partition(int n, int a[]) 
    { 
        int bits[] = new int[32];
        Arrays.fill(bits,0);
		int ans = 0 ;
		for (int i = 0 ; i < n ; ++i)
{
			int cur[] = new int[32];
            Arrays.fill(cur,0);
			for (int j = 0 ; j < 32 ; ++j)
{
				if(((a[i] >> j) & 1) !=0)
{
					cur[j] = 1;
				}
			}
			boolean ok = true; 
			for (int j = 0 ; j < 32 ; ++j)
{
				if (bits[j]!=0 && cur[j]!=0)
{
					ok = false;
					break ;
				}
			}
			if (!ok)
{
				ans ++ ;
				Arrays.fill(bits,0);
			}
			for (int j = 0 ; j < 32 ; ++j)
			{
				bits[j]  += cur[j] ;
			}
		}
		return ans + 1;
    } 
}