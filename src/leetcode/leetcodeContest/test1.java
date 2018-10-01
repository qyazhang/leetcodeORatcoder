package leetcodeContest;

public class test1 {

    public static void main(String[] args) {

        int x = (int)Math.pow(2,7)+1;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(binaryGap(x));

    }

    public static int binaryGap(int N) {

        String s = Integer.toBinaryString(N);
        int count = 0;
        int mark = 0;
        int pos = 0;
        int maxDis = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1') count++;
            if (s.charAt(i)=='1') {
                if (mark==1){
                    int tempDis = i-pos;
                    maxDis = tempDis>maxDis?tempDis:maxDis;
                    pos = i;
                    mark = 1;
                }
                if (mark==0) {
                    mark = 1;
                }

            }
        }
        if (count<=1) return 0;
        else {
            return maxDis;
        }

    }

}
