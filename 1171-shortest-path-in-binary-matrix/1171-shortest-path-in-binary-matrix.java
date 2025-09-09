class Solution {
    public boolean isVal(int sr,int sc,int vis[][],int grid[][]){
        if(sr <0 || sc< 0 || sr>=vis.length || sc>=vis[0].length || grid[sr][sc] == 1 || vis[sr][sc] == 1)
        {
            return false;
        }
        return true;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]>qu=new LinkedList<>();
        if(grid[0][0]  == 1)
        {
            return -1;
        }
        qu.add(new int[]{1,0,0});
        int vis[][]=new int[grid.length][grid.length];
        vis[0][0]=1;
        int n=vis.length;
        while(!qu.isEmpty())
        {
            int trip[]=qu.poll();
            int dis=trip[0];
            int sr=trip[1];
            int sc=trip[2];
            if(sr == n-1 && sc == n-1)
            {
                return dis;
            }
            if(isVal(sr+1,sc+1,vis,grid))
            {
                //1
                qu.add(new int[]{dis+1,sr+1,sc+1});
                vis[sr+1][sc+1]=1;
            }
            if(isVal(sr-1,sc-1,vis,grid))
            {
                qu.add(new int[]{dis+1,sr-1,sc-1});
                vis[sr-1][sc-1]=1;
                    //2//
            }
            if(isVal(sr-1,sc,vis,grid))
            {
                  qu.add(new int[]{dis+1,sr-1,sc});
                vis[sr-1][sc]=1;
                    // 3
            }
            if(isVal(sr+1,sc,vis,grid))
            {
                    // 4
                      qu.add(new int[]{dis+1,sr+1,sc});
                vis[sr+1][sc]=1;
            }
            if(isVal(sr,sc+1,vis,grid))
            {
                  qu.add(new int[]{dis+1,sr,sc+1});
                vis[sr][sc+1]=1;
                // 5
            }
            if(isVal(sr,sc-1,vis,grid))
            {
                    // 6
                      qu.add(new int[]{dis+1,sr,sc-1});
                vis[sr][sc-1]=1;
            }
            if(isVal(sr+1,sc-1,vis,grid))
            {
                  qu.add(new int[]{dis+1,sr+1,sc-1});
                vis[sr+1][sc-1]=1;
                    // 7
            }
            if(isVal(sr-1,sc+1,vis,grid))
            {
                    // 8
                      qu.add(new int[]{dis+1,sr-1,sc+1});
                vis[sr-1][sc+1]=1;
            }

        }
        return -1;
    }
}