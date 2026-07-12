class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Integer.MIN_VALUE;
        for(int i =0;i < piles.length; i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;
        int mid = 0,res =0;
        while(low <= high){
            mid = (high + low) / 2;
            int totalHours = calTotalHours(piles, mid);
            if(totalHours <= h){
                res = mid;
                high = mid - 1;
            }else if(totalHours > h){
                low = mid + 1;
            }
        }
        return res;
    }

    int calTotalHours(int piles[], int m){
        int total = 0;
        for(int i = 0; i< piles.length; i++){
            total += (piles[i] + m - 1)/m;
            // total+= Math.ceil((double)piles[i]/m);
        }
        System.out.println(total);
        return total;
    }

}
