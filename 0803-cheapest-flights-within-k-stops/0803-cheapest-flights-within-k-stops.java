class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int f[]:flights)
        {
            int a=f[0];
            int b=f[1];
            int c=f[2];
            adj.get(a).add(new int[]{b,c});

        }
        int distance[]=new int[n];
        Arrays.fill(distance,(int)(1e9));
        Queue<int[]>qu=new LinkedList<>();
        qu.add(new int[]{0,src,0});
        //steps,src,dist;
        while(!qu.isEmpty())
        {
            int trip[]=qu.poll();
            int stop=trip[0];
            int node=trip[1];
            int cost=trip[2];
             if (stop > k) continue;
            for(int it[]:adj.get(node))
            {
                int dist=it[1];
                int nodeP=it[0];

                if(cost + dist < distance[nodeP] )
                {
                    distance[nodeP]=(cost +dist);
                qu.add(new int[]{stop+1,nodeP,distance[nodeP]});
                }
            }
        }
        if(distance[dst] != (int)(1e9))
        {
            return distance[dst];
        }
        return -1;
    }
}