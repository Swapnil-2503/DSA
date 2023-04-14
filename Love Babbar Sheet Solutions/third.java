// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with a positive number.
 

// Example 1:

// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Explanation : Positive elements : 9,4,5,0,2
// Negative elements : -2,-1,-5,-3
// As we need to maintain the relative order of
// postive elements and negative elements we will pick
// each element from the positive and negative and will
// store them. If any of the positive and negative numbers
// are completed. we will continue with the remaining signed
// elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

// Example 2:

// Input:
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0
// Explanation : Positive elements : 5,2,4,7,1,8,0
// Negative elements : -5,-2,-8
// As we need to maintain the relative order of
// postive elements and negative elements we will pick
// each element from the positive and negative and will
// store them. If any of the positive and negative numbers
// are completed. we will continue with the remaining signed
// elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
// Your Task:  

// You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

 

// Constraints:
// 1 ≤ N ≤ 107
// -106 ≤ Arr[i] ≤ 107

//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here

        //here we use two pointer
        int[] posArr = new int[n];
        int[] negArr = new int[n];
        int posIndex = 0, negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                posArr[posIndex++] = arr[i];
            } else {
                negArr[negIndex++] = arr[i];
            }
        }
        
        // alternate between positive and negative arrays
        int[] resArr = new int[n];
        int i = 0, j = 0, index = 0;
        while (i < posIndex && j < negIndex) {
            if (index % 2 == 0) {
                resArr[index++] = posArr[i++];
            } else {
                resArr[index++] = negArr[j++];
            }
        }
        
        // add remaining elements
        while (i < posIndex) {
            resArr[index++] = posArr[i++];
        }
        while (j < negIndex) {
            resArr[index++] = negArr[j++];
        }
        
        // copy output array to input array
        for (int k = 0; k < n; k++) {
            arr[k] = resArr[k];
        }
    }
}