class Solution {
    public void dfs(char grid[][],int vis[][],int sr,int sc,int n,int m)
    {
        if(sr<0 || sc<0 || sr>=n || sc>=m || grid[sr][sc] == '0' || vis[sr][sc] == -1)
        {
            return ;
        }
        vis[sr][sc]=-1;
        grid[sr][sc]='0';
        dfs(grid,vis,sr+1,sc,n,m);
        dfs(grid,vis,sr-1,sc,n,m);
        dfs(grid,vis,sr,sc+1,n,m);
        dfs(grid,vis,sr,sc-1,n,m);
        
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == '1')
                {
                    if(vis[i][j] != -1)
                    {
                        ans++;
                        dfs(grid,vis,i,j,n,m);
                    }
                }
            }
        }
        return ans;
    }
}