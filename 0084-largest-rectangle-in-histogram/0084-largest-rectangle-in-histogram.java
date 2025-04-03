class Solution {
    public static int[] findnse(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            ans[i]=st.empty()?n:st.peek();
            st.push(i);
            
        }
        return ans;
    }
     public static int[] findpse(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            ans[i]=st.empty()?-1:st.peek();
            st.push(i);
            
        }
        return ans;
    }
    public int largestRectangleArea(int[] arr) {
        if(arr.length==1)
        {
            return arr[0];
        }
        int nse[]=new int[arr.length];
        nse=findnse(arr);
        int pse[]=new int[arr.length];
        pse=findpse(arr);
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int area=arr[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}