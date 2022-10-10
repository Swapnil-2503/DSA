package Arrays;
import java.util.*;

public class linearSearch{
     // method which returns sum of array elements in a[]
     int sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
     }
     //sorting of array
     int[] sort(int[] a){
       Arrays.sort(a);
       return a;
     }

     //linear search in an array
     boolean isPresent(int[] a,int k){
          boolean c=false;
          for(int i=0;i<a.length;i++){
            if(a[i]==k){
                c=true;
                break;
            }
          }
          return c;
     }
     //linear search for a character in a string
     boolean isPresent(String b , char c){
        boolean a=false;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==c){
                a=true;
                break;
            }
        }
        return a;
     }
     
     //searching target in the range start to range
      boolean isboolean(int[] a, int start,int end,int k){
        boolean b=false;
       
            for(int i=0;i<a.length;i++){
                if(a[i]==k){
                    b=true;
                    break;
                }
              }
              return b;
      }

      //minimum number in an array
      int min(int[] a){
        int b=a[0];
        for(int i=0;i<a.length;i++){
            if(b>a[i]){
               b=a[i];
            }
        }
        return b;
      }

      // maximum number in an array
      int max(int[] a){
        int b=a[0];
        for(int i=0;i<a.length;i++){
            if(b<a[i]){
               b=a[i];
            }
        }
        return b;
      }

      // search for target in 2d array
      boolean isPresent(int a2d[][],int target){
          boolean a=false;
          for(int i=0;i<a2d.length;i++){
            for(int j=0;j<a2d[i].length;j++){
                if(a2d[i][j]==target){
                    a=true;
                }
            }
          }
          return a;
        }

          //return index by array of length 2x2
          int[] present(int a2d[][],int target){

            for(int i=0;i<a2d.length;i++){
                for(int j=0;j<a2d[i].length;j++){
                    if(a2d[i][j]==target){
                        return new int[]{i,j};
                    }
                }
              }
              return new int[]{-1,-1};
          }
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();//is this present in an array.
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        String b=sc.next();
        char c=sc.next().charAt(0);
        int start=sc.nextInt();
        int range =sc.nextInt();

        int a2d[][]={
            {1,2,3,4},
            {16,7,19,25},
            {20 ,25, 24}
        };

    }
}