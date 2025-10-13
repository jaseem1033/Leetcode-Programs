class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        res = []
        dic = {}

        for i in nums:
            if i not in dic:
                dic[i] = 1
            else:
                dic[i] += 1

        while len(res) != k:
            max_key = max(dic, key = dic.get)
            res.append(max_key)
            del dic[max_key]

        return res
        