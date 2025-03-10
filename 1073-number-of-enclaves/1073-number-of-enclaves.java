class Solution {
     public void dfs(int [][]image,int sr,int sc,int old,int ns,int arr[][])
    {
        if(sc<0 || sr<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==ns || arr[sr][sc]==-1)
        {
            return;
        }
        
        if (image[sr][sc] == old) {
            arr[sr][sc]=-1;
            image[sr][sc] = ns;
        dfs(image,sr-1,sc,old,ns,arr);
        dfs(image,sr,sc+1,old,ns,arr);
        dfs(image,sr+1,sc,old,ns,arr);
        dfs(image,sr,sc-1,old,ns,arr);
        }
    }
    public int numEnclaves(int[][] board) {
       int n=board.length;
        int m=board[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(arr[i],2);
        }
        for(int j=0;j<m;j++)
        {
            if(board[0][j]==1)
            {
                  int sr=0,sc=j;
                   dfs(board,sr,sc,1,0,arr);
            }else
        {
            arr[0][j]=-1;
        }

        }
        for(int i=1;i<n;i++)
        {
            if(board[i][m-1]==1)
            {
                int sr=i,sc=m-1;
                   dfs(board,sr,sc,1,0,arr);
            }else
        {
            arr[i][m-1]=-1;
        }
        }
       for(int j=0;j<m;j++) 
       {
        if(board[n-1][j]==1)
        {
            int sr=n-1,sc=j;
                   dfs(board,sr,sc,1,0,arr);
        }else
        {
            arr[n-1][j]=-1;
        }
       }
       for(int i=0;i<n;i++) 
       {
        if(board[i][0]==1)
        {
             int sr=i,sc=0;
            dfs(board,sr,sc,1,0,arr);
        }else
        {
            arr[i][0]=-1;
        }
       }
       int ans=0;
       for(int i=1;i<n-1;i++)
       {
        for(int j=1;j<m-1;j++)
        {
        //    System.out.print(arr[i])
        if(board[i][j]==1 && arr[i][j]==2)
           ans++;
        }
       }
       return ans;
    }
}