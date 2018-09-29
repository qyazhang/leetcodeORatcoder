import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class test {

    public static class App {
        public static void main(String[] args) {
            String res = "0 0";
            String[] temp = res.split(" ");

            //reader = new BufferedReader(new FileReader(file));

            System.out.println(temp.length);
        }


        public static String compress(String input) {
            int len = input.length();
            StringBuffer res = new StringBuffer();
            StringBuffer dupliItem = new StringBuffer();
            StringBuffer undupliItem = new StringBuffer();
            char nextC = '0';
            char nowC = '0';
            int dupliCount = 0;
            int undupliCount = 0;
            for (int i=0;i<len;i++){
                nowC = input.charAt(i);

                if (i!=len-1) {
                    nextC = input.charAt(i+1);
                    if (nowC==nextC){
                        if (undupliItem.length()!=0){
                            res.append('-');
                            res.append(undupliCount);
                            res.append(undupliItem.toString());
                            undupliItem.setLength(0);
                            undupliCount = 0;
                        }
                        if (dupliItem.length()==0){
                            dupliItem.append(nowC);
                            dupliCount++;
                        }
                        else {
                            dupliCount++;
                        }
                    }
                    else {
                        if (dupliItem.length()!=0){
                            dupliCount++;
                            res.append(dupliCount);
                            res.append(dupliItem.toString());
                            dupliItem.setLength(0);
                            dupliCount = 0;
                        }
                        else {
                            undupliItem.append(nowC);
                            undupliCount++;
                        }

                    }
                }
                else {
                    if (nowC==input.charAt(len-2)){
                        dupliCount++;
                        res.append(dupliCount);
                        res.append(dupliItem.toString());
                    }
                    else {
                        if (dupliItem.length()!=0){
                            res.append(dupliCount);
                            res.append(dupliItem.toString());
                            res.append("-1");
                            res.append(nowC);
                        }
                        else if (undupliItem.length()!=0){
                            undupliItem.append(nowC);
                            undupliCount++;
                            res.append('-');
                            res.append(undupliCount);
                            res.append(undupliItem);
                        }
                    }
                }
            }
            return res.toString();

        }


//        public static String changeString(String input) {
//            int len = input.length();
//            StringBuffer res = new StringBuffer();
//            for (int i=0;i<len;i++){
//                char temp = input.charAt(i);
//                if (temp>='a'&&temp<='z') {
//                    int r = ((temp-'a')+13)%26;
//                    char tempC = (char) ('a'+ r);
//                    res.append(tempC);
//                }
//                else if (temp>='A'&&temp<='Z') {
//                    int r = ((temp-'A')+13)%26;
//                    char tempC = (char) ('A'+ r);
//                    res.append(tempC);
//                }
//                else {
//                    res.append(temp);
//                }
//            }
//            return res.toString();
//        }

    }


}