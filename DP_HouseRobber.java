class Solution {
    public int rob(int[] nums) {
        

        if(nums.length==1){
            return nums[0];
        }

        int[] robbed=new int[2]; 
        robbed[0]=nums[0];
        robbed[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){

            //either take it 
            //if take i then need to calculate robbed[i-2]+nums[i]
            

            //not take it 
            //robbed[i-1]

            //get the maximum of both and store at robbed[i]
            int temp=robbed[1];
            robbed[1]=Math.max(robbed[0]+nums[i],robbed[1]);
            robbed[0]=temp;
        }
        return robbed[1];
    }
}
