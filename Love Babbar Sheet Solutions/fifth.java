// Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

// Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).

// Example 1:

// Input:
// A[] = {1, 4, 45, 6, 0, 19}
// x  =  51
// Output: 3
// Explanation:
// Minimum length subarray is 
// {4, 45, 6}

// Example 2:
// Input:
// A[] = {1, 10, 5, 2, 7}
//    x  = 9
// Output: 1
// Explanation:
// Minimum length subarray is {10}
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function smallestSubWithSum() which takes the array A[], its size N and an integer X as inputs and returns the required ouput.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N, x ≤ 105
// 1 ≤ A[] ≤ 104

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 

        //two pointer aproach with O(n) O(1) space 
        int minLen = n + 1;
        int left = 0, right = 0, sum = 0;

        while (right < n) {
            // Add the next element to the sum
            sum += a[right];

            // If sum becomes greater than x, remove elements from the left
            while (sum > x && left <= right) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= a[left];
                left++;
            }

            // Move the right pointer
            right++;
        }

        return (minLen == n + 1) ? 0 : minLen;
    }
}

