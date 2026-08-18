class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i = 0; i<rows;i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
        }
        }
        int length = 0;
        boolean enter = false;
        while(!queue.isEmpty()){
            enter = true;
            int queueLength = queue.size();
            for(int i = 0;i<queueLength;i++){
                int[] front = queue.poll();
                int r = front[0];
                int c = front[1];

                if( (r-1 >= 0 && grid[r-1][c] == 0) && (r+1 == rows-1 && grid[r+1][c] == 0) && (c+1 == columns-1 && grid[r][c+1]==0) && (c-1>=0 && grid[r][c-1] == 0))
                  length = length;

                int neighbours[][] = {{r+1,c},{r-1,c},{r,c+1},{r,c-1}};
                for(int j = 0; j < 4; j++){
                    int newR = neighbours[j][0];
                    int newC = neighbours[j][1];

                    if(newR < 0 || newC < 0 || newR == rows || newC == columns
                    || grid[newR][newC] == 0 || grid[newR][newC] == 2)
                        continue;
                    queue.add(neighbours[j]);
                    System.out.println("neighbours"+neighbours[j][0]+","+neighbours[j][1]);
                    grid[newR][newC] = 2;
                }
                

            }
            
            length++;
        }

         for(int i = 0; i<rows;i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        if(!enter)
            return 0;

        return length-1;
        
    }
}
