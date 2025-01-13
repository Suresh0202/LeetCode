class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        for(char chh:s.toCharArray()) freq[chh-'a']++;
        int ans=0;
        for(int i:freq)
        {
            while(i>=3)
            {
                i-=2;
            }
            ans+=i;
        }
        return ans;
    }
}