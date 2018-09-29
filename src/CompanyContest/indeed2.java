import java.util.ArrayList;

public class indeed2 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int timePass = 7;

        double at = 0.5;
        double tt = 0.0;

        ArrayList<Character> name = new ArrayList<Character>();
        ArrayList<Double> time = new ArrayList<Double>();

        at = at + a;
        tt = tt + b;

        while (name.size()<timePass) {
            if (at<tt){
                name.add('a');
                at += a;
            }
            else if (at>tt){
                name.add('t');
                tt += b;
            }
        }

        char res = name.get(name.size()-1);
        if (res=='a')
            System.out.println("Aoki");
        else System.out.println("Takahashi");

    }

}
