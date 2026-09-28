class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            elementSum+=nums[i];
            int num=nums[i];
            if(num>0){
                while(num>0){    
                    int d = num%10;
                    digitSum+=d;
                    num/=10;
                }
            }
        }
        int ans = Math.abs(elementSum - digitSum);
        return ans;
        
    }
}