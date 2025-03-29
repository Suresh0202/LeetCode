class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int hash[]=new int[27];
        int k=1;
        for(int i=26;i>=0;i--)
        {
            hash[i]=k;
            k++;
        }
        System.out.println(Arrays.toString(hash));
        int p=1;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i)-'a'+1;
            ans+=(hash[ch]*p);
            System.out.println(ans);
            p++;
        }
        return ans;
    }

}