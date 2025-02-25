class Solution {
    public int numOfSubarrays(int[] arr) {
        int c=0;
        int res=0;
        int od=0;
        int ev=1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum%2==0)
            {
                ev++;
                res+=(od);
            }else
            {
                od++;
                res+=ev;
            }
            
        }
        return res;
    }
}