class Solution {
    public static void func(int opct,int clct,int n,List<String>s,StringBuilder sb,int idx)
    {
        if(idx==n)
        {
            s.add(sb.toString());
            return ;
        }
        if(opct<n/2)
        {
            sb.append("(");
            func(opct+1,clct,n,s,sb,idx+1);
             sb.deleteCharAt(sb.length()-1);
        }
        if(clct<opct)
        {
            sb.append(")");
            func(opct,clct+1,n,s,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String>s=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        func(0,0,2*n,s,sb,0);
        return s;
    }
}