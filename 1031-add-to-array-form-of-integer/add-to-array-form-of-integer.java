class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer>list = new ArrayList<>();
        int n = num.length-1;
        int carry = 0;

        while(k > 0 || n >= 0) {
            int val;
            if(n < 0) val = k % 10 + carry;
            else val = (k%10) + num[n] + carry;
            if(val > 9) {
                carry = 1;
                list.add(0, val % 10);
            }
            else {
                list.add(0,val);
                carry = 0;
            }
            k /= 10;
            n--;
        }
        if(carry == 1) list.add(0,1);
        return list;
    }
}