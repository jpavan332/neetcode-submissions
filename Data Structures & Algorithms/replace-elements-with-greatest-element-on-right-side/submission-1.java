class Solution {
    public int[] replaceElements(int[] arr) {
        int i = arr.length-1;
        int currMax = arr[i];
        int prevMax = currMax;
        arr[i] = -1;
        for(int j = i-1; j>=0; j--){
            if(arr[j] > currMax){
                prevMax = currMax;
                currMax = arr[j];
            }
            arr[j] = prevMax;
            prevMax = currMax;
        }
        return arr;
    }
}