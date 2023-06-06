//Paths to reach origin

// You are standing on a point (n, m) and you want to go to origin (0, 0) by taking steps either left or up i.e. from each point you are allowed to move either in (n-1, m) or (n, m-1). Find the number of paths from point to origin.

// Example 1:

// Input:

// N=3, M=0
// Output: 1
// Explanation: Path used was - 
//              (3,0)  --> ( 2,0) --> (1,0) --> (0,0).
//              We can see that there is no other path
//              other than this path for this testcase.
 

// Example 2:

// Input:
// N=3, M=6
// Output: 84 

// Your Task:
// Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function ways() that takes array N and integer M as parameters and returns the total number of paths from point(n,m) to the origin(0,0) % 1000000007.
 

// Expected Time Complexity: O(N*M).
// Expected Auxiliary Space: O(N*M).

// Constraints:
// 1 ≤ N, M ≤ 500

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
          int[][] dp = new int[n + 1][m + 1];
        
        // Base case: There is only one way to reach any point on the first row or first column.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 1;
        }
        
        // Calculate the number of paths for each point (i, j) based on the number of paths from its adjacent points.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
            }
        }
        
        return dp[n][m];
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
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    int x=Integer.parseInt(elements[0]);
		    int y=Integer.parseInt(elements[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.ways(x,y));
		}
	}
}
// } Driver Code Ends