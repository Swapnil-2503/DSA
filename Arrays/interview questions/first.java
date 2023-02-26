

import java.util.*;

public class first{
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                    {4,5,6},
                     {7,8,9}};
        int sum=0;
        for(int i=0;i<a[0].length;i++){
            sum=sum+a[i][i];
        }
        int i=0;
        for(int j=a[0].length-1;j>=0;j--){
            if(j!=i)sum=sum+a[j][i];
            i++;
        }
        System.out.print(sum);
    }
}
// best case==worst case==O(n+n)