// class Pair{
//     int a,b;
//     Pair(int a,int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
// }
class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int as=0;
        HashMap<List<Integer>,Integer>mp=new HashMap<>();
        for(int i=0;i<dom.length;i++)
        {
            int a=dom[i][0];
            int b=dom[i][1];
            List<Integer>ar=new ArrayList<>();
            if(a>=b)
            {

            }else
            {
                int temp=b;
                b=a;
                a=temp;
            }
            ar.add(a);
            ar.add(b);
            if(mp.isEmpty())
            {
                mp.put(ar,1);
            }else
            {
                if(mp.containsKey(ar))
                {
                    as+=mp.get(ar);
                    mp.put(ar,mp.get(ar)+1);
                }else
                {
                    mp.put(ar,1);
                }
            }
        }
        // int ans=0;
        // for(Map.Entry<List<Integer>,Integer>m:mp.entrySet())
        // {
        //     if(m.getValue()>1)
        //     {
        //         int k=m.getValue();
        //         ans+=k;
        //     }
        // }
        // System.out.println(mp);
        return as;
    }
}