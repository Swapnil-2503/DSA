import java.util.Arrays;

//package Interview Questions;


//Find the rotation count in rotated array
public class second {
    public static void main(String[] args) {
        int a[]={4,8,10,1,2,3}; //obvious ans will be 3 times we need to know the greatest elemts position and also of second greatest here 10 and 8 
        // sort algorithm nlogn
        Arrays.sort(a);
        System.out.println(a[a.length-1]+" "+a[a.length-2]);

    }
}
