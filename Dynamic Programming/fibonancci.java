//package Dynamic Programming;
import java.util.*;
public class fibonancci {
  static  int  fibonancciRecurse(int n){
        if(n<=1) return n;
        return fibonancciRecurse(n-1) +fibonancciRecurse(n-2);
    }
    static int dynamic(int n){
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonancciRecurse(n));
        System.out.println(dynamic(n));
    }
}
