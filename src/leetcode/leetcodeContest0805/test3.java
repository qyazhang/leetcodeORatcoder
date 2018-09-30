package leetcode.leetcodeContest0805;

public class test3 {

    public static void main(String[] args) {

        //decodeAtIndex("a2b3c3", 5);

    }
    public String decodeAtIndex(String S, int K) {
        char[] s = S.toCharArray();
        int n = s.length;
        long[] dp = new long[n+1];
        for(int i = 0;i < n;i++){
            if(s[i] >= '2' && s[i] <= '9'){
                dp[i+1] = dp[i] * (s[i]-'0');
            }else{
                dp[i+1] = dp[i] + 1;
            }
        }
        K--;
        for(int i = n-1;i >= 0;i--){
            K %= dp[i+1];
            if(K+1 == dp[i+1] && !(s[i] >= '2' && s[i] <= '9')){
                return "" + s[i];
            }
        }
        return null;
    }//厉害啊这个定位方法。。。基础思路是一样的，但是这个定位方法。
//    public static String decodeAtIndex(String S, int K) {
//        K = K--;
//        int countNum = 0;
//        ArrayList<Integer> num1 = new ArrayList<Integer>();
//        ArrayList<Integer> num2 = new ArrayList<Integer>();
//        int charCount = 0;
//        for (int i=0;i<S.length();i++){
//
//            if (S.charAt(i)>='2'&&S.charAt(i)<='9'){
//                countNum++;
//                num1.add(S.charAt(i)-'0');
//                num2.add(charCount);
//                charCount=0;
//            }
//            else {
//                charCount++;
//            }
//        }
//        int[] numArray = num1.stream().mapToInt(i -> i).toArray();
//        int[] charArray = num2.stream().mapToInt(i -> i).toArray();
//        int[] level = new int[numArray.length];
//        int formerLevel = 0;
//        int thisLevel = 0;
//        int mark = 0;
//        for (int i=0;i<numArray.length;i++){
//            thisLevel = (formerLevel+charArray[i])*numArray[i];
//            if (K<=thisLevel) {
//                mark = i;
//                break;
//            }
//            level[i] = formerLevel;
//            formerLevel = thisLevel;
//        }
//        while (K!=0||level[mark]!=0) {
//            K=K%(level[mark]+charArray[mark]);
//            mark--;
//        }
//
//    }

}
