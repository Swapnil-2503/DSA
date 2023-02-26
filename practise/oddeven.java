package practise;
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // boolean b=false;
        // if(a%2==0) b=true;

        // if(b&true) System.out.println("EVEN");
        // else  System.out.println("ODD");
        if((a&1)==1) System.out.println("ODD");
        else System.out.println("EVEN");
    }
}
