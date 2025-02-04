
class Solution {
    public int lengthOfLIS(int[] nums) {

        int[] arr = new int[nums.length];
        arr[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            arr[i] = 1;
            int max = arr[i];
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] > nums[i]) {
                    max = Math.max(max, arr[i] + arr[j]);
                }
            }
            arr[i] = max;
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
