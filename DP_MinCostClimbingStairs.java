class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int var1 = cost[cost.length - 1];
        int var2 = 0;

        // in above storing last value and zero for top floor

        // 10 15 20
        // var1= 20, var2=0
        // from index 2->3 cost is 20

        // from index 1,0 need to calculate
        for (int i = cost.length - 2; i >= 0; i--) {
            // for index i to top floor

            // single jump cost[i]+var1
            // double jump cost[i]+var2
            int temp = var1;
            var1 = Math.min(cost[i] + var1, cost[i] + var2);
            var2 = temp;

        }
        // var1 will contain minimum from index0 and var2 will contain minimum for index
        // 1
        return Math.min(var1, var2);
    }
}
