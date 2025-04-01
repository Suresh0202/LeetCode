class Solution {
    public int[] findOrder(int num, int[][] pre) {
        int indeg[]=new int[num];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int p[]:pre)
        {
            int ai=p[0];
            int bi=p[1];
            adj.get(bi).add(ai);
            indeg[ai]++;
        }
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<indeg.length;i++)
        {
            if(indeg[i]==0)
            {
                qu.add(i);
            }
        }
        int x=0;
        List<Integer>ans=new ArrayList<>();
        while(!qu.isEmpty())
        {
            int node=qu.peek();
            qu.remove();
            x++;
            ans.add(node);
            for(int it:adj.get(node))
            {
                indeg[it]--;
                if(indeg[it]==0)
                {
                    qu.add(it);
                }
            }
            
        }
        System.out.println(ans);
        int as[]=new int[ans.size()];
        int j=0;
        int a[]=new int[0];
        for(int i:ans)
        {
            as[j++]=i;
        }
        if(x==num)
        {
            return as;
        }
        return a;
        
    }
}