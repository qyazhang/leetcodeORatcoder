package practice.DP;

//TODO:Kadane算法，本来是用来求subarray的最大和的，这里最大积由于有负负得正的问题，所以同时记录一个min（负）。
public class MaximumProductSubarray {

  public int maxProduct(int[] nums) {

    if (nums.length==0) return 0;

    int maxhereRecord = nums[0];
    int minhereRecord = nums[0];
    int maxSoFar = nums[0];
    int maxhere;
    int minhere;

    //java foreach从第二个开始好像有点麻烦
//    for (int n : nums) {
    for (int i=1;i<nums.length;i++) {
      maxhere = Math.max(nums[i], Math.max(minhereRecord*nums[i], maxhereRecord*nums[i]));
      minhere = Math.min(nums[i], Math.min(minhereRecord*nums[i], maxhereRecord*nums[i]));
      maxSoFar = Math.max(maxhere, maxSoFar);
      maxhereRecord = maxhere;
      minhereRecord = minhere;
    }

    return maxSoFar;

  }

}
