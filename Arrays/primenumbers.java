
import java.util.*;
public class primenumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=3;
        
        for(int i=1;i<n;i++){
            a[0]=2;
            boolean c=true;
            for(int j=2;j<count;j++){
               if(count%j==0) c=false;
            }
            if(c==true) a[i]=count;
           else i--;
            count++;
        }
        for (int e : a) {
            System.out.println(e);
        }
    }
}