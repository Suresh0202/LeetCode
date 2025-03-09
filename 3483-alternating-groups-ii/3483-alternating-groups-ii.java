class Solution {
    // public boolean func(StringBuilder sb)
    // {
    //     for(int i=0;i<sb.length()-1;i++)
    //     {
    //         char ch=sb.charAt(i);
    //         char ch1=sb.charAt(i+1);
    //         if(ch == ch1)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int r=0,l=0;
        int arr[]=new int[colors.length+k-1];
        for(int i=0;i<colors.length;i++)
        {
            arr[i]=colors[i];
        }
        int j=0;
        for(int i=colors.length;i<arr.length;i++)
        {
            arr[i]=colors[j++];
        }
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        int c=0;
        while(r<n)
        {
            if (r > 0 && arr[r] == arr[r - 1]) {
                l = r;
            }
            if (r - l + 1 >= k) {
                c++;
            }
            r++;
        }
        return c;
    }
}