package practice.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {

  public int minimumTotal(List<List<Integer>> triangle) {

    List<Integer> sum = new ArrayList<>();
    if (triangle.size()==0||triangle.get(0).size()==0) return 0;
    for (int i=1;i<=triangle.size();i++) {

      List<Integer> item = triangle.get(i-1);
      Integer[] sumTemp = new Integer[item.size()];
      for (int j=0;j<sumTemp.length;j++) {
        if (i==1) {
          sumTemp[j] = item.get(0);
        }
        else if (j==0){
          sumTemp[j] = sum.get(0)+item.get(0);
        }
        else if (j==sumTemp.length-1) {
          sumTemp[j] = sum.get(sum.size()-1) + item.get(item.size()-1);
        }
        else {
          sumTemp[j] = Math.min(sum.get(j-1)+item.get(j), sum.get(j)+item.get(j));
        }
      }
      sum = Arrays.asList(sumTemp);
      System.out.println(sum.toString());
    }
    return Collections.min(sum);

  }

}
