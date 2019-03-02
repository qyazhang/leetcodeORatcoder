package practice.DP;

import java.util.List;

public class WordBreak {

  //DP
  //TODO: 考虑某一个string，他的一个substring是可行的，同时另外一段substring包含于wordDict之中，则这个string是可行的。
  //TODO：根据这个思路构建DP
  public boolean wordBreak(String s, List<String> wordDict) {

    boolean[] able = new boolean[s.length()+1];

    able[0] = true;

    for (int i=1;i<=s.length();i++) {

      for (int j=0;j<i;j++) {
        if (able[j]&&wordDict.contains(s.substring(j,i))) {
          able[i] = true;
          break;
        }
      }

    }
    return able[s.length()];

  }

}
