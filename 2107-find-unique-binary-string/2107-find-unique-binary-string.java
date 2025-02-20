class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> arr=new ArrayList<>();
        for(String s:nums)
        {
            arr.add(s);
        }
        	String ans="";
         for(int i=0;i<nums.length;i++)
        {
              String s=nums[i];
              for(int j=0;j<s.length();j++)
              {
                  String s1="";
                  if(s.charAt(j)=='0')
                  {
                      char ch='1';
                    s1 = s.substring(0, j) + ch
              + s.substring(j + 1);
                  System.out.println(i+" -->"+ s1);
                    if(arr.contains(s1))
                    {
                        
                    }else{
                        ans+=s1;
                        break;
                    }
                  } else{
                      char ch='0';
                       s1 = s.substring(0, j) + ch
              + s.substring(j + 1);
                     System.out.println(i+" -->"+ s1);
                    if(arr.contains(s1))
                    {
                        
                    }else{
                        ans+=s1;
                        break;
                    }
                  }
                  
              }
              if(ans=="")
                  {
                      
                  }else{
                      break;
                  }
            
        }
        return ans;
    }
}