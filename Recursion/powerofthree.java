package Recursion;
import java.util.*;
public class powerofthree {
    public static boolean CheckPower(int n){
    if (n == 0) return false;
	if (n == 1) return true;
	return n%3==0 && CheckPower(n / 3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(CheckPower(n));
    }
}
//time complexity O(n/3)
//space complexity O(n/3)