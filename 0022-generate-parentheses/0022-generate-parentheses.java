class Solution {
    public void generate(int op,int clo,int id,StringBuilder s,int n,List<String>ans)
    {
        if(id == 2*n)
        {
            ans.add(s.toString());
            return ;
        }
        if(op < n)
        {
            s.append("(");
            generate(op+1,clo,id+1,s,n,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(clo < op)
        {
            s.append(")");
            generate(op,clo+1,id+1,s,n,ans);
            s.deleteCharAt(s.length()-1);

        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        generate(0,0,0,s,n,ans);
        return ans;


    }
}