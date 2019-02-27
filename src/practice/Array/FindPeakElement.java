package practice.Array;

public class FindPeakElement {

  public int findPeakElement(int[] nums) {
    int low = 0;
    int high = nums.length-1;

    //TODO：利用二分查找来寻找一个局部最大值.
    //直接顺序查找好像也可以（慢很多），这个局部最大值的方法还是要学习一个
    while(low < high)
    {
      int mid1 = (low+high)/2;
      int mid2 = mid1+1;
      if(nums[mid1] < nums[mid2])
        low = mid2;
      else
        high = mid1;
    }
    return low;
  }

}
