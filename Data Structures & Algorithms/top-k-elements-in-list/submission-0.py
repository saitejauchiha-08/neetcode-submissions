class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        ha = {}
        for i in nums:
            if i in ha:
                ha[i] +=1
            else:
                ha[i] = 1
        arr = sorted(ha,key=ha.get,reverse = True)
        return arr[:k] 
        