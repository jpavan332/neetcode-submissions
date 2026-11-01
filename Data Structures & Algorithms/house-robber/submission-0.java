class Solution {
    public int rob(int[] nums) {
        int prev2=0,prev1=0;
        for(int num : nums)
        {
            int temp = Math.max(prev1, num+prev2);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}

