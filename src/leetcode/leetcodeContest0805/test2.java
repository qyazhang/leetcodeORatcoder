package leetcode.leetcodeContest0805;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        int res = numRescueBoats(ar, 50);
        System.out.println(res);
    }
    public static int numRescueBoats(int[] a, int limit) {
        Arrays.sort(a);
        int n = a.length;
        int p = 0;
        int ct = 0;
        for(int i = n-1;i >= p;i--){
            if(p < i && a[i] + a[p] <= limit){
                p++;
            }
            ct++;
        }
        return ct;
    }
//    public static int numRescueBoats(int[] people, int limit) {
//
//        int[] used = new int[people.length];
//        int i=0;
//        int res = 0;
//        while (i<people.length){
//            if (used[i]==1) {
//                i++;
//                continue;
//            }
//            int num1 = people[i];
//            if (num1==limit){
//                used[i]=1;
//                i++;
//                res++;
//                continue;
//            }
//            int mark = 0;
//            for (int j=i;j<people.length;j++){
//                if (used[j]==1) continue;
//                if (num1+people[j]==limit) {
//                    used[j]=1;
//                    used[i]=1;
//                    i++;
//                    res++;
//                    mark = 1;
//                    break;
//                }
//            }
//            if (mark==0) {
//                i++;
//            }
//        }
//
//        System.out.println("here");
//        System.out.println(res);
//        i=0;
//        while (i<people.length) {
//            if (used[i]==1) {
//                i++;
//                continue;
//            }
//            int tempSum = used[i];
//            for (int j=i;j<people.length;j++){
//                    if (used[j]==1) continue;
//                    if (tempSum+people[j]<limit) {
//                        used[j]=1;
//                        used[i]=1;
//                        tempSum+=people[j];
//                    }
//            }
//            i++;
//            res++;
//
//        }
//
//        return res;
//
//    }


}
