class Solution {
    public String clearStars(String s) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a, b)->{
            char c1 = s.charAt(a);
            char c2 = s.charAt(b);
            if(c1 == c2){
                return b - a;
            }
            return Character.compare(c1, c2);
        });
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*' && !pq.isEmpty())
            {
                pq.poll();
            }else
            {
                pq.offer(i);
            }
        }
        List<Integer>ar=new ArrayList<>();
        while(!pq.isEmpty())
        {
            ar.add(pq.poll());
        }
        Collections.sort(ar);
        String ans="";
        for(int i=0;i<ar.size();i++)
        {
            ans+=s.charAt(ar.get(i));
        }
        return ans;
    }
}