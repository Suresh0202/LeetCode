class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer>qu=new LinkedList<>();
        for(int i:nums)
        {
            qu.addLast(i);
        }
        while(k-->0)
        {
            qu.addFirst(qu.removeLast());
        }
        int i=0;
        while(!qu.isEmpty())
        {
            nums[i++]=qu.removeFirst();
        }
    }
}