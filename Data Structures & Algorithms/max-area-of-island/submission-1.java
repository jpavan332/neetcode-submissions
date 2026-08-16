class Solution {
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    count = 0;
                    count = dfs(grid,i,j);
                    System.out.println("Count:"+count);
                }
                if(max < count)
                    max = count;
            }
        }

        return max;
        
    }

    int dfs(int[][] grid, int r, int c){
        if( r < 0 || c < 0 || r == grid.length || 
        c == grid[0].length || grid[r][c] == 0 )
            return 0;

        if(grid[r][c] == 1)
            count++;

        grid[r][c] = 0;

        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);

        return count;
    }
}
