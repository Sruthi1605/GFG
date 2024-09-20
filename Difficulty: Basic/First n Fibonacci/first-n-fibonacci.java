//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
   
    public static long[] printFibb(int n) 
    {
        if(n<=0){
            return new long[-1];
        }
        
        long[] res = new long[n];
        
        if(n==1){
            res[0]=1;
            return res;
        }  
        
        
        long a=1,b=1;
        res[0]=1;
        res[1]=1;
        for(int i=2;i<n;i++){
            long next = a+b;
            res[i] = next;
            a=b;
            b=next;
          
        }
        return res;
    }
}