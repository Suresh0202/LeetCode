class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        if(low%2!=0)
        {
            for(int i=low;i<=high;i+=2)
          {
            if(i%2==1)
            {
                c++;
            }
          }
        }else
        {
              for(int i=low+1;i<=high;i+=2)
        {
                if(i%2==1)
                {
                c++;
                }
        }
        }
        
      
        return c;
    }
}