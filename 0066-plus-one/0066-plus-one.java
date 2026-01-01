class Solution {
    public static void func(int ans[],int digits[])
    {
        int n=ans.length;
        ans[n-1]=0;
        for(int i=ans.length-2;i>=0;i--)
        {
            if(digits[i] == 9)
            {
                ans[i]=0;
            }else
            {
                
            }
        }
    }
    public int[] plusOne(int[] digits) {
        // int ans[]=new int[digits.length];
        int n=digits.length;
        if(digits[n-1] == 9)
        {
           int ans[]=new int[n+1];
           ans[0]=1;
           func(ans,digits);
           ans[0]=1;

            return ans;
        }else
        {
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
    
        // return ;
        
    }
}