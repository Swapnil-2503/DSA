
//Minimum Number in a sorted rotated array

// Given an array of distinct elements which was initially sorted. This array may be rotated at some unknown point. The task is to find the minimum element in the given sorted and rotated array. 

// Example 1:

// Input:
// N = 10
// arr[] = {2,3,4,5,6,7,8,9,10,1}
// Output: 1
// Explanation: The array is rotated 
// once anti-clockwise. So minimum 
// element is at last index (n-1) 
// which is 1.
// Example 2:

// Input:
// N = 5
// arr[] = {3,4,5,1,2}
// Output: 1
// Explanation: The array is rotated 
// and the minimum element present is
// at index (n-2) which is 1.
// Your Task:
// The task is to complete the function minNumber() which takes the array arr[] and its starting and ending indices (low and high) as inputs and returns the minimum element in the given sorted and rotated array.

// Expected Time Complexity: O(LogN).
// Expected Auxiliary Space: O(LogN).

// Constraints:
// 1 <= N <= 107
// 1 <= arr[i] <= 107

//{ Driver Code Starts
    import java.io.*;
    import java.lang.*;
    import java.util.*;
    
    class Array
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            
            while(t-- > 0)
            {
                int n = Integer.parseInt(read.readLine());
                String st[] = read.readLine().trim().split("\\s+");
                
                int arr[] = new int[n];
                
                for(int i = 0; i < n; i++)
                  arr[i] = Integer.parseInt(st[i]);
                  
                System.out.println(new Solution().minNumber(arr,0,n-1));
            }
        }
        
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to find the minimum element in sorted and rotated array.
        static int minNumber(int arr[], int low, int high)
        {
            // Your code here
            if(arr[low]<=arr[high]) return arr[low];
            
            int k=arr[low];
            
             while (low < high) {
                int mid = low + (high - low) / 2;
    
                // Check if the middle element is the minimum.
                if (arr[mid] > arr[mid + 1])
                    return arr[mid + 1];
    
                // Check if the middle element is greater than the first element.
                // If true, the minimum element lies to the right of the middle.
                if (arr[mid] >= arr[low])
                    low = mid + 1;
                else
                    // If false, the minimum element lies to the left of the middle.
                    high = mid;
            }
    
            // Return the minimum element.
            return arr[low];
           
        }
    }