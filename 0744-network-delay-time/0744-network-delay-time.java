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
        PriorityQueue<int[]> qu = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int distance[]=new int[n+1];
        Arrays.fill(distance,(int)(1e9));
        qu.add(new int[]{0,k});
        distance[k]=0;
        int max=Integer.MIN_VALUE;
        while(!qu.isEmpty())
        {
            int trip[]=qu.poll();
            int time=trip[0];
            int node=trip[1];
if (time > distance[node]) continue;
            max=Math.max(max,time);
            for(int it[]:adj.get(node))
            {
                int wt=it[1];
                int nodeP=it[0];
                if( wt + time < distance[nodeP])
                {
                    distance[nodeP]=(wt+time);
                    qu.add(new int[]{distance[nodeP],nodeP});
                }
            }
        }
     int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == (int) 1e9) return -1; // unreachable node
            ans = Math.max(ans, distance[i]);
        }
        return ans;
        // return max;
    }
}