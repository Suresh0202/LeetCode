class Solution {
    public int numberOfSubstrings(String s) {
        int c=0,arr[]=new int[3];
        arr[0]=-1;
        arr[1]=-1;
        arr[2]=-1;
        int n=s.length();
     for(int i=0;i<n;i++)
     {
        arr[s.charAt(i)-'a']=i;
        if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1)
        {
            int k=Math.min(arr[0],arr[1]);
            int p=Math.min(k,arr[2]);
            c+=(1+p);
        }
     }
     return c;
    }

}