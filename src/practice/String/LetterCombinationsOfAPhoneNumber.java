package practice.String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

  public List<String> letterCombinations(String digits) {

    char[] num = digits.toCharArray();
    LinkedList<String> res = new LinkedList<>();

    if (digits.isEmpty()) return res;

    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    res.add("");

    for (int i =0; i<num.length;i++){

      int x = num[i] - '0';

      while (res.peek().length()==i) {
        String item = res.remove();
        //TODO: get familiar with this for iteration in Java
        for(char s : mapping[x].toCharArray())
          res.add(item + s);
      }

    }

    return res;

  }

}
