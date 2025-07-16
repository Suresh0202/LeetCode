class Solution {
    public int maximumLength(int[] nums) {
        int ce=0,co=0,cal=0,vis=-1;
        for(int i:nums)
        {
            if(i%2==1)
            {
                co++;
                if(vis!=1)
                {
                    cal++;
                    vis=1;
                }
            }else
            {
                ce++;
                if(vis!=0)
                {
                    cal++;
                    vis=0;
                }
            }
        }
        if(ce >=co && ce>=cal)
        {
            return ce;
        }else if(co>=ce && co>=cal)
        {
           return co;
        }else if(cal>= ce && cal>=co) {
            return cal;
        }
        return -1;
    }
}