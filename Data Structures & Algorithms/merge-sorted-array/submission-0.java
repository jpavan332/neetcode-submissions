class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merge[] = new int[m+n];
        int i =0, j = 0,k = 0;
        for(; i<m&&j<n;){
            if(nums1[i]<nums2[j]){
                merge[k++] = nums1[i++];
            }else {
                merge[k++] = nums2[j++];
            }
        }

        for(int l=i;l<m;l++){
            merge[k++] = nums1[l];
        }

        for(int l=j;l<n;l++){
            merge[k++] = nums2[l];
        }

        for(int l=0;l<m+n;l++){
            nums1[l] = merge[l];
        }
    }
}