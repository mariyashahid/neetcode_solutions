class Solution {
    public int maxProduct(int[] nums) {
        
        int maximum=Integer.MIN_VALUE;
        int curMin=1;
        int curMax=1;

        for(int i=0;i<nums.length;i++){
            maximum=Math.max(maximum,nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                curMin=1;
                curMax=1;
                continue;
            }
            int temp=curMax;
            curMax=Math.max(curMax*nums[i],curMin*nums[i]);
            curMax=Math.max(curMax,nums[i]);
            curMin=Math.min(temp*nums[i],curMin*nums[i]);
            curMin=Math.min(curMin,nums[i]);
            maximum=Math.max(maximum,curMax);
            
        }


        return maximum;
    }
}
