class Solution {
    public int possibleStringCount(String word) {
        int cnt=1;
        int ans=1;
        for(int i=0;i<word.length()-1;i++)
        {
            if(word.charAt(i) == word.charAt(i+1))
            {
                cnt++;
            }else
            {
                // System.out.println(word.charAt(i));
                // System.out.println(cnt);
                if(cnt > 1)
                {
                ans+=(cnt-1);
                }
                cnt=1;
            }
        }
        if(cnt >1)
        {
        ans+=(cnt-1);
        }
        // System.out.println(cnt);
        return ans;
    }
}