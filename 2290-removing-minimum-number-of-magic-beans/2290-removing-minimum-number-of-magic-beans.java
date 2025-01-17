class Solution {
    public long minimumRemoval(int[] beans) {
       Arrays.sort(beans);
        long sum=0;
        for(int i=0;i<beans.length;i++){
            sum+=beans[i];
        }
        long result=Integer.MAX_VALUE;
        long m=beans.length;
        for (int i = 0; i < beans.length; i++, m--) {
            result = Math.min(result, sum - m * beans[i]);
        }
        return result;


    }
}