class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone : stones) {
            pq.offer(-stone);
        }

        while (pq.size() > 1) {
            int max1 = pq.poll();
            int max2 = pq.poll();

            if (max1 == max2) {
                continue;
            } else {
                pq.offer(max1 - max2);
            }
        }

        if (pq.size() == 1) {
            return Math.abs(pq.peek());
        } else {
            return 0;
        }
    }
}
