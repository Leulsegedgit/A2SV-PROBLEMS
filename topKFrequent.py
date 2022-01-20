class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        answer = []
        freq = defaultdict(int)
        for num in nums:
            freq[num]+=1
        
        pairs = list(freq.items())
        pairs.sort(key = lambda x:x[1])
        pairs.reverse()
        for i in range(k):
            answer.append(pairs[i][0])
        
        return answer
    
        
            
            
        
