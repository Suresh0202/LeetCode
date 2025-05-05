class Solution {
    public boolean dfs(char board[][],int vis[][],int sr,int sc,String word,int idx)
    {
        if(idx == word.length())
        {
            return true;
        }
        if(sr<0 || sc<0 || sr>=board.length || sc>=board[0].length || vis[sr][sc] == 1 || board[sr][sc]!=word.charAt(idx))
        {
            return false;
        }
        vis[sr][sc]=1;
        if(dfs(board,vis,sr+1,sc,word,idx+1)){
            return true;
        }
        if(dfs(board,vis,sr-1,sc,word,idx+1))
        {
            return true;
        }
        if(dfs(board,vis,sr,sc+1,word,idx+1))
        {
            return true;
        }
        if(dfs(board,vis,sr,sc-1,word,idx+1))
        {
            return true;
        }
        vis[sr][sc]=0;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] == word.charAt(0) && vis[i][j]==0)
                {
                     if(dfs(board,vis,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(Arrays.toString(vis[i]));
        }
        return false;
    }
}