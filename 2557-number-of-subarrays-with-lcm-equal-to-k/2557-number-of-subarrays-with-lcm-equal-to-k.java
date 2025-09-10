class Solution {
    public int gcd(int a,int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public int find(int a,int b)
    {
        return ((a*b)/gcd(a,b));
    }
    public int subarrayLCM(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            int lcm=-1;
            for(int j=i;j<nums.length;j++)
            {
                if(lcm == -1){
                    lcm=nums[j];
                }else {
                    lcm=find(lcm,nums[j]);
                }
                if(lcm == k)
                {
                    cnt++;
                }
                if(lcm > k)
                {
                    break;
                }

            }
        }
        return cnt;
    }
}