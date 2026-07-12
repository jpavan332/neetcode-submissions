class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3];
        for(int i=0; i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0,k=0;i<3;i++){
            for(int j=0;j<count[i];j++){
                nums[k++] = i;
            }
        }
    }
}