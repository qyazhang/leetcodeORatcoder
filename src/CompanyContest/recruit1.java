import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class recruit1 {

    public static void main(){
        int count = 0;
        for (int i=1;i<143;i++){
            if (i/2==0) continue;
            if (i/3==0) continue;
            if (i/5==0) continue;
            count++;
        }
        System.out.println(count);
    }

}
