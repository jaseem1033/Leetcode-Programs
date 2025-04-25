class ProductOfNumbers {
    List<Integer>arr;
    
    public ProductOfNumbers() {
        arr=new ArrayList<>();
        arr.add(1);
    }
    
    public void add(int num) {
        if(num==0)
        {
            arr=new ArrayList<>();
            arr.add(1);
        }
        else
          {  
            int a=arr.get(arr.size() - 1);
            arr.add(num*a);
          }
    }
    
    public int getProduct(int k) {
        if(k>=arr.size()) return 0;
        else
        {
            int n=arr.size();
            return(arr.get(n-1)/(arr.get(n-1-k)));
        }
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */