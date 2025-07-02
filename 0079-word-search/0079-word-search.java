class Solution {
    public boolean dfs(int sr,int sc,char board[][],int vis[][],String word,int idx)
    {
        if(idx == word.length())
        {
            return true;
        }
        if(sr<0 || sc<0 || sr>=board.length || sc>=board[0].length || board[sr][sc] != word.charAt(idx) || vis[sr][sc] == 1)
        {
            return false;
        }
        vis[sr][sc]=1;
        if(dfs(sr,sc+1,board,vis,word,idx+1))
        {
            return true;
        }
        if(dfs(sr,sc-1,board,vis,word,idx+1))
        {
            return true;
        }
        if(dfs(sr-1,sc,board,vis,word,idx+1))
        {
            return true;
        }
        if(dfs(sr+1,sc,board,vis,word,idx+1))
        {
            return true;
        }
        vis[sr][sc]=0;
        return false;

    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[board.length][board[0].length];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] == word.charAt(0) && vis[i][j] == 0)
                {
                    if(dfs(i,j,board,vis,word,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}