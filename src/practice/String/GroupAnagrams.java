package practice.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> res = new ArrayList<>();
    if (strs == null || strs.length == 0) return res;
    //TODO: 注意这种用法
    Map<String, List<String>> map = new HashMap<String, List<String>>();

    for (String item: strs) {

      char[] cs = item.toCharArray();
      Arrays.sort(cs);
      if (!map.containsKey(String.valueOf(cs))) {
        map.put(String.valueOf(cs), new ArrayList<>());
      }

        map.get(String.valueOf(cs)).add(item);

    }
    //TODO: 也注意这里的写法
    return new ArrayList<List<String>>(map.values());

  }

}
