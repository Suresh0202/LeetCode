class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        List<Integer>ar=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
            {
                ar.add(i);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            ans[i]=func(i,ar);
        }
        return ans;
    }
    public int func(int j,List<Integer>ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.size();i++)
        {
            min=Math.min(min,Math.abs(j-ar.get(i)));
        }
        return min;
    }
}