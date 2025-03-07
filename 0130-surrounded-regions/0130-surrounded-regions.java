class Solution {
    public void dfs(char [][]image,int sr,int sc,char old,char ns,int arr[][])
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
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int arr[][]=new int[n][m];
        for(int j=0;j<m;j++)
        {
            if(board[0][j]=='O')
            {
                  int sr=0,sc=j;
                   dfs(board,sr,sc,'O','X',arr);
            }

        }
        for(int i=1;i<n;i++)
        {
            if(board[i][m-1]=='O')
            {
                int sr=i,sc=m-1;
                   dfs(board,sr,sc,'O','X',arr);
            }
        }
       for(int j=0;j<m;j++) 
       {
        if(board[n-1][j]=='O')
        {
            int sr=n-1,sc=j;
                   dfs(board,sr,sc,'O','X',arr);
        }
       }
       for(int i=0;i<n;i++) 
       {
        if(board[i][0]=='O')
        {
             int sr=i,sc=0;
            dfs(board,sr,sc,'O','X',arr);
        }
       }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    board[i][j]='X';
                }else
                {
                    board[i][j]='O';
                }
            }
        }
        
        
    }
}