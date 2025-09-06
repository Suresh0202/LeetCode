class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cossum=0;
        int gassum=0;
        for(int i:gas){
                gassum+=i;
        }
        for(int i:cost){
            cossum+=i;
        }
        if(cossum > gassum)
        {
            return -1;
        }
        int st=0;
        int tot=0;
        for(int i=0;i<gas.length;i++)
        {
            tot+=gas[i]-cost[i];
            if(tot < 0)
            {
                tot=0;
                st=i+1;
            }
        }
        return st;
    }
}