
//problem
//Given 3 numbers {1, 3, 5}, the task is to tell the total number of ways we can
// form a number N using the sum of the given three numbers. (allowing repetitions and different arrangements).


import java.util.*;
public class repetationsformN {

    static int answer(int n){
        if(n==0) return 1;
        if(n<=0) return 0;
        return answer(n-3)+answer(n-5)+answer(n-1);
    }//time complexity O(3^n) space complexity O(n) extra space used due to recursion calls

    // now by using dynamic programming its time complexity gets reduced from O(3^n) ==> O(n)

    static int dynamic(int n){
        int tmp[]=new int[n];
        Arrays.fill(tmp, -1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(answer(n));
    }
}
