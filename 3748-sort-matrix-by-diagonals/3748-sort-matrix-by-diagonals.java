class Solution {
    public int[][] sortMatrix(int[][] arr) {
        int n=arr.length;
        int brr[][]=new int[n][n];
         for(int j=n-1;j>=0;j--){
                int sum=0;
                List<Integer>a=new ArrayList<>();
                for(int k=0,l=j;k<n && l<n;k++,l++){
                        
                        a.add(arr[k][l]);
                }
                Collections.sort(a);
                int x=0;
                for(int k=0,l=j;k<n && l<n ;k++,l++)
                {
                    brr[k][l]=a.get(x++);
                }
                // System.out.print(a+" ");
            }
         for(int i=0;i<n;i++){
                int sum=0;
                 List<Integer>a=new ArrayList<>();
                for(int k=i,l=0;k<n && l<n;k++,l++){
                   
                     a.add(arr[k][l]);
                }
                a.sort((x, y) -> y - x);
                int p=0;
                 for(int k=i,l=0;k<n && l<n ;k++,l++)
                {
                    brr[k][l]=a.get(p++);
                }
            //   / System.out.print(a+" ");
            }
        return brr;
    }
}