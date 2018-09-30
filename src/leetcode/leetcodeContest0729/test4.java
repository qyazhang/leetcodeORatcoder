package leetcode.leetcodeContest0729;

public class test4 {

    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(2));


    }

    public static boolean reorderedPowerOf2(int N) {
        if (N==1) return true;
        String s = Integer.toString(N);
        int[] mark = new int[10];
        for (int i=0;i<s.length();i++){
            mark[s.charAt(i)-'0']++;
        }
        int i=0;

        while(true){
            int same = 1;
            i++;
            String num = Integer.toString((int)Math.pow(2,i));
            //System.out.println(num);
            if (num.length()==s.length()){
                int[] temp = new int[10];
                for (int j=0;j<num.length();j++){
                    temp[num.charAt(j)-'0']++;
                }
                for (int j=0;j<10;j++){
                    if (temp[j]!=mark[j]) {
                        same = 0;
                    }
                }
                if (same==1) return true;
            }
            if (num.length()>s.length()) break;
        }
        return false;

    }


}
