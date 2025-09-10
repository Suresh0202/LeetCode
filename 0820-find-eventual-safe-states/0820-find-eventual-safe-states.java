class Solution {
    public List<Integer> eventualSafeNodes(int[][] pri) {
         ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=pri.length;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
       for(int j=0;j<n;j++)
       {
        for(int i:pri[j])
        {
            adj.get(i).add(j);
        }
       }
       int indeg[]=new int[n];
       for(int i=0;i<n;i++)
       {
           for(int it:adj.get(i))
           {
               indeg[it]++;
           }
       }
       Queue<Integer>qu=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
           if(indeg[i] == 0)
           {
               qu.add(i);
           }
       }
       ArrayList<Integer>ans=new ArrayList<>();
       while(!qu.isEmpty())
       {
           int node=qu.poll();
           ans.add(node);
           for(int  it:adj.get(node))
           {
               indeg[it]--;
               if(indeg[it] == 0)
               {
                   qu.add(it);
               }
           }
       }
       Collections.sort(ans);
       return ans;
    }
}