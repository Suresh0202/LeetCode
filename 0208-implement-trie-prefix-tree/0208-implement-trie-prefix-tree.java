class Trie {
    class Node{
        Node links[]=new Node[26];
        boolean flag=false;
        
        // implementation of contaninskey --return true if node contains else false;
        boolean containsKey(char ch)
        {
            return links[ch-'a']!=null;
        }
        void put(char ch,Node nde)
        {
            links[ch-'a']=nde;
        }
        Node get(char ch)
        {
            return links[ch-'a'];
        }
        void setEnd()
        {
            flag=true;
        }
        boolean isEnd()
        {
            return flag;
        }
    }

    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                return false;
            }
            node=node.get(word.charAt(i));
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node node=root;
        for(int i=0;i<prefix.length();i++)
        {
            if(!node.containsKey(prefix.charAt(i)))
            {
                return false;
            }
            node=node.get(prefix.charAt(i));

        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */