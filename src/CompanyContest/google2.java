import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class google2 {

    static int sum ;

    public static void main(String[] args) throws IOException {

        try {
            Scanner input = new Scanner(new FileReader("src\\task2-test-input.txt"));
            PrintWriter output = new PrintWriter("task2-test-output.txt");
            String timesTemp = input.next();
            int times = Integer.parseInt(timesTemp);
            input.nextLine();
            input.nextLine();

            for (int i=0;i<times;i++){

                String entrance = input.next();
                String target = input.next();
                int count = input.nextInt();
                String[][] funcList = new String[count][];
                for (int j=0;j<count;j++){
                    String className = input.next();
                    int innerCount = input.nextInt();
                    String[] item = new String[innerCount+1];
                    item[0] = className;
                    for (int k=0;k<innerCount;k++){
                        item[k+1] = input.next();
                    }
                    funcList[j] = item;
                }
                sum = 0;
                findTime(funcList, entrance, target);
                output.println("Case #"+(i+1)+": "+sum);
            }
            output.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void findTime(String[][] funcList, String entrance, String target) {

        for (int i=0;i<funcList.length;i++){
            if (funcList[i][0].equals(entrance)){
                for (int j=1;j<funcList[i].length;j++){
                    if (funcList[i][j].equals(target))
                        sum++;
                    else {
                        findTime(funcList, funcList[i][j], target);
                    }
                }
            }
        }

    }





}
