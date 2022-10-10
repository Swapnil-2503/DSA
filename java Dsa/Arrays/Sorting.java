package Arrays;

public class Sorting {
    public static void main(String[] args) {
        //Bubble sort- sorting by comparing side elements and swapping
        int a[]={1,6,2,4,10,7};
        int temp=0;
        // for(int i=0;i<5;i++){
        //     if(a[i]>a[i+1]){
        //         temp=a[i];
        //         a[i]=a[i+1];
        //         a[i+1]=temp;
        //     }
        // }
        // for(int e:a){
        //     System.out.println(e);
        // }

        //selection sort Algorithm
        //in this we have to find max element and swap it
    
        // for(int i=6;i>=0;i--){
        //     int r=a[0];
        //     int c=0;
        //     for(int j=0;j<i;j++){
        //         if(r<a[j]){
        //             r=a[j];
        //             c=a[i-1];
        //             a[i-1]=r;
        //             a[j]=c;
        //         }
        //     }
        // }
        // for(int e:a){
        //          System.out.println(e);
        //      }


        //most important sorting algorithm Cyclic sort
        // if sequence 1 to n is given apply cyclic sort 

        int [] c={4,5,6,2,3,1};
        int tmp;
        int i=0;
        while(i<c.length){
          if(i!=c[i]-1){
            tmp=c[c[i]-1];
            c[c[i]-1]=c[i];
            c[i]=tmp;
          }
          else i++;
        }
          for(int e:c){
            System.out.println(e);
          }
    }
}
