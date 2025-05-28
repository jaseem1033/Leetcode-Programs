class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for(int i : arr) totalSum += i;
        if(totalSum % 3 != 0) return false;
        totalSum /= 3;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(sum == totalSum) {
                count++;
                sum = 0;
            }
            if(count == 2 && i != arr.length-1) return true;
        }
        return false;
    }
}