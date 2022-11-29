import java.util.*;

public class leftshiftANDrightshift {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // bitwise left shift it doubles the balue a<<1 //2*a
     
          System.out.println(a<<b);//a*2^b

        //   `bitwise right shift a>>b a/2*b //a>>1 a/2
        System.out.println(a>>b);
    }
}
