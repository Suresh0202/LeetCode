class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>fir=new ArrayList<>();
        fir.add(1);
        ans.add(fir);
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer>prev=ans.get(i-1);
            List<Integer>a=new ArrayList<>();
            a.add(1);
            for(int j=1;j<i;j++)
            {
                a.add(prev.get(j)+prev.get(j-1));
            }
            a.add(1);
            ans.add(a);
        }
        // System.out.println(ans);
        return ans.get(rowIndex);
    }
}