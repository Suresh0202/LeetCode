class Solution {
    public static void dfs(int image[][],int sr,int sc,int nw,int old)
    {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==nw)
        {
            return;
        }
        if(image[sr][sc]==old)
        {
            image[sr][sc]=nw;
                dfs(image,sr+1,sc,nw,old);
                dfs(image,sr-1,sc,nw,old);
                dfs(image,sr,sc+1,nw,old); 
                dfs(image,sr,sc-1,nw,old);
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color)
        {
            dfs(image,sr,sc,color,image[sr][sc]);
        }
        return image;
    }
}