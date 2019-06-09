package practice.String;

public class ExpressiveWords {

  //TODO：这个判断3连的方法还是有点晕啊。。。
  public int expressiveWords(String S, String[] words) {

    int res = 0;

    for (String item : words) {
      int i, j;
      for (i = 0, j = 0; i < S.length(); i++) {
        if (j < item.length() && S.charAt(i) == item.charAt(j))
          j++;
        else if (i > 0 && S.charAt(i - 1) == S.charAt(i) && i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1))
          i++;
        else if (!(i > 1 && S.charAt(i) == S.charAt(i-1) && S.charAt(i) == S.charAt(i-2)))
          break;
      }
      if (i==S.length()&&j==item.length())
        res++;
    }

    return res;

  }

}
