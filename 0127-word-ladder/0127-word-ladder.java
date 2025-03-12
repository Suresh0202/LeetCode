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
        HashSet<String>st=new HashSet<>();
        for(String s:wordList)
        {
            st.add(s);
        }       
        st.remove(beginWord);
        while(!(qu.isEmpty()))
        {
            String word=qu.peek().first;
            int second=qu.peek().second;
            qu.remove();
            if(word.equals(endWord))return second;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char wordarr[]=word.toCharArray();
                    wordarr[i]=ch;
                    String newWord=new String(wordarr);
                    if(st.contains(newWord))
                    {
                        st.remove(newWord);
                        qu.add(new Pair(newWord,second+1));
                    }
                }
            }
        }
        return 0;
    }
}