package practice.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CopyListwithRandomPointer {

  public class Solution {

    public RandomListNode copyRandomList(RandomListNode head) {
      if (head == null) return null;

      HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

      RandomListNode node = head;
      while (node != null) {
        map.put(node, new RandomListNode(node.label));
        node = node.next;
      }

      node = head;
      while (node != null) {
        map.get(node).next = map.get(node.next);
        map.get(node).random = map.get(node.random);
        node = node.next;
      }

      return map.get(head);

    }
  }

  class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
      this.label = x;
    }
  }


}
