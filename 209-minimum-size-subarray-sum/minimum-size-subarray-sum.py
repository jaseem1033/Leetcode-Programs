class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        max_sum = 0
        min_len = 10000000000
        l = 0

        for r in range(len(nums)):
            max_sum += nums[r]

            while max_sum >= target:
                min_len = min(min_len, r-l+1)
                max_sum -= nums[l]
                l += 1

        if min_len == 10000000000:
            return 0
        else:
            return min_len
        