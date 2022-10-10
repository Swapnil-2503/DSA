//package Interview Questions;

//Amazon Interview Question
//find position of element in a sorted arrays of infinite numbers.

// In this we have to do binary search as this is sorted array But array is of infinite numbers so what will be the boundary
//we can do it by taking max of long as last and minimum of long as minimum value and search for target element;

public class first {
    public static void main(String[] args) {
        int a[]={1,4,5,10,16,18,20,21};//upto infinite suppose We can do it by chunks considering the range log(l) steps required
                                          //  to by using like first 2 elements then check for 4 then 8 then 16
        int target=10;
        int l=a.length;
        if(target<l/2){
           for(int i=0;i<l/2;i++){
            if(a[i]==target){
                //target found 
            }
           }
        }
           else{
            for(int i=l/2;i<l;i++){
                if(a[i]==target){
                    //target found 
                }
           }
        }
    }
 }

