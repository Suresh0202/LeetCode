class FrontMiddleBackQueue {
    List<Integer>ar;
    public FrontMiddleBackQueue() {
        ar=new ArrayList<>();
    }
    
    public void pushFront(int val) {
        ar.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int n=ar.size();
        if(n%2 == 0)
        {
            n=n/2;
            // n--;
        }else
        {
            n=n/2;
            // n--;
        }
        ar.add(n,val);
    }
    
    public void pushBack(int val) {
        ar.add(val);
    }
    
    public int popFront() {
        if(ar.size() == 0)
        {
            return -1;
        }
        int ele=ar.get(0);
        ar.remove(0);
        return ele;
    }
    
    public int popMiddle() {
        if(ar.size() == 0)
        {
            return -1;
        }
        int n = ar.size();
        if(n % 2 == 0)
        {
            n=n/2;
            n--;
        }else
        {
            n=n/2;
            // n--;
        }
        int ele=ar.get(n);
        ar.remove(n);
        return ele;
    }
    
    public int popBack() {
        if(ar.size() == 0)
        {
            return -1;
        } 
        int ele=ar.get(ar.size()-1);
        ar.remove(ar.size()-1);
        return ele;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */