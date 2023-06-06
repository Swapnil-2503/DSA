
//fibonancci series

import java.util.*;
public class practise1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0) a[i]=1;
            else if(i==1) a[i]=1;
            else{
                a[i]=a[i-1]+a[i-2];
            }
        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}