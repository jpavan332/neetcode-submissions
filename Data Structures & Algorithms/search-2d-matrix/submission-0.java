class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int c = matrix[0].length;
        int r = matrix.length;
        System.out.println("r==="+r+"c=="+c);
        for(int i = 0; i<r; i++){
            if(target <= matrix[i][c-1] && target >= matrix[i][0]){
                return bs(matrix,i,target);
            }
        }
        return false;
    }

    boolean bs(int[][] matrix, int l, int target){
        int low = 0;
        int high = matrix[0].length-1;
        while(low <= high){
           
            int mid = (low + high)/2;
             System.out.println("l=="+l+"mid=="+mid);
            if(target == matrix[l][mid]){
                return true;
            }else if(target < matrix[l][mid]){
                high = mid - 1;
                System.out.println("low=="+low+"high=="+high);
            }else if(target > matrix[l][mid]){
                low = mid + 1;
            }
        }
        return false;
    }
}
