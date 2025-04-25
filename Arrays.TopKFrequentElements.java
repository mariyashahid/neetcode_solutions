class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        Map<Integer, Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());//inserts the values in descending order of map values
        

        int[] res=new int[k];
        for(int i=0;i<nums.length;i++){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> me :map.entrySet()){
            pq.add(me);
        }

        while(k>0){
            res[k-1]=pq.peek().getKey();
            pq.poll();
            k--;
        }

        return res;

    }
}
