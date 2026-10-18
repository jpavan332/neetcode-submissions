class Solution {
    public int[] countBits(int n) {
        int out[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            out[i] = getOneCounts(i);
        }
        return out;
    }

    int getOneCounts(int k){
        int count = 0;
        while(k>0){
            if( (k & 1) == 1)
                count++;
            k = k >> 1;
        }
        return count;
    }
}
