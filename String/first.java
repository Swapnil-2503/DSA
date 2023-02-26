
import java.util.Scanner;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        for(int i=0;i<a.length();i++){
            boolean b=true;
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j) && j!=i) b=false;
            }
            if(b==true) {
                System.out.print(a.charAt(i));
                break;
            }
        }
    }
}
