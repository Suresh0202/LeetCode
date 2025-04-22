class Pair{
    int sr,sc,val;
    Pair(int sr,int sc,int val)
    {
        this.sr=sr;
        this.sc=sc;
        this.val=val;
    }
}
class Solution {
    public boolean CheckBoundary(int i,int j,int n,int m,int grid[][],int vis[][])
    {
            if(i>=0 && j>=0 && i<=n && j<=m && grid[i][j]==1 && vis[i][j]!=2)
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
        int max=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    qu.add(new Pair(i,j,1));
                    vis[i][j]=2;
                }else
                {
                    vis[i][j]=0;
                }
            }
        }
        while(!qu.isEmpty())
        {
            int sr=qu.peek().sr;
            int sc=qu.peek().sc;
            int val=qu.peek().val;
            qu.remove();
            max=Math.max(max,val);
            if(CheckBoundary(sr-1,sc,n-1,m-1,grid,vis))
            {
                qu.add(new Pair(sr-1,sc,val+1));
                vis[sr-1][sc]=2;
                cnt++;
            }
            if(CheckBoundary(sr+1,sc,n-1,m-1,grid,vis))
            {
                    qu.add(new Pair(sr+1,sc,val+1));
                    vis[sr+1][sc]=2;
                    cnt++;
            }
            if(CheckBoundary(sr,sc-1,n-1,m-1,grid,vis))
            {
                    qu.add(new Pair(sr,sc-1,val+1));
                    vis[sr][sc-1]=2;
                    cnt++;
            }
            if(CheckBoundary(sr,sc+1,n-1,m-1,grid,vis))
            {   
                qu.add(new Pair(sr,sc+1,val+1));
                vis[sr][sc+1]=2;
                cnt++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((grid[i][j]==1 && vis[i][j]!=2))
                {
                    return -1;
                }   
            }
        }
        if(max == 0)return 0;
        return max-1;
    }
}