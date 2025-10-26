class Solution {
    public int totalMoney(int n) {
       int sum=0;
        int rem=n%7;
        int quo=n/7;
        int p=quo;
        int a=1;
        int b=7;
        while(quo-->0)
        {
            for(int i=a;i<=b;i++)
            {
                sum=sum+i;
            }
            a++;
            b++;
        }
        p++;
        for(int i=0;i<rem;i++)
        {
            sum=sum+p;
            p++;
        }
        return sum;
    }
}