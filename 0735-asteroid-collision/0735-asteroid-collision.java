class Solution {
    public int[] asteroidCollision(int[] as) {
        // List<Integer>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<as.length;i++)
        {
            if(as[i]>0)
            {
                arr.add(as[i]);
            }else
            {
                while(!arr.isEmpty() &&arr.get(arr.size()-1)>0 &&  Math.abs(as[i]) > arr.get(arr.size()-1))
                {
                    arr.remove(arr.size()-1);
                }
                if(!arr.isEmpty() && Math.abs(as[i]) == arr.get(arr.size()-1))
                {
                    arr.remove(arr.size()-1);
                }
                else if(arr.isEmpty() || arr.get(arr.size()-1)<0)
                {
                    arr.add(as[i]);
                }
            }
        }
        System.out.println(arr);
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}