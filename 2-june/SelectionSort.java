
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            //minimum 
            int mini=Integer.MAX_VALUE;
            int index=0;
            for(int j=i;j<n;j++){
                if(a[j]<mini){
                    mini=a[j];
                    index=j;
                }
            }
            int tmp=0;
            tmp=a[i];
           a[i]=a[index];
           a[index]=tmp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
