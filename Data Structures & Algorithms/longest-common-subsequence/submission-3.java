class Solution {
    int maxLen = 0;
    int grid[][];
    public int longestCommonSubsequence(String text1, String text2) {
        // generateAll(text1, text2, 0, "");
        // return maxLen;
        int n = text1.length();
        int m = text2.length();

        
        grid = new int[n][m];
        for(int i = 0; i<n;i++)
            for(int j = 0; j<m; j++)
                grid[i][j] = -1;
        /* bottom -up
        for(int i = n-1; i>=0;i--){
            for(int j = m-1; j >= 0; j--){
                if(text1.charAt(i) == text2.charAt(j))
                {
                   grid[i][j] = 1 + grid[i+1][j+1];
                }else{
                    grid[i][j] = Math.max(grid[i][j+1], grid[i+1][j]);
                }
                    
            }
        }
        return grid[0][0];
        */
        return dfs(text1, text2,0,0);

    }

    int dfs(String text1, String text2, int i, int j){

        if( i == text1.length() || j == text2.length())
            return 0;
        if(grid[i][j] != -1)
            return grid[i][j];
        if(text1.charAt(i) == text2.charAt(j))
            grid[i][j] = 1 + dfs(text1,text2,i+1,j+1);
        else
            grid[i][j] = Math.max(dfs(text1,text2,i+1,j),dfs(text1,text2,i,j+1));

    return grid[i][j];
    }

    void generateAll(String text1, String text2, int i, String curr){

        if(text1.equals(text2))
            maxLen = text1.length();
        if(isSubSeq(curr,text2)){
            maxLen = Math.max(maxLen,curr.length());
        }

        for(int j=i; j<text1.length();j++){
            generateAll(text1,text2,j+1,curr+text1.charAt(j));
        }

    }

    boolean isSubSeq(String curr,String text2){
        if(curr.length() == 0) 
            return true;
        int j=0, i=0;
        for(; j< curr.length() && i< text2.length();i++){
            if(curr.charAt(j) == text2.charAt(i)){
                j++;
            }
        }
        if(j == curr.length())
            return true;
     return false;
    }
}
