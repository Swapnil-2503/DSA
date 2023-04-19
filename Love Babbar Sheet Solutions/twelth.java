// Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

// Example 1:

// Input:
// Str = geeksforgeeks
// Output: geksfor
// Explanation: After removing duplicate
// characters such as e, k, g, s, we have
// string as "geksfor".
// Example 2:

// Input:
// Str = HappyNewYear
// Output: HapyNewYr
// Explanation: After removing duplicate
// characters such as p, e, a, we have
// string as "HapyNewYr".
// Your Task:
// Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't to print answer or take inputs.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N ≤ 105
// String contains uppercase and lowercase english letters.

//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
   boolean b[]=new boolean[26];
   StringBuilder sb=new StringBuilder();
   for(int i=0;i<str.length();i++){
    char c=str.charAt(i);
    if(!b[c]){
        sb.append(c);
        b[c] = true;
    }
   }
   return sb.toString();
    }
}

