class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        fillColors(image,sr,sc,color, startColor);
        return image;
    }

    void fillColors(int [][]image, int sr, int sc, int color, int startColor)
    {

        if(sr < 0 || sc < 0 || sr == image.length || sc == image[0].length || 
            image[sr][sc] == color || image[sr][sc] != startColor){
                return;
        }
        image[sr][sc] = color;
        fillColors(image,sr+1,sc,color,startColor);
        fillColors(image,sr-1,sc,color,startColor);
        fillColors(image,sr,sc+1,color,startColor);
        fillColors(image,sr,sc-1,color,startColor);

    }

}