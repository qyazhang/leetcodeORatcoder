package leetcode.leetcodeContest0930;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class test3 {

  public static void main(String[] args) {

  }

  public List<String> wordSubsets(String[] A, String[] B) {

    List<String> res = new ArrayList<>();

    for (int i = 0; i < A.length; i++) {
      int mark = 1;
      HashSet<Character> set = new HashSet<>();
      for (int j = 0; j < B.length; j++) {
        String item = A[i];
        String letters = B[j];
        for (int k=0;k<letters.length();k++){
          char c = letters.charAt(k);
          if (set.contains(c)) {
            mark = 0;
            break;
          }
          int index = item.indexOf(c);
          if (index==-1) {
            mark = 0;
            set.add(c);
            break;
          }
          else {
            item = item.substring(0,index) + item.substring(index+1, item.length());
          }
        }
        if (mark == 0) continue;
      }
      if (mark == 1) res.add(A[i]);
    }

    return res;

  }

}
