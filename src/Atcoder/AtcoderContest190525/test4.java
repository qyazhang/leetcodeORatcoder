
package Atcoder.AtcoderContest190525;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class test4 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int m = cin.nextInt();
    HashMap<Integer, Integer> card = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int num = cin.nextInt();
      if (card.containsKey(num)){
        int count = card.get(num);
        card.put(num, count+1);
      }
      else {
        card.put(num, 1);
      }
    }
    for (int i=0;i<m;i++) {
      int num = cin.nextInt();
      int added = cin.nextInt();
      if (card.containsKey(num)){
        int count = card.get(num);
        card.put(num, count+added);
      }
      else {
        card.put(num, added);
      }
    }
    Set<Map.Entry<Integer, Integer>> set = card.entrySet();
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(
            set);
    list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    int sum = 0;
    int count = 0;
    for (int i=list.size()-1;i>=0;i--) {

    }

  }

}

