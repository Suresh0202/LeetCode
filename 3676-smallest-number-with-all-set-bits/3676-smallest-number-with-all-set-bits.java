class Solution {
    public int smallestNumber(int n) {
        int a=0;
        for(int i=n;;i++)
            {
                if((i&i+1)==0)
                {
                    a=i;
                    break;
                }
            }
        return a;
    }
}