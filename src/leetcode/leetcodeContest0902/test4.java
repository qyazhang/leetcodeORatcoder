package leetcodeContest0902;

import java.util.Arrays;

public class test4 {

    public static void main(String[] args) {
        String sin = "asdjflkanb";
        System.out.println(orderlyQueue(sin, 1));
    }

    public static String orderlyQueue(String S, int K) {

        if (K==1) {
            String min = S;
            for (int i=1;i<S.length();i++) {
                String S2 = S.substring(1,S.length())+S.charAt(0);
                min = small(S2,min);
                S = S2;
            }
            return min;
        }

        else {
            int[] temp = new int[S.length()];
            for (int i=0;i<S.length();i++) {
                temp[i] = S.charAt(i);
            }
            Arrays.sort(temp);
            String res = "";
            for (int i=0;i<temp.length;i++){
                res = res+(char)temp[i];
            }
            return res;
        }

    }

    public static String small (String a, String b) {

        for (int i=0;i<a.length();i++) {
            if (a.charAt(i)>b.charAt(i)) return b;
            else if (a.charAt(i)<b.charAt(i)) return a;
            else continue;
        }
        return a;
    }
//    uwi老哥的答案，注意一下char sort后直接转换成string，和字符串这样子比较的方法
//    public String orderlyQueue(String S, int K) {
//        int n = S.length();
//        if(K >= 2){
//            char[] s = S.toCharArray();
//            Arrays.sort(s);
//            return new String(s);
//        }else{
//            String ret = S;
//            for(int i = 0;i < n;i++){
//                String T = S.substring(i) + S.substring(0, i);
//                if(T.compareTo(ret) < 0){
//                    ret = T;
//                }
//            }
//            return ret;
//        }
//    }

}
