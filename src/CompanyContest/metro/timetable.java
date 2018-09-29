package metro;

public class timetable {

    String[][] stationA1A7;
    String[][] stationA1A13;
    String[][] stationA7A1;
    String[][] stationA7A13;
    String[][] stationA13A1;
    String[][] stationA13A7;
    String[][] stationB1A7;
    String[][] stationA7B1;
    int[] lineA = {0,3,5,2,3,4,3,4,2,2,3,6,2,0};
    int[] lineB = {0,4,3,3,2,3,0};

    public timetable() {

        int initTimeA1A7 = 355;
        stationA1A7 = new String[104][7];
        for (int i=0;i<stationA1A7.length;i++){
            initTimeA1A7 = initTimeA1A7 + 10*i;
            if (i==stationA1A7.length-1) initTimeA1A7-=5;
            int time = initTimeA1A7;
            for (int j=0;j<7;j++) {
                time += lineA[j];
                stationA1A7[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }

        int initTimeA1A13 = 360;
        stationA1A13 = new String[101][13];
        for (int i=0;i<stationA1A13.length;i++){
            initTimeA1A13 = initTimeA1A13 + 10*i;
            int time = initTimeA1A13;
            for (int j=0;j<13;j++) {
                time += lineA[j];
                stationA1A13[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }

        int initTimeA7A1 = 366;
        stationA7A1 = new String[103][7];
        for (int i=0;i<stationA7A1.length;i++) {
            initTimeA7A1 += 10*i;
            int time = initTimeA7A1-4;
            for (int j=0;j<7;j++) {
                time += lineA[7-j];
                stationA7A1[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }

        stationA7A13 = new String[1][7];
        int timeA7A13 = 370-4;
        for (int j=0;j<7;j++) {
            timeA7A13 += lineA[7+j];
            stationA7A1[0][j] =
                    String.format("%02d",timeA7A13/60) + ":" + String.format("%02d",timeA7A13%60);
        }

        int initTimeA13A1 = 352;
        stationA13A1 = new String[102][13];
        for (int i=0;i<stationA13A1.length;i++) {
            initTimeA13A1 += 10*i;
            int time = initTimeA13A1;
            for (int j=0;j<13;j++) {
                time += lineA[lineA.length-1-j];
                stationA13A1[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }

        stationA13A7 = new String[1][13];
        int timeA13A7 = 1372;
        for (int j=0;j<13;j++) {
            timeA13A7 += lineA[lineA.length-1-j];
            stationA13A1[0][j] =
                    String.format("%02d",timeA13A7/60) + ":" + String.format("%02d",timeA13A7%60);
        }

        int initTimeB1A7 = 360;
        stationB1A7 = new String[171][6];
        for (int i=0;i<stationB1A7.length;i++) {
            initTimeB1A7 += 6*i;
            int time = initTimeB1A7;
            for (int j=0;j<6;j++) {
                time += lineB[j];
                stationB1A7[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }

        int initTimeA7B1 = 371;
        stationA7B1 = new String[171][6];
        for (int i=0;i<stationA7B1.length;i++) {
            initTimeA7B1 += 6*i;
            int time = initTimeA7B1;
            for (int j=0;j<6;j++) {
                time += lineB[lineB.length-1-j];
                stationA7B1[i][j] =
                        String.format("%02d",time/60) + ":" + String.format("%02d",time%60);
            }
        }
    }

}
