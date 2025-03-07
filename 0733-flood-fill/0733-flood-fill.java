class Solution {
    public void dfs(int image[][],int sr,int sc,int n,int m,int row[],int col[],int ini,int necl)
    {
        image[sr][sc]=necl;
        for(int i=0;i<4;i++)
        {
            int nrw=sr+row[i];
            int ncl=sc+col[i];
            if(nrw>=0 && nrw <n && ncl>=0 && ncl<m && image[nrw][ncl]==ini && image[nrw][ncl]!=necl)
            {
                dfs(image,nrw,ncl,n,m,row,col,ini,necl);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // int ans[][]=new int[image.length][image[0].length];
        // for(int i=0;i<ans.length;i++)
        // {
        //     for(int j=0;j<ans[0].length;j++)
        //     {
        //         ans[i][j]=image[i][j];
        //     }
        // }
        
        int n=image.length;
        int m=image[0].length;
        int row[]={-1,0,+1,0};
        int col[]={0,+1,0,-1};
        int inicolor=image[sr][sc];
        dfs(image,sr,sc,n,m,row,col,inicolor,color);
        return image;
    }
}