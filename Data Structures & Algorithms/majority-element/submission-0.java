class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        
        pq.addAll(map.keySet());

        
        return pq.poll();
    }
}