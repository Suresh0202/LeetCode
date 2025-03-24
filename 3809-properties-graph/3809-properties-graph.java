class Solution {
     public void dfs(int node,int vis[],List<List<Integer>>ajd)
    {
        vis[node]=1;
        for(int i:ajd.get(node))
        {
            if(vis[i]==0)
            {
                dfs(i,vis,ajd);
            }
        }
    }
    public int intersect(int nums1[],int nums2[])
    {
         HashSet<Integer> set=new HashSet<>();
             HashSet<Integer> set1=new HashSet<>();
       for(int i:nums1)set.add(i);
       for(int i:nums2)
       {
        if(set.contains(i))
        {
            set1.add(i);
        }
       }
         return set1.size();
    }
    public int numberOfComponents(int[][] pro, int k) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<pro.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pro.length;i++)
        {
            for(int j=0;j<pro.length;j++)
            {
                if(i!=j)
                {
                    int cnt=intersect(pro[i],pro[j]);
                    // System.out.println(cnt);
                    if(cnt>=k)
                    {
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }
        }
        int ans=0;
        int vis[]=new int[adj.size()];
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==0)
            {
                ans++;
                dfs(i,vis,adj);
            }
        }

    return ans;
    }
}