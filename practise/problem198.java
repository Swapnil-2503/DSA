package practise;



class Solution {
    public int rob(int[] nums) {
         int a=0;
         int b=0;
     for (int i=0;i<nums.length;i++){
         b = Math.max(a+nums[i], a=b);
         //System.out.println(b);
     }
         
     return b;
    }
}