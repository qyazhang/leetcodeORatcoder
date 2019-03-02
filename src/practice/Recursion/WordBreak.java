package practice.Recursion;

import java.util.List;

public class WordBreak {

  //TLE了
//  public boolean wordBreak(String s, List<String> wordDict) {
//
//    return findComb(s, wordDict);
//
//  }

  //这里BFS比DFS快很多，不会TLE
  //TODO: 用HashMap可以减少分支
//  public boolean findComb(String s, List<String> wordDict) {
//    //System.out.println(s);
//    if (s.length() == 0) return true;
//    boolean res = false;
//    for (String item : wordDict) {
//
//      if (s.contains(item)) {
//        int pos = s.indexOf(item);
//        res = findComb(s.substring(0, pos), wordDict) && findComb(s.substring(pos + item.length(), s.length()), wordDict);
//        if (res == true) break;
//      }
//
//
//    }
//    return res;
//  }

}
