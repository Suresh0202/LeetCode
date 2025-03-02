class Solution {
    public void bfs(int vis[],List<List<Integer>>ajd,int node)
    {
        vis[node]=1;
        for(int i:ajd.get(node))
        {
            if(vis[i]==0)
            {
                bfs(vis,ajd,i);
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
        for(int i=0;i<adj.length;i++)
        {
            if(vis[i] == 0)
            {
                c++;
                bfs(vis,adjlist,i);
            }
        }
        
        //  System.out.println(Arrays.toString(vis));
        return c;
    }
}
