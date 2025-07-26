class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char arr[]=new char[s.length()];
        char brr[]=new char[t.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            brr[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
          return Arrays.equals(arr,brr);
        //   return false;





    }
}

// a a a g m n  r --s;
// a a a g m n r  -- t;


// a t r --s;
// a c r -- t;