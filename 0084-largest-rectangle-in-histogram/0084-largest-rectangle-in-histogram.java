class Solution {
    public int largestRectangleArea(int[] hh) {
        int n=hh.length;
        int nse[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && hh[st.peek()]>=hh[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nse[i]=st.peek();
            }else
            {
                nse[i]=n;
            }
            st.push(i);
        }
        int lnse[]=new int[n];
        Stack<Integer>st1=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st1.isEmpty() && hh[st1.peek()]>=hh[i])
            {
                st1.pop();
            }
            if(!st1.isEmpty())
            {
                lnse[i]=st1.peek();
            }else
            {
                lnse[i]=-1;
            }
            st1.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int x=(nse[i]-lnse[i]-1)*hh[i];
            ans=Math.max(ans,x);
        }
        System.out.println(Arrays.toString(lnse));
        return ans;
    }
}