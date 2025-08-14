class Solution {
    public String largestGoodInteger(String num) {
        HashMap<String,Integer>mp=new HashMap<>();
        mp.put("000",1);
        mp.put("111",1);
        mp.put("222",1);
        mp.put("333",1);
        mp.put("444",1);
        mp.put("555",1); mp.put("666",1);
        mp.put("777",1); mp.put("888",1);
        mp.put("999",1);
        StringBuilder sb=new StringBuilder();
        int r=0;
        int n=num.length();
        int l=0;
        int ans=0;
        int flag=0;
        while(r<n)
        {
            sb.append(num.charAt(r));
            if(r-l+1 == 3)
            {
                if(mp.containsKey(sb.toString()))
                {
                    flag=1;
                    ans=Math.max(ans,Integer.parseInt(sb.toString()));
         
                }
                sb.deleteCharAt(0);
                l++;
            }
            r++;
        }
         if(flag == 0)
        {
            return "";
        }
        if(ans == 0)
        {
            return "000";
        }
        return ""+ans;
    }
}