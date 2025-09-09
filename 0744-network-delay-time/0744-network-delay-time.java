class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int t[]:times)
        {
            int u=t[0];
            int v=t[1];
            int w=t[2];
            adj.get(u).add(new int[]{v,w});

        }
        Queue<int[]>qu=new LinkedList<>();
        int distance[]=new int[n+1];
        Arrays.fill(distance,(int)(1e9));
        distance[k]=0;
        qu.add(new int[]{0,k,0});
        int max=Integer.MIN_VALUE;
        while(!qu.isEmpty())
        {
            int trip[]=qu.poll();
            int time=trip[0];
            int node=trip[1];
            int dist=trip[2];
            max=Math.max(max,time);
            for(int it[]:adj.get(node))
            {
                int wt=it[1];
                int nodeP=it[0];
                if( wt + dist < distance[nodeP])
                {
                    distance[nodeP]=(wt+dist);
                    qu.add(new int[]{time+1,nodeP,wt+dist});
                }
            }
        }
       int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == (int) (1e9)) return -1; // unreachable node
            ans = Math.max(ans, distance[i]);
        }
        return ans;
    }
}