class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return new int[]{-1,-1};
        int left = 0, right = n-1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                int start = mid, end = mid;
                while(start - 1 >= 0) {
                    if(nums[start - 1] == target) start--;
                    else break; 
                }

                while(end + 1 < n) {
                    if(nums[end + 1] == target) end++;
                    else break; 
                }
                // if(mid+1 < n && nums[mid+1] == target) return new int[]{mid,mid+1};
                // if(mid-1 >= 0 && nums[mid-1] == target) return new int[]{mid-1,mid};
                return new int[]{start,end};
            }
            if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return new int[]{-1,-1};
    }
}