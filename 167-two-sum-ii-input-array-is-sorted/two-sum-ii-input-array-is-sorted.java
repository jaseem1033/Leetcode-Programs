class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(i < j) {
        int k = numbers[i] + numbers[j];
        if(k == target) return new int[]{i+1, j+1};
        else if(k < target) i++;
        else j--;
        }
        return null;
    }
}