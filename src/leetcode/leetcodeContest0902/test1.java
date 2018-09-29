package leetcodeContest0902;

import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) {

        int[] A = {1,2,4,5};
        boolean res = isMonotonic(A);
        System.out.println(res);
    }

    public static boolean isMonotonic(int[] A) {

        int min = -100001;
        int max = 100001;
        int mark1 = 0;
        int mark2 = 0;
        for (int i=1;i<A.length;i++) {
            if (A[i]>=A[i-1]) continue;
            else {
                mark1 = 1;
                break;
            }
        }

        for (int i=1;i<A.length;i++) {
            if (A[i]<=A[i-1]) continue;
            else {
                mark2 = 1;
                break;
            }
        }

        if (mark1==0||mark2==0) return true;
        else return false;

    }

}
