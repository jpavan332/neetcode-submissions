class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int out[] = new int[nums.length];
        for(int i=0,j=0; i<nums.length; i++){
           if(nums[i]!= val){
            out[j++] = nums[i];
            count++;
           }
             
        }
        for(int j=0; j<=count && j< nums.length;j++){
            nums[j] = out[j];
        }
    return count;
    }
}