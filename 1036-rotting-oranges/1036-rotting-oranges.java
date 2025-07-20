class Pair{
    int sr;
    int sc;
    int val;
    Pair(int sr,int sc,int val)
    {
        this.sr=sr;
        this.sc=sc;
        this.val=val;
    }
}
class Solution {
    public boolean Check(int i,int j,int vis[][],int grid[][])
    {
        if(i>=0 && j>=0 && i<vis.length && j<vis[0].length && vis[i][j] != 2 && grid[i][j] ==1)
        {
            return true;
        } 
        return false;
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair>qu=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 2)
                {
                    qu.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
            }
        }
        int ans=0;
        while(!qu.isEmpty())
        {
            int i=qu.peek().sr;
            int j=qu.peek().sc;
            int v=qu.peek().val;
            qu.remove();
            ans=v;
            if(Check(i+1,j,vis,grid))
            {
                qu.add(new Pair(i+1,j,v+1));
                vis[i+1][j]=2;
            }
             if(Check(i-1,j,vis,grid))
            {
                qu.add(new Pair(i-1,j,v+1));
                vis[i-1][j]=2;
            }
             if(Check(i,j+1,vis,grid))
            {
                qu.add(new Pair(i,j+1,v+1));
                vis[i][j+1]=2;
            }
             if(Check(i,j-1,vis,grid))
            {
                qu.add(new Pair(i,j-1,v+1));
                vis[i][j-1]=2;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1 && vis[i][j] != 2)return -1;
            }
        }
        return ans;
    }
}