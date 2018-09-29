package metro;

public class station {

    String name;
    int[] timeA;
    int[] timeB;

    public station() {
    }

    public station(String name, int[] A, int[] B) {
        this.name = name;
        this.timeA = A;
        this.timeB = B;
    }

    public String getTime(String destination, int departTime) throws Exception {
        if (destination.equals(name)) {
            throw new Exception("You couldn't search the same station");
        }
        char lineChar = destination.charAt(0);
        if (lineChar=='A') {
            int stationNum = Integer.parseInt(destination.substring(1, destination.length()));
            int returnTime = departTime+timeA[stationNum];
            return String.format("%02d",returnTime/60) + ":" + String.format("%02d",returnTime%60);
        }
        else if (lineChar=='B') {
            int stationNum = Integer.parseInt(destination.substring(1, destination.length()));
            int returnTime = departTime+timeB[stationNum];
            return String.format("%02d",returnTime/60) + ":" + String.format("%02d",returnTime%60);
        }
        else {
            throw new Exception("input Destination is wrong");
        }
    }

}
