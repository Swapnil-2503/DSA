package practise;
import java.util.*;

public class TwoSum1 {
    public static void main(String[] args) {
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
   int nums[]=new int[n];
   for(int i=0;i<n;i++){
    nums[i]=sc.nextInt();
   }
   int target=sc.nextInt();

//best and easy aproach straight forward
   int a[]=new int[2];
   for(int i=0;i<nums.length-1;i++){
       for(int j=i+1;j<nums.length;j++){
          if(nums[i]+nums[j]==target) {
              a[0]=i;
              a[1]=j;
          }
       }
   }
   System.out.println(a[0]+" "+a[1]);


//best aproach with O(n)-
Map<Integer,Integer> map=new HashMap<>();
int[] b=new int[2];
for(int i=0;i<n;i++){
    if(map.containsKey(target-nums[i])){
        b[1]=i;
        b[0]=map.get(target-nums[i]);
        System.out.println(b[0]+" "+b[1]);
    }
    map.put(nums[i],i);
}
    }
}
