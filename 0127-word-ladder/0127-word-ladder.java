class Pair{
    String first;
    int second;
    Pair(String first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(beginWord,1));
        Set<String>st=new HashSet<>();
        for(String s:wordList)st.add(s);
        st.remove(beginWord);
        while(!(qu.isEmpty()))
        {
            String word=qu.peek().first;
            int ans=qu.peek().second;
            qu.remove();
            if(word.equals(endWord))return ans;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char chhar[]=word.toCharArray();
                    chhar[i]=ch;
                    String ns=new String(chhar);
                    if(st.contains(ns))
                    {
                        st.remove(ns);
                        qu.add(new Pair(ns,ans+1));
                    }
                }
            }
        }
        return 0;
    }
}