class Solution {
    public boolean dfs(char board[][],int sr,int sc,String word,char vis[][],int idx)
    {
        if(idx == word.length())
        {
            return true;
        }
        if(sr<0 || sc<0 || sr>=board.length || sc>=board[0].length || board[sr][sc]!=word.charAt(idx))
        {
            return false;
        }
        char temp=board[sr][sc];
         board[sr][sc]=')';  
          boolean ans=  
          dfs(board,sr+1,sc,word,vis,idx+1)||
          dfs(board,sr-1,sc,word,vis,idx+1)||
          dfs(board,sr,sc+1,word,vis,idx+1)||
          dfs(board,sr,sc-1,word,vis,idx+1);

    board[sr][sc]=temp;
          return ans;
        
        
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        char vis[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] ==word.charAt(0) && dfs(board,i,j,word,vis,0))
                {
                    return true;
                }

            }
        }
        return false;
    }
}