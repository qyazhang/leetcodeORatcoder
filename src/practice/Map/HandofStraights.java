package practice.Map;

import java.util.Map;
import java.util.TreeMap;

public class HandofStraights {

  public boolean isNStraightHand(int[] hand, int W) {

    //TODO: TreeMap, 利用红黑树实现，可以对输入的key进行排序
    Map<Integer, Integer> c = new TreeMap<>();
    for (int i : hand) c.put(i, c.getOrDefault(i, 0)+1);
    for (int it : c.keySet())
      if (c.get(it) > 0)
        for (int i = W - 1; i >= 0; --i) {
          if (c.getOrDefault(it + i, 0) < c.get(it)) return false;
          c.put(it + i, c.get(it + i) - c.get(it));
        }
    return true;

  }

}
