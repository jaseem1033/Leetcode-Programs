class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int count = 0;
        while(left != 0 && right != 0) {
            if(left == right) break;
            left >>= 1;
            right >>= 1;
            count++;
        }

        if(left != right) return 0;

        
        return left << count;

    }
}