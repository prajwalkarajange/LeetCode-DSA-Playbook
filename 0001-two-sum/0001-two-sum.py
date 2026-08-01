class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for i in range(len(nums)):
            a=nums[i]
            b=target-a
            if b in map:
                j=map[b]
                return [i,j]
            map[a]=i
