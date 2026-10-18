class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       int cache[][] = new int[m][n];
       return  bfs(0,0,obstacleGrid,cache,m,n);
        
    }

    int bfs(int r,int c, int[][] obstacleGrid, int[][] cache, int m, int n){
        if( r == m || c == n || obstacleGrid[r][c] == 1){
            return 0;
        }
        if(cache[r][c] > 0)
            return cache[r][c];
        if(r == m-1 && c == n-1)
            return 1;

        cache[r][c] = bfs(r+1,c,obstacleGrid,cache,m,n) +
                      bfs(r,c+1,obstacleGrid,cache,m,n);
        return cache[r][c];
    }
}