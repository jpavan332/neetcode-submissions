class Solution {
    int maxLen = 0;
    public int longestCommonSubsequence(String text1, String text2) {
        // generateAll(text1, text2, 0, "");
        // return maxLen;
        int n = text1.length();
        int m = text2.length();
        int grid[][] = new int[n+1][m+1];
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
