class Solution {
    public void dfs(char image[][],int sr,int sc,int arr[][])
    {
          if(sc<0 || sr<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]=='0' || arr[sr][sc]==-1)
        {
            return;
        }
        if (image[sr][sc] == '1') {
            arr[sr][sc]=-1;
            image[sr][sc] = '0';
        dfs(image,sr-1,sc,arr);
        dfs(image,sr,sc+1,arr);
        dfs(image,sr+1,sc,arr);
        dfs(image,sr,sc-1,arr);
        }
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        int arr[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    if(arr[i][j]!=1)
                    {
                        ans++;
                        dfs(grid,i,j,arr);
                    }
                }
            }
        }
        return ans;
    }
}