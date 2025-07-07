class Solution {
    public int[][] merge(int[][] in) {
        // 1.sort the array using comparator
        // 2.Now createa 2 d ans array and add the intervals by checking the condition.
        Arrays.sort(in,new Comparator<int []>(){
            public int compare(int a[],int []b)
            {
                return a[0]-b[0];
            }
        });
        int n=in.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int st1=in[i][0];
            int ed1=in[i][1];
            // System.out.println(st1+ " " +ed1);
            if(!ans.isEmpty() && ans.get(ans.size()-1).get(1) >= ed1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                int st2=in[j][0];
                int ed2=in[j][1];
                if(st2 <= ed1){
                    ed1=Math.max(ed1,ed2);
                }else
                {
                    break;
                }
                //  System.out.println(st2+ " " +ed2);
            }
            ans.add(Arrays.asList(st1,ed1));
            // System.out.println(ans);
        }
        int anss[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            anss[i][0]=ans.get(i).get(0);
            anss[i][1]=ans.get(i).get(1);
        }
        return anss;
    }
}