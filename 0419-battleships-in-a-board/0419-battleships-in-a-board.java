class Solution {
    public void dfs(int i,int j,int vis[][],char board[][])
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || vis[i][j]==-1 || board[i][j] == '.')
        {
            return;
        }
        if(board[i][j]=='X')
        {
            // board[i][j]='.';
            vis[i][j]=-1;
            dfs(i,j+1,vis,board);
            dfs(i+1,j,vis,board);
            dfs(i,j-1,vis,board);
            dfs(i-1,j,vis,board);
        }
    }
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int c=0;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0)
                {
                    if(board[i][j]=='X')
                    {
                    c++;
                    dfs(i,j,vis,board);
                    }
                }
            }
        }
        return c;
    }
}