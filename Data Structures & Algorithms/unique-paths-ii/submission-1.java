class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
        return 0;

       obstacleGrid[0][0] = 1;
       for(int i=1;i<n;i++){
         obstacleGrid[0][i] = obstacleGrid[0][i] == 1 ? 0 : obstacleGrid[0][i-1];
       }

       for(int i=1;i<m;i++){
         obstacleGrid[i][0] = obstacleGrid[i][0] == 1 ? 0 : obstacleGrid[i-1][0];
       }

       for(int r = 1; r<m; r++){
         for(int c = 1; c < n; c++){
            if(obstacleGrid[r][c] == 1)
                obstacleGrid[r][c] = 0;
            else
                obstacleGrid[r][c] = obstacleGrid[r-1][c] + obstacleGrid[r][c-1];
         }

       }

       return obstacleGrid[m-1][n-1];



    //    int cache[][] = new int[m][n];
    //    return  dfs(0,0,obstacleGrid,cache,m,n);
        
    }

    int dfs(int r,int c, int[][] obstacleGrid, int[][] cache, int m, int n){
        if( r == m || c == n || obstacleGrid[r][c] == 1){
            return 0;
        }
        if(cache[r][c] > 0)
            return cache[r][c];
        if(r == m-1 && c == n-1)
            return 1;

        cache[r][c] = dfs(r+1,c,obstacleGrid,cache,m,n) +
                      dfs(r,c+1,obstacleGrid,cache,m,n);
        return cache[r][c];
    }
}