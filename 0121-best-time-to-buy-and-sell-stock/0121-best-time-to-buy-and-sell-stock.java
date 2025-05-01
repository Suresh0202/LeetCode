class Solution {
    public int maxProfit(int[] arr) {
        int maxPro = 0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int cost=arr[i]-mini;
            maxPro=Math.max(maxPro,cost);
            mini=Math.min(mini,arr[i]);
        }
        return maxPro;
    }
}