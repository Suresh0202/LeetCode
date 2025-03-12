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
            int step=qu.peek().second;
            qu.remove();
            if(word.equals(endWord))return step;
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char chr[]=word.toCharArray();
                    chr[i]=ch;
                    String nes=new String(chr);
                    if(st.contains(nes))
                    {
                        qu.add(new Pair(nes,step+1));
                        st.remove(nes);
                    }
                }
            }
        }
        return 0;
    }
}