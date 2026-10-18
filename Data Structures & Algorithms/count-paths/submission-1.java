class Solution {
    public int uniquePaths(int m, int n) {

        // int prevRow[] = new int[n];
        // int currRow[] = new int[n];
        // for(int i = m-1; i>=0; i--){
        //     currRow = new int[n];
        //     currRow[n-1] = 1;
        //     for(int j = n-2; j>=0; j--){
        //         currRow[j] = currRow[j+1] + prevRow[j];
        //     }
        //     prevRow = currRow;
        // }
        // return currRow[0];
        int cache[][] = new int[m][n];
        return bfs(0,0,cache,m,n);
        
    }

    int bfs(int m, int n , int[][] cache, int rows, int cols){
        if(m == rows || n == cols ){
            return 0;
            
        }
        if(cache[m][n] > 0)
            return cache[m][n];
        if( m == rows-1 && n == cols-1)
            return 1;
        cache[m][n] = bfs(m+1,n,cache,rows,cols) + 
                      bfs(m,n+1, cache,rows,cols);
        return cache[m][n];
    }
}
