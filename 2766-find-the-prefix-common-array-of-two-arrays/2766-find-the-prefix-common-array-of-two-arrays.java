class Solution {
    public static int func(int k,int ar[],int br[])
    {
        int c=0;
         for(int i=0;i<=k;i++)
            {
                int p=ar[i];
                for(int j=0;j<=k;j++)
                {
                    if(ar[i]==br[j])
                    {
                        c++;
                    }
                }
            }
            return c;
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int ans[]=new int[A.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=func(i,A,B);
        }
        return ans;
    }
}