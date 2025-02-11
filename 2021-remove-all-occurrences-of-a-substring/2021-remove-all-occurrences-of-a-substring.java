class Solution {
    void func(Stack<Character> st, String part) {
        int n = part.length() - 1;
        int n1=part.length()-1;
        int ans=0;
        List<Character>aa=new ArrayList<>();
        while(n>=0 && !st.isEmpty())
        {
            if(st.peek()  == part.charAt(n))
            {
                ans=n;
                aa.add(st.pop());
                // st.pop();
            }else
            {
                break;
            }
            n--;
        }
        //   System.out.println("before " + st);
        for(int i=aa.size()-1;i>=0;i--)
        {
            st.add(aa.get(i));
        }
        // System.out.println(ans);
        //  System.out.println("after " + st);
        if(ans==0)
        {
             while(n1>=0 && !st.isEmpty())
        {
            if(st.peek()  == part.charAt(n1))
            {
                // ans=n;
                st.pop();
            }else
            {
                break;
            }
            n1--;
        }
        
               
        }
        


    }

    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int n = part.length();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if (st.peek() == part.charAt(n - 1)) {
            //  /   System.out.println("before " + st);
                 func(st, part);
                // Syst/em.out.println("after " + st);
            }
        }
        String ss="";
        for(char ch:st)
        {
            ss+=ch;
        }
        // System.out.println(st);
        return ss;
    }
}