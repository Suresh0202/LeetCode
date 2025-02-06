class Solution {
    public static void func(int ind,List<String>arr,StringBuilder  ans,String s,String []map)
    {
        if(ind>=s.length())
        {
            arr.add(ans.toString());
            return;
        }
        int num=s.charAt(ind)-'0';
        String value=map[num];
        for(int i=0;i<value.length();i++)
        {
            // ans+=value.charAt(i);
            ans.append(""+value.charAt(i));
            func(ind+1,arr,ans,s,map);
            // ans=ans.substring(1,ans.length()-1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> letterCombinations(String s) {
        String map[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder();
        List<String>arr=new ArrayList<>();
        List<String>p=new ArrayList<>();
        func(0,arr,sb,s,map);
        if(arr.size()==1)
        {
            String s2=arr.get(0);
            if(s2.equals(""))
            {
                return p;
            }
        }
        return arr;
        
    }
}