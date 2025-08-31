class MedianFinder {
    PriorityQueue<Integer>min;
    PriorityQueue<Integer>max;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek() >= num)
        {
            max.add(num);
        }else
        {
            min.add(num);
        }
        if(max.size() > min.size()+1)
        {
            min.add(max.poll());
        }else if(max.size() < min.size())
        {
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size()  == min.size())
        {
            double ans=(max.peek()+min.peek());
            ans=ans/2;
            return ans;
        }
        return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */