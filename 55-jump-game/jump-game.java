class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        int t=0;
        for(int i=0;i<nums.length;i++){
           if(i>t){
            return false;
           }
           else{
            t=Math.max(t,i+nums[i]);
           }
        }
        return true;
    }
}