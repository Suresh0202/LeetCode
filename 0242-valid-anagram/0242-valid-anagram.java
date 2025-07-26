class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()  != t.length())return false;
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
         
        }
        for(int i=0;i<t.length();i++)
        {
            hash[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            {
                return false;
            }
        }
        return true;
        // System.out.pr/intln(Arrays.toString(hash));
        // return true;
    }

}

// [1,2,3,4,1,6]; original
// 0,1,2,3,4,5,6];
// // [0,2,1,1,1,0,1] hasharray

// 0-a
// 1=b
// 2=c


// 25= c;
// [3,0,0,0,0,0,1,,0,0,0,,1,,0,0,0,];
