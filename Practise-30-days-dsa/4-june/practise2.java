
import java.util.*;
public class practise2 {
    public static int Fibonancci(int a,int b,int n){
        int sum=a+b;
        a=b;
        b=sum;
        n--;
        if(n==2) return b;
        if(n==1) return 1;
        if(n==0) return 1;
        return Fibonancci(a, b, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(Fibonancci(1, 1, n));
    }
}
