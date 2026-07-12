class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i< arr.length-1; i++){
            arr[i] = getMax(arr,i+1);
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public static int getMax(int a[], int index){
        int maxRight = Integer.MIN_VALUE;
        for(int i=index; i<a.length;i++){
            if(a[i] > maxRight){
                maxRight = a[i];
            }
        }
        return maxRight;
    }
}