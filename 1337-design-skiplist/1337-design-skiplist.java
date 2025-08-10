class Skiplist {
    HashMap<Integer,Integer>mp;
    public Skiplist() {
        mp=new HashMap<>();
    }
    
    public boolean search(int target) {
        return mp.containsKey(target);
    }
    
    public void add(int num) {
        mp.put(num,mp.getOrDefault(num,0)+1);
    }
    
    public boolean erase(int num) {
        if(mp.containsKey(num))
        {
            if(mp.get(num) == 1)
            {
                mp.remove(num);
            }else
            {
                mp.put(num,mp.get(num)-1);
            }
            return true;
        }
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */