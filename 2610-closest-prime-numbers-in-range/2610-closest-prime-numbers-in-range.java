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
        int m=Integer.MAX_VALUE;
        ans[0]=-1;
        ans[1]=-1;
        for(int i=1;i<ar.size();i++)
        {
            int d=ar.get(i)-ar.get(i-1);
            if(d<m)
            {
                m=d;
                ans[0]=ar.get(i-1);
                ans[1]=ar.get(i);
            }

        }
        return ans;
    }
}