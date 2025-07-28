class Solution {
        List<String>ans=new ArrayList<>();
    public void func(int open,int close,int n,String curr)
    {
        if(curr.length() == n*2)
        {
            ans.add(curr);
            return ;
        }
        if(open<n)
        {
            func(open+1,close,n,curr+"(");
        }
        if(close<open)
        {
            func(open,close+1,n,curr+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        func(0,0,n,"");
        return ans;
    }
}