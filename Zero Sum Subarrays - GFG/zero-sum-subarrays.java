//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Long> hs=new HashMap<>();
        hs.put(0l,1l);
        
        long sum=0l;
        long ans=0l;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(hs.containsKey(sum)==true)
            {
                ans+=hs.get(sum);
                hs.put(sum,hs.get(sum)+1l);
            }
            else{
                hs.put(sum,1l);
            }
        }
        return ans;
    }
}