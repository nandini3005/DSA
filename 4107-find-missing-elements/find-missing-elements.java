import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>();
        int min=nums[0];
        int max=nums[n-1];
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}