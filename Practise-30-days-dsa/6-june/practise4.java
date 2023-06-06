//Count numbers containing 4
// Count the numbers between 1 to N containing 4 as a digit.

 

// Example 1:

// Input:
// N = 9
// Output:
// 1
// Explanation:
// 4 is the only number between 1 to 9
// which contains 4 as a digit.
// Example 2:

// Input:
// N = 14
// Output:
// 2
// Explanation:
// 4 and 14 are the only number between 1
// to 14 that contains 4 as a digit.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function countNumberswith4() which takes an Integer N as input and returns the answer.

 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1 <= N <= 105

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
          int[] dp = new int[N + 1];
        dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1];
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 4) {
                    dp[i]++;
                    break;
                }
                num /= 10;
            }
        }

        return dp[N];
    }
};