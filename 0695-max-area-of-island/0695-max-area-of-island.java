class Solution {
    //  int count=0;
    public void dfs(int image[][],int sr,int sc,int arr[][],int cnt[])
    {
          if(sc<0 || sr<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==0 || arr[sr][sc]==-1)
        {
            return;
        }
        if (image[sr][sc] == 1) {
            cnt[0]++;
            arr[sr][sc]=-1;
            image[sr][sc] = 0;
        dfs(image,sr-1,sc,arr,cnt);
        dfs(image,sr,sc+1,arr,cnt);
        dfs(image,sr+1,sc,arr,cnt);
        dfs(image,sr,sc-1,arr,cnt);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int arr[][]=new int[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(arr[i][j]!=1)
                    {
                        int cnt[]=new int[1];
                        dfs(grid,i,j,arr,cnt);
                          max=Math.max(max,cnt[0]);
                        // System.out.println(count);
                       
                    }
                }
            }
           
        }
        // count=0;
        return max;
    }
}