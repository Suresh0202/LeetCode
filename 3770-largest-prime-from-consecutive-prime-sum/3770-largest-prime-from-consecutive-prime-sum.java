class Solution {
    public boolean isPrime(int n)
    {
        if(n <= 1)return false;
        if(n%2 ==0 )return false;
        if(n == 2)return true;
        for(int i=3;(i*i) <= n; i+=2)
            {
                if(n%i == 0)return false;
            }
        return true;
    }
    public int largestPrime(int n) {
        if( n == 1)return 0;
        int ans=2;
        int sum=2;
        // int x=2;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
                if(isPrime(sum))
                {
                if(sum<=n)
                {
                    ans=sum;
                }else
                {
                    break;
                }
                }
            }
        }
        return ans;
    }
}