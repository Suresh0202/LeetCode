class Solution {
    public long coloredCells(int n) {
        long num=1;
        long add=4;
        for(int i=1;i<n;i++)
        {
            num+=add;
            add+=4;
        }
        return num;
    }
}