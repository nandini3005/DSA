class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int max=(nums[i]-1)*(nums[j]-1);
                maxVal=Math.max(max,maxVal);
            }
        }
        return maxVal;
    }
}