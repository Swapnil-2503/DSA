// Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

// Example 1:

// Input:
// 5
// 111 222 333 444 555

// Output:
// 1

// Explanation:
// A[0] = 111 //which is a palindrome number.
// A[1] = 222 //which is a palindrome number.
// A[2] = 333 //which is a palindrome number.
// A[3] = 444 //which is a palindrome number.
// A[4] = 555 //which is a palindrome number.
// As all numbers are palindrome so This will return 1.
// Example 2:

// Input:
// 3
// 121 131 20
 
// Output:
// 0

// Explanation:
// 20 is not a palindrome hence the output is 0.

// Constraints:
// 1 <=T<= 50
// 1 <=n<= 20
// 1 <=A[]<= 10000

//{ Driver Code Starts
    import java.util.*;
    class PalindromicArray{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ;i < n; i++)
                    a[i]=sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.palinArray(a , n));
            }
        }
    }
    // } Driver Code Ends
    
    
    /*Complete the Function below*/
    class GfG
    {
        public static int palinArray(int[] a, int n)
               {
                      //add code here.
                      for(int i=0;i<n;i++){
                        String b=String.valueOf(a[i]);
                        StringBuilder sb = new StringBuilder(b);
                         sb.reverse();
                       if(sb.toString().equals(b)){
                          continue;
                       }else{
                        return 0;
                       }

                      }
                      return 1;
               }
    }