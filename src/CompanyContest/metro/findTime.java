package metro;

public class findTime {

    public static void main(String[] args) throws Exception {

        String start = "A1";
        String end = "A3";
        String time = "08:26";

        int timeAtStation = Integer.parseInt(time.substring(0,2))*60+Integer.parseInt(time.substring(3,5));
        stationList list = new stationList();
        timetable timetable = new timetable();

        String line1 = start.substring(0,1);
        int s1 = Integer.parseInt(start.substring(1, start.length()));
        String line2 = end.substring(0,1);
        int s2 = Integer.parseInt(end.substring(1, end.length()));
        String type = line1 + line2;

        //System.out.println(timetable.stationA1A7.length);

        switch (type) {
            case "AA" :{
                if (s1<s2&&s2<=7) {
                    int i = 0;
                    while (i<timetable.stationA1A7.length){
                        String timeS = timetable.stationA1A7[i][s1-1];
                        int arriveTime =
                                Integer.parseInt(timeS.substring(0,2))*60+Integer.parseInt(timeS.substring(3,5));
                        if (arriveTime>timeAtStation) {
                            //System.out
                            String endTime = list.findStation(start).getTime(end, arriveTime);
                            System.out.println("A "+start+" "+timeS+" - "+end+" "+endTime);
                            return;
                        }
                        else if (arriveTime<timeAtStation) {
                            i++;
                        }
                    }
                }
            }
        }


    }

}
