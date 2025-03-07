class Solution {
    public int[] closestPrimes(int left, int right) {
        int prime[]=new int[right+1];
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        int n=right;
        for(int i=2;(i*i)<=n;i++)
        {
            if(prime[i]==1)
            {
            for(int j=(i*i);j<=n;j+=i)
            {
                prime[j]=0;
            }
            }
        }
        int ans[]=new int[2];
        List<Integer>ar=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(prime[i]==1)
            {
                ar.add(i);
            }
        }
         System.out.println(ar);
        int m=Integer.MAX_VALUE;
        ans[0]=-1;
        ans[1]=-1;
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        for(int i=1;i<ar.size();i++)
        {
            int x=ar.get(i);
            int y=ar.get(i-1);
            int d=x-y;
            if(d<m)
            {
                m=d;
                // ans1=Math.min(ans1,x);
                // ans2=Math.min(ans2,y);
                ans[0]=y;
                ans[1]=x;
            }

        }
        // ans[0]=ans1;
        // ans[1]=ans2;
        if(ans[0]==-1 && ans[1]== -1)
        {
            return new int[]{-1,-1};
        }
        return ans;
    }
}