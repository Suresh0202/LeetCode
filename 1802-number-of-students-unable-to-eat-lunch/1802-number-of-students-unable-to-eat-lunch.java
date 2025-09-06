class Solution {
    public int countStudents(int[] st1, int[] sw) {
        Deque<Integer>qu=new LinkedList<>();
        for(int i=0;i<st1.length;i++)
        {
            qu.addLast(st1[i]);
        }
       
        int cnt=0;
        int i=0;
        while(!qu.isEmpty() && cnt < qu.size())
        {
            if(sw[i] == qu.peekFirst())
            {
                // st.pop();
                qu.removeFirst();
                cnt=0;
                i++;
            }else
            {
                qu.addLast(qu.removeFirst());
            cnt++;
            }
        }
        // System.out.println(st);r
        return qu.size();
    }
}