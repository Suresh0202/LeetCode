class Solution {
    public int countPrimes(int n) {
        boolean arr[]=new boolean[n+1];
        // Arrays.fill(arr,true);
        if(n>2)
        {
             arr[0]=false;
        arr[1]=false;
        }
        
        for(int i=2;i<Math.sqrt(n);i++)
        {
            for(int j=i*i ;j<Math.sqrt(n);j+=i)
            {
                arr[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(!arr[i])
            {
                c++;
            }
        }
        return c/2;
    }
}