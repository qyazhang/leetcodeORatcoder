package practice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class grayCode {

  //My idea is to generate the sequence iteratively. For example, when n=3, we can get the result based on n=2.
  //00,01,11,10 -> (000,001,011,010 ) (110,111,101,100). The middle two numbers only differ at their highest bit,
  //while the rest numbers of part two are exactly symmetric of part one. It is easy to see its correctness.
  //Code is simple:
  public List<Integer> grayCode(int n) {
    List<Integer> rec = new ArrayList<>();
    rec.add(0);
    for (int i=0;i<n;i++) {
      for (int j=rec.size()-1;j>=0;j--) {
        int item = rec.get(j) | 1 << i;
        rec.add(item);
      }
    }
    return rec;
  }

}
