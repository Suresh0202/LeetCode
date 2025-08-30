class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }else
            {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }else
                {
                    int ans=i-st.peek();
                    max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
}