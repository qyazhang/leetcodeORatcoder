package practice.DP;

import java.util.ArrayList;
import java.util.List;

public class WordBreakII {

  //DP
  //TODO： 基于WordBreak做的，又TLE了
//  public List<String> wordBreak(String s, List<String> wordDict) {
//
//    boolean[] able = new boolean[s.length() + 1];
//    ArrayList[] record = new ArrayList[s.length() + 1];
//
//    able[0] = true;
//    ArrayList<String> item = new ArrayList<>();
//    item.add("");
//    record[0] = item;
//
//    for (int i = 1; i <= s.length(); i++) {
//      ArrayList<String> newItem = new ArrayList<>();
//      newItem.add("");
//      record[i] = newItem;
//      for (int j = 0; j < i; j++) {
//        String sub = s.substring(j, i);
//        if (able[j] && wordDict.contains(sub)) {
//          able[i] = true;
//          ArrayList<String> temp = new ArrayList<>(record[j]);
//          for (String ts: temp) {
//            record[i].add(ts + sub + " ");
//          }
//        }
//      }
//
//    }
//
//    List<String> res = new ArrayList<>();
//    ArrayList<String> temp = new ArrayList<>(record[s.length()]);
//    for (String i: temp) {
//      String id = i.substring(0, Math.max(0,i.length()-1));
//      if (id.replaceAll(" ", "").length()==s.length()) {
//        res.add(id);
//      }
//    }
//
//    return res;
//
//  }

}
