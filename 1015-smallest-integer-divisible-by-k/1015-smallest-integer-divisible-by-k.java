class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2 == 0  || k%5 == 0)return -1;
        // long arr[]=new long[100];
        long x=1;
        int c=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     // arr[i]=x;
        //     // x=*10+1;
        // }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<k;i++)
        {
            if(x % k == 0)return i+1;
            x=(x*10+1)%k;

        }
        return -1;
    }
}