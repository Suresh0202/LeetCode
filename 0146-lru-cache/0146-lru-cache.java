class LRUCache {

    int curr=0;
    LinkedHashMap<Integer,Integer>mp=new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.curr=capacity;
    }
    
    public int get(int key) {
        if(mp.containsKey(key))
        {
            int val=mp.get(key);
            mp.remove(key);
            mp.put(key,val);
            return val;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key))
        {
            mp.remove(key);
            mp.put(key,value);
        }else
        {
            if(mp.size()>=curr){
                int first=mp.keySet().iterator().next();
                mp.remove(first);
                mp.put(key,value);
            }else{
                mp.put(key,value);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */