class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0; i<nums.length; i++){
            int secno=target-nums[i];
            int j = i + 1;   // Use a separate variable to search
            while (j < nums.length) {
                if (nums[j] == secno) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
                j++;
            }
        }
        return ans;
    }
}
