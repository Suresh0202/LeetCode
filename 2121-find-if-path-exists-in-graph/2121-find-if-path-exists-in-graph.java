class Solution {
    public boolean isvalid(List<List<Integer>> edges,boolean vis[],int s,int d)
    {
        if(s == d)
        {
            return true;
        }
        vis[s]=true;
        for(int x:edges.get(s))
        {
            if(!vis[x])
            {
                boolean hs=isvalid(edges,vis,x,d);
                if(hs)
                {
                    return true;
                }
                // return isvalid(edges,vis,s,d);
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int s, int d) {
         
          List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        boolean vis[]=new boolean[n];
        boolean ans=isvalid(adjList,vis,s,d);
        return ans;
    }
}