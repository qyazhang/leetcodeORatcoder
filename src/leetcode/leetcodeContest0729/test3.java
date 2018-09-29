package leetcodeContest0729;

public class test3 {

    public static void main(String[] args) {

        System.out.println(nthMagicalNumber(859,759,30));

    }

    static public int nthMagicalNumber(int N, int A, int B) {
        long a = A, b = B, tmp, l = 2, r = (long)Math.pow(10, 14);
        while (b > 0) {
            tmp = a;
            a = b;
            b = tmp % b;
        } //求最大公约数
        while (l < r) {
            long m = (l + r) / 2;
            if (m / A + m / B - m / (A * B / a) < N) l = m + 1;
            else r = m;
        }//二分搜索，其中magic number个数等于 x/A+x/B-x/lcm（最小公倍数）
        return (int)(l % (long)(Math.pow(10, 9) + 7));
    }
//   static public int nthMagicalNumber(int N, int A, int B) {
//        int count = 2;
//        int oneGroup = 0;
//        int sumA = A;
//        int sumB = B;
//        while (true) {
//            if (sumA<sumB) {
//                sumA += A;
//                count++;
//            }
//            else if (sumA>sumB) {
//                sumB+=B;
//                count++;
//            }
//            else {
//                count--;
//                oneGroup = sumA;
//                break;
//            }
//        }
//        System.out.println("oneGroup "+oneGroup);
//        System.out.println("count "+count);
//
//        if (N<count) {
//            int nowValue = 0;
//            count = 0;
//            sumA = 0;
//            sumB = 0;
//            while (count<N) {
//                if (sumA==sumB){
//                    if (A<B){
//                        sumA += A;
//                        nowValue = sumA;
//                        count++;
//                    }
//                    else {
//                        sumB+=B;
//                        nowValue = sumB;
//                        count++;
//                    }
//                }
//                else if (sumA<sumB) {
//                    if (sumA==0&&sumB+B<A){
//                        sumB+=B;
//                        nowValue = sumB;
//                        count++;
//                    }
//                    else {
//                        sumA += A;
//                        nowValue = sumA;
//                        count++;
//                    }
//
//                }
//                else if (sumA>sumB){
//                    if (sumB==0&&sumA+A<B){
//                        sumA += A;
//                        nowValue = sumA;
//                        count++;
//                    }
//                    else {
//                        sumB+=B;
//                        nowValue = sumB;
//                        count++;
//                    }
//                }
//
//            }
//            return nowValue;
//        }
//        else if (N>count) {
//            long times = N/count;
//            long remains = N%count;
//            long nowValue = times*oneGroup%((long)Math.pow(10,9)+7);
//            System.out.println("nowValue "+nowValue);
//            System.out.println("remains "+remains);
//            count = 0;
//            sumA = 0;
//            sumB = 0;
//            int nowValue2 = 0;
//            while (count<remains) {
//                if (sumA==sumB) {
//                    if (A<B){
//                        sumA += A;
//                        nowValue2 = sumA;
//                        count++;
//                    }
//                    else {
//                        sumB+=B;
//                        nowValue2 = sumB;
//                        count++;
//                    }
//                }
//                else if (sumA<sumB+B) {
//                        sumA += A;
//                        nowValue2 = sumA;
//                    count++;
//                }
//                else if (sumA>sumB+B){
//                        sumB+=B;
//                        nowValue2 = sumB;
//                        count++;
//                }
//
//                System.out.println(nowValue2);
//            }
//            System.out.println(nowValue2);
//            long res = (int)(nowValue+nowValue2)%((long)Math.pow(10,9)+7);
//            return (int)res;
//        }
//        else {
//            return oneGroup;
//        }
//
//    }



}
