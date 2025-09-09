class Solution {
    public boolean isVal(int sr,int sc,int vis[][])
    {
        if(sr<0 || sc<0 || sr>=vis.length || sc>=vis[0].length)
        {
            return false;

        }
        return true;
    }
    public int minimumEffortPath(int[][] grid) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(vis[i],(int)(1e9));
        }
        vis[0][0]=1;
        pq.add(new int[]{0,0,0});
        // dist,sr,sc;
        int min=Integer.MAX_VALUE;
        while(!pq.isEmpty())
        {
            int trip[]=pq.poll();
            int dis=trip[0];
            int sr=trip[1];
            int sc=trip[2];
            if(sr == n-1 && sc == m-1)
            {
                return dis;
            }
            if(isVal(sr+1,sc,vis))
            {
                int distt=Math.max(dis,Math.abs(grid[sr+1][sc]-grid[sr][sc]));
                if(distt < vis[sr+1][sc])
                {
                    vis[sr+1][sc]=distt;
                pq.add(new int[]{distt,sr+1,sc});
                }
              
            }
            if(isVal(sr,sc+1,vis))
            {
                int distt=Math.max(dis,Math.abs(grid[sr][sc+1]-grid[sr][sc]));
                if(distt < vis[sr][sc+1])
                {
                    vis[sr][sc+1]=distt;
                pq.add(new int[]{distt,sr,sc+1});
                }
             
            }
            if(isVal(sr-1,sc,vis))
            {
                int distt=Math.max(dis,Math.abs(grid[sr-1][sc]-grid[sr][sc]));
                if(distt < vis[sr-1][sc])
                {
                    vis[sr-1][sc]=distt;
                pq.add(new int[]{distt,sr-1,sc});
                }
              
            }
            if(isVal(sr,sc-1,vis))
            {
                int distt=Math.max(dis,Math.abs(grid[sr][sc-1]-grid[sr][sc]));
                if(distt < vis[sr][sc-1])
                {
                    vis[sr][sc-1]=distt;
                pq.add(new int[]{distt,sr,sc-1});
                }
                
            }
        }
        return 0;
    }
}