class ProductOfNumbers {
    List<Integer>ar;
    public ProductOfNumbers() {
        ar=new ArrayList<>();
    }
    
    public void add(int num) {
        ar.add(num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        int i=ar.size()-1;
        while(k!=0)
        {
            pro*=ar.get(i--);
            k--;
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */