import java.util.*;
//public class Main {
    public class test4{
    public static void main(String[] args) {

        //Scanner cin = new Scanner(System.in);

        //int length = cin.nextInt();
        int length = 480;
        int[] dp = new int[length+1];

        for (int i=0;i<=length;i++){
            int min = Integer.MAX_VALUE;
            int haveDiv = 0;
            if (i==0)
                continue;
            else if (i==1)
                dp[i] = 1;
            else if (i==2)
                dp[i] = 2;
            else if (i==3)
                dp[3] = 3;
            else {
                for (int j = 2;j<=i/2;j++){
                        if (i%j==0) {
                            haveDiv = 1;
                            int times = dp[j] + (i / j );
                            if (i==8)
                                System.out.println(j+" "+times);
                            //System.out.println(times);
                            if (times<min){
                                min = times;
                            }
                        }
                    }
                    //System.out.println(min);
                    if (haveDiv==1) {
                        dp[i] = min;
                        dp[i] = Math.min(dp[i - 1] + 1, dp[i]);
                    }
                    else dp[i] = dp[i-1]+1;
            }
        }
//        System.out.println(dp[60]);
//        System.out.println(dp[120]);
//        System.out.println(dp[240]);
        for (int i=0;i<10;i++){
            //System.out.println(dp[i]);
        }
        System.out.println(dp[480]);
    }
}