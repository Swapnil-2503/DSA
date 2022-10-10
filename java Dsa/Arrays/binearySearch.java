package Arrays;
import java.util.*;

public class binearySearch {

    //is target element present in an array by using bineary search
    boolean isPresent(int[] a,int target){
       boolean b=false;
       //for index return
       int d=-1;
       int c=a[a.length/2];
       if(target<c){
        for(int i=0;i<c;i++){
            if(a[i]==target){
                b=true;
                d=i;
            }
        }
    }
        else if(target>=c){
            for(int i=c;i<a.length;i++){
                if(a[i]==target){
                    b=true;
                    d=i;
                }
            }
        }
        return b;
       
    }
    public static void main(String[] args) {
        int a[]={ 1,2,3,9,15,30,63,100};
        int target=30;
    }
   
}
