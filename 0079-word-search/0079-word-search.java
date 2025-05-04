class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        int vis[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfs(board, i, j, rows, cols, vis, 0, word)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, int i, int j, int rows, int cols, int[][] vis, int idx, String word){
        if(idx == word.length()) return true;
        if(i == rows || j == cols || i<0 || j <0 || vis[i][j] == 1 || board[i][j] != word.charAt(idx)){
            return false;
        }
        vis[i][j] = 1;
        if(dfs(board, i+1, j, rows, cols, vis, idx+1, word)) return true;
        if(dfs(board, i, j+1, rows, cols, vis, idx+1, word)) return true;
        if(dfs(board, i-1, j, rows, cols, vis, idx+1, word)) return true;
        if(dfs(board, i, j-1, rows, cols, vis, idx+1, word)) return true;
        vis[i][j] = 0;
        return false;
    }
}