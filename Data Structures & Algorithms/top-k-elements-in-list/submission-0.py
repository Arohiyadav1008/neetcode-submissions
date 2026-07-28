class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # Count frequency of each element
        count = Counter(nums)
        
        # Use a min-heap to keep track of top k elements
        # heapq.nlargest is optimized, but manual heap shows logic:
        return [num for num, freq in heapq.nlargest(k, count.items(), key=lambda x: x[1])]

# Alternative manual heap implementation:
def topKFrequent_manual(nums, k):
    count = Counter(nums)
    heap = []
    for num, freq in count.items():
        heapq.heappush(heap, (freq, num))
        if len(heap) > k:
            heapq.heappop(heap)
    return [num for freq, num in heap]