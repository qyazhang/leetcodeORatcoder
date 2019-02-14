package practice.Recursion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {
  //TODO: practice BFS more
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    if (beginWord.equals(endWord) || wordList.size() == 0)
      return 0;

    if (wordDist(beginWord, endWord) == 1)
      return 2;

    HashSet<String> used = new HashSet<String>();
    Set<String> beginSet = new HashSet<String>();

    beginSet.add(beginWord);
    int len = 1;
    while (!beginSet.isEmpty()) {
      Set<String> temp = new HashSet<String>();

      for (String word : beginSet) {
        System.out.println("here word " + word);
        if (wordDist(word, endWord) == 1 && wordList.contains(endWord)) {
          return len + 1;
        }

        for (int i = 0; i < wordList.size(); i++) {
          System.out.println("compared word " + wordList.get(i));
          if (wordDist(word, wordList.get(i)) == 1 && !used.contains(wordList.get(i))) {
            temp.add(wordList.get(i));
            used.add(wordList.get(i));
          }
        }

      }
      System.out.println(temp.size());
      beginSet = temp;
      len++;

    }

    return 0;
  }

  public int wordDist(String a, String b) {

    if (a.length() != b.length()) return -1;
    else {
      int count = 0;
      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != b.charAt(i))
          count++;
      }
      return count;
    }

  }

}
