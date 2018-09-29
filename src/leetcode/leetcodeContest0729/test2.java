package leetcodeContest0729;

public class test2 {

    public static void main(String[] args) {



    }

    public boolean stoneGame(int[] piles) {

        int len = piles.length;
//        int AlexMark = 0;
//        int LeeMark = 0;
//        int AlexLeft = 0;
//        int LeeLeft = 0;
        int totalAction = 0;
        int left = 0;
        int right = len-1;
        int AlexTotal = 0;
        int LeeTotal = 0;
        while(totalAction<len) {

            if (totalAction%2==0) {
                if (piles[left]>=piles[right]){
                    //AlexMark = left;
                    AlexTotal+=piles[left];
                    left++;
                    //AlexLeft = 1;
                    totalAction++;
                }
                else if (piles[left]<piles[right]) {
                    //AlexMark = right;
                    AlexTotal+=piles[right];
                    right--;
                    //AlexLeft = 0;
                    totalAction++;
                }
            }
            else {
                if (piles[left]>=piles[right]){
                    //AlexMark = left;
                    LeeTotal+=piles[left];
                    left++;
                    //AlexLeft = 1;
                    totalAction++;
                }
                else if (piles[left]<piles[right]) {
                    //AlexMark = right;
                    LeeTotal+=piles[right];
                    right--;
                    //AlexLeft = 0;
                    totalAction++;
                }
            }
        }
        return AlexTotal > LeeTotal;

    }
}
