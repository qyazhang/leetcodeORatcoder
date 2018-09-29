import java.util.Scanner;
import java.util.Stack;

public class indeed4 {

    public static void main(String[] args) {

        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            long count = 0;
            String s = cin.nextLine();
            int[] weight = new int[s.length()];
            int[] hasCal = new int[s.length()];
            int left = 0;
            int minw = weight[0];
            for (int i=0;i<weight.length;i++){
                if (s.charAt(i)=='('&&hasCal[i]==0) left++;
                else if (s.charAt(i)==')'&&hasCal[i]==0) left--;
                if (left<0){
                    count+=minw;
                    left = 0;
                    hasCal[i] = 1;
                }
                minw = Math.min(minw, weight[i+1]);
            }
            for (int i=weight.length-1;i>=0;i--){
                if (s.charAt(i)=='('&&hasCal[i]==0) left--;
                else if (s.charAt(i)==')'&&hasCal[i]==0) left++;
                if (left<0){
                    count+=minw;
                    left = 0;
                    hasCal[i] = 1;
                }
                minw = Math.min(minw, weight[i+1]);
            }
            System.out.println(count);
        }

    }

}
