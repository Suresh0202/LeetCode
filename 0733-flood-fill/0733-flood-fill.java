class Solution {
    public void dfs(int image[][],int sr,int sc,int old,int color)
    {
        if(sc<0 || sr<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==color )
        {
            return;
        }
        
        if (image[sr][sc] == old) {
            image[sr][sc] = color;
        dfs(image,sr-1,sc,old,color);
        dfs(image,sr,sc+1,old,color);
        dfs(image,sr+1,sc,old,color);
        dfs(image,sr,sc-1,old,color);
        }

        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color)
        {
        dfs(image,sr,sc,image[sr][sc],color);
        }
        return image;
    }
}