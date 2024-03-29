//Searching an element in a sorted array

// Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.


// Example 1:

// Input:
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
// Output: 1
// Exlpanation: Since, 6 is present in 
// the array at index 4 (0-based indexing),
// output is 1.
 

// Example 2:

// Input:
// N = 5, K = 2
// arr[] = {1,3,4,5,6}
// Output: -1
// Exlpanation: Since, 2 is not present 
// in the array, output is -1.
 

// Your Task:
// You don't need to read input or print anything. Complete the function searchInSorted() which takes the sorted array arr[], its size N and the element K as input parameters and returns 1 if K is present in the array, else it returns -1. 


// Expected Time Complexity: O(Log N)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1 <= N <= 106
// 1 <= K <= 106
// 1 <= arr[i] <= 106

 //{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int searchInSorted(int arr[], int N, int k)
    {
        
        // Your code here
        int max=N-1;;
        int min=0;
        int mid=0;
        
        while(min<=max){
             mid=(max+min)/2;
            if(arr[mid]==k) return 1;
            else if(arr[mid]<k){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
           
        }
        return -1;
        
    }
}