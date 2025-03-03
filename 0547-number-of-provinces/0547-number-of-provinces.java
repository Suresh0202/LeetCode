class Solution {
    public void dfs(int vis[],List<List<Integer>>ajd,int node)
    {
        vis[node]=1;
        for(int i:ajd.get(node))
        {
            if(vis[i]==0)
            {
                dfs(vis,ajd,i);
            }
        }
    }
    
    public int findCircleNum(int[][] adj) {
        List<List<Integer>>adjlist=new ArrayList<>();
        for(int i=0;i<adj.length;i++)
        {
            adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<adj.length;i++)
        {
            for(int j=0;j<adj.length;j++)
            {
                if( adj[i][j] == 1 & i!=j)
                {
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(j);
                }
            }
        }
        int vis[]=new int[adjlist.size()];
        int c=0;
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i] == 0)
            {
                c++;
                dfs(vis,adjlist,i);
            }
        }
        return c;
      
    }
}
