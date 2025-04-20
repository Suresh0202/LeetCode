class Solution {
    public long calculateScore(String[] in, int[] vl) {
        long ans = 0;
        int i = 0;
        int n=in.length;
        boolean vis[]=new boolean[n];
        while (i < n ) {
            if(i<0)break;
            if(vis[i])break;
                vis[i]=true;
            if(in[i].equals("add"))
            {                
                ans+=vl[i];
                i++;
                
            }else if(in[i].equals("jump"))
            {
               
                i=i+vl[i];
                
            }
            
        }
        return ans;
    }
}