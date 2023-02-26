
//problem no 1848class Solution {
    
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int a[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                a[k]=Math.abs(i-start);
                k++;
            }
        }
        int b[]=new int[k];
        for(int j=0;j<k;j++){
            b[j]=a[j];
        }
        Arrays.sort(b);
        return b[0];
    }
}