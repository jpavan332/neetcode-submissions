class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        return binarySearch(nums,0, nums.length -1,target);   
    }

    int binarySearch(int nums[], int low, int high,int target){
        if(low > high)
            return -1;
        int mid = (low + high+1)/2;
        if(nums[mid] == target)
            return mid;
        return nums[mid] < target ? binarySearch(nums, mid+1, high,target): binarySearch(nums, low, mid-1,target);
    }
}
