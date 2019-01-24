package practice.Heap;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {

    if (nums == null || k <= 0) {
      return new int[0];
    }
    int n = nums.length;
    int[] res = new int[n - k + 1];
    int pos = 0;
    Deque<Integer> index = new ArrayDeque<>();

    for (int i = 0; i < nums.length; i++) {
      if (!index.isEmpty() && index.peekFirst() < i - k + 1) {
        index.pollFirst();
      }
      if (!index.isEmpty() && nums[index.peekLast()] <= nums[i]) {
        index.pollLast();
      }
      index.offer(i);
      if (i >= k + 1) {
        res[pos] = nums[index.peekFirst()];
        pos++;
      }

    }
    return res;

  }

}
