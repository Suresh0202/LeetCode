class Solution {
    public int[][] insert(int[][] in, int[] nin) {
        int nst=nin[0];
        int ned=nin[1];
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<in.length;i++)
        {
            int st=in[i][0];
            int ed=in[i][1];
            arr.add(Arrays.asList(st,ed));
        }
        arr.add(Arrays.asList(nst,ned));
        List<List<Integer>>ans=new ArrayList<>();
        Collections.sort(arr,new Comparator<List<Integer>>(){
            public int compare(List<Integer>a,List<Integer>b)
            {
                return a.get(0)-b.get(0);
            }
        });
        int n=arr.size();
          System.out.println(arr);
        for(int i=0;i<n;i++)
        {
            int start=arr.get(i).get(0);
            int end=arr.get(i).get(1);
            if((!ans.isEmpty()) && end <= ans.get(ans.size()-1).get(1))
            {
                    continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(end >= arr.get(j).get(0))
                {
                    end= Math.max(end,arr.get(j).get(1));
                    if(end == arr.get(j).get(0))i++;
                }else
                {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }   
        System.out.println(ans);
        // int a[][]=new int[in.length][2];
         int a[][]=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            a[i][0]=ans.get(i).get(0);
            a[i][1]=ans.get(i).get(1);
        }
        return a;
        // return a;
    }
}