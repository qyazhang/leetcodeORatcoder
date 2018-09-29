package leetcodeContest0812;

public class test3 {

    public static void main(String[] args) {

        //decodeAtIndex("a2b3c3", 5);
        System.out.println(superEggDrop(2,9));
    }

    public static int superEggDrop(int K, int N) {
        if (N==1) return 1;
        if (K==1) return N;
        if (N==3||N==2) return 2;
        N = N+1;
        int count = 0;

        for (int i=0;i<K-1;i++) {
            if (N<=4) break;
            N = N/2;
            count++;
        }
        if (N<=3)
            return count+2;
        else
            return count+N-1;
    }

}
