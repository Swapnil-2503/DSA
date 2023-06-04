

import java.util.*;

public class practise1{
    public static int Factorial(int a){
        if(a==1) return 1;
        return a*Factorial(a-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Factorial(n));
    }
}