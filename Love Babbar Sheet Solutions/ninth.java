// Given an array a[ ] of N elements. Consider array as a circular array i.e. element after an is a1. The task is to find maximum sum of the absolute difference between consecutive elements with rearrangement of array elements allowed i.e. after any rearrangement of array elements find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.
//https://practice.geeksforgeeks.org/problems/swap-and-maximize5859/1?page=1&curated[]=7&sortBy=submissions

// Example 1:

// Input:
// N = 4
// a[] = {4, 2, 1, 8}
// Output: 
// 18
// Explanation: Rearrangement done is {1, 8, 
// 2, 4}. Sum of absolute difference between 
// consecutive elements after rearrangement = 
// |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| = 
// 7 + 6 + 2 + 3 = 18.
// Example 2:

// Input:
// N = 2
// a[] = {10, 12}
// Output: 
// 4
// Your Task:
// This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function maxSum() that takes array a[ ] and its size N as input parameters and return the maximum sum using above method.

// Expected Time Complexity: O(N*logN)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ N ≤ 105
//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java




class GFG
{
    long maxSum(long arr[] ,int n)
    {
    long sum=0;
    sum=Math.abs(arr[n]-arr[0]);
    for(int i=1;i<n-1;i++) sum=sum+Math.abs(arr[i]-arr[i+1]);
      return sum;  
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(a1[i]);
            }
            GFG ob=new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.maxSum(arr,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends