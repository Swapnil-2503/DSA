//Print first n Fibonacci Numbers

// Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

// Example 1:

// Input:
// N = 5
// Output: 1 1 2 3 5
// Example 2:

// Input:
// N = 7
// Output: 1 1 2 3 5 8 13
// Your Task:
// Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).
// Note: This space is used to store and return the answer for printing purpose.

// Constraints:
// 1<= N <=84

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
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long a[]=new long[n];
        a[0]=1;
        if(n==1){
            return a;
        }
        a[1]=1;
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a;
    }
}