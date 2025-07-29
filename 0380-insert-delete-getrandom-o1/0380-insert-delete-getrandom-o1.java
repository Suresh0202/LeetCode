class RandomizedSet {
    HashSet<Integer>st;
    public RandomizedSet() {
        st=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!st.contains(val))
        {
            st.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(st.contains(val))
        {
            st.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
         List<Integer> list = new ArrayList<>(st);
        Random rand = new Random();
        int randomValue = list.get(rand.nextInt(list.size()));
        return randomValue;
        // return st.top();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */