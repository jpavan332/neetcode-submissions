class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        Queue<int[]> queue = new ArrayDeque<>();
        int[][] visit = new int[grid.length][grid[0].length];
        queue.add(new int[2]);
        visit[0][0] = 1;
        int rows = grid.length;
        int columns = grid[0].length;
        int length = 1;
        if(grid[0][0] == 1 || grid[rows-1][columns-1] == 1)
            return -1;
        while(!queue.isEmpty()){
            int queueLength = queue.size();
            for(int i = 0; i<queueLength; i++){
                int[] firstElement = queue.poll();
                int r = firstElement[0];
                int c = firstElement[1];

                if(r == rows - 1 && c == columns - 1)
                    return length;
                
                int[][] neighbours = {
                    {r, c+1},
                    {r, c-1},
                    {r+1, c},
                    {r-1, c},
                    {r+1, c+1},
                    {r-1, c+1},
                    {r-1, c-1},
                    {r+1, c-1}
                };

                for(int j = 0; j < 8; j++){
                    int newR = neighbours[j][0];
                    int newC = neighbours[j][1];

                    if(newR < 0 || newC < 0 || newR == rows || newC == columns || 
                    grid[newR][newC] == 1 || visit[newR][newC] == 1)
                        continue;
                    System.out.println("hiiiiii"+neighbours[j][0]+" ->"+neighbours[j][1]);
                    queue.add(neighbours[j]);
                    visit[newR][newC] = 1;

                }
               
            }
             length++;
        }
       return -1;
    }
}