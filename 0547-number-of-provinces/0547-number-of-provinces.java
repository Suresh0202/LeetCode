class Solution {
    public static void dfs(List<List<Integer>>adj,int vis[],int x)
    {
        vis[x]=1;
        for(int i:adj.get(x))
        {
            if(vis[i]==0)
            {
                vis[i]=1;
                dfs(adj,vis,i);
            }
        }
    }
    public int findCircleNum(int[][] isc) {
            List<List<Integer>>adj=new ArrayList<>();
            int n=isc.length;
            for(int i=0;i<isc.length;i++)
            {
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j && isc[i][j]==1)
                    {
                    adj.get(i).add(j);
                    adj.get(j).add(j);
                    }
                }
            }
            int vis[]=new int[n];
            int cnt=0;
            for(int i=0;i<n;i++){
                if(vis[i]==0)
                {
                    cnt++;
                    dfs(adj,vis,i);
                }
            }
            return cnt;
    }
}