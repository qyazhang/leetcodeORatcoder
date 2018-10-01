package leetcode.leetcodeContest0729;

public class test1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {



    }

    public ListNode middleNode(ListNode head) {

        if (head==null) return head;

        ListNode one = head;
        ListNode two = head;

        while (two.next!=null&&two.next.next!=null){
            one = one.next;
            two = two.next.next;
        }

        if (two.next==null) return one;
        else return one.next;

    }

}
