package metro;

public class stationList {

    station A1;
    station A2;
    station A3;
    station A4;
    station A5;
    station A6;
    station A7;
    station A8;
    station A9;
    station A10;
    station A11;
    station A12;
    station A13;
    station B1;
    station B2;
    station B3;
    station B4;
    station B5;
    station[] stationL;

    public stationList() {

        stationL = new station[]{
                A1 = new station("A1",
                        new int[]{0, 3, 8, 10, 13, 17, 20, 24, 26, 28, 31, 37, 39},
                        new int[]{36, 32, 29, 26, 24}),
                A2 = new station("A2",
                        new int[]{3, 0, 5, 7, 10, 14, 17, 21, 23, 25, 28, 34, 36},
                        new int[]{33, 29, 26, 23, 21}),
                A3 = new station("A3",
                        new int[]{8, 5, 0, 2, 5, 9, 12, 16, 18, 20, 23, 29, 31},
                        new int[]{28, 24, 21, 18, 16}),
                A4 = new station("A4",
                        new int[]{10, 7, 2, 0, 3, 7, 10, 14, 16, 18, 21, 27, 29},
                        new int[]{26, 22, 19, 16, 14}),
                A5 = new station("A5",
                        new int[]{13, 10, 5, 3, 0, 4, 7, 11, 13, 15, 18, 24, 26},
                        new int[]{23, 19, 16, 13, 11}),
                A6 = new station("A6",
                        new int[]{17, 14, 9, 7, 4, 0, 3, 7, 9, 11, 14, 20, 22},
                        new int[]{19, 15, 12, 9, 7}),
                A7 = new station("A7",
                        new int[]{20, 17, 12, 10, 7, 3, 0, 4, 6, 8, 11, 17, 19},
                        new int[]{16, 12, 9, 6, 4}),
                A8 = new station("A8",
                        new int[]{24, 21, 16, 14, 11, 7, 4, 0, 2, 4, 7, 13, 15},
                        new int[]{20, 16, 13, 10, 8}),
                A9 = new station("A9",
                        new int[]{26, 23, 18, 16, 13, 9, 6, 2, 0, 2, 5, 11, 13},
                        new int[]{22, 18, 15, 12, 10}),
                A10 = new station("A10",
                        new int[]{28, 25, 20, 18, 15, 11, 8, 4, 2, 0, 3, 9, 11},
                        new int[]{24, 20, 17, 14, 12}),
                A11 = new station("A11",
                        new int[]{31, 28, 23, 21, 18, 14, 11, 7, 5, 3, 0, 6, 8},
                        new int[]{27, 23, 20, 17, 15}),
                A12 = new station("A12",
                        new int[]{37, 34, 29, 27, 24, 20, 17, 13, 11, 9, 6, 0, 2},
                        new int[]{33, 29, 26, 23, 21}),
                A13 = new station("A13",
                        new int[]{39, 36, 31, 29, 26, 22, 19, 15, 13, 11, 8, 2, 0},
                        new int[]{35, 31, 28, 25, 23}),
                B5 = new station("B5",
                        new int[]{24, 21, 16, 14, 11, 7, 4, 8, 10, 12, 15, 21, 23},
                        new int[]{12, 8, 5, 2, 0}),
                B4 = new station("B4",
                        new int[]{26, 23, 18, 16, 13, 9, 6, 10, 12, 14, 17, 23, 25},
                        new int[]{10, 6, 3, 0, 2}),
                B3 = new station("B3",
                        new int[]{29, 26, 21, 19, 16, 12, 9, 13, 15, 17, 21, 26, 28},
                        new int[]{7, 3, 0, 3, 5}),
                B2 = new station("B2",
                        new int[]{32, 29, 24, 22, 19, 15, 12, 16, 18, 21, 24, 29, 31},
                        new int[]{4, 0, 3, 6, 8}),
                B1 = new station("B1",
                        new int[]{36, 33, 28, 26, 23, 19, 16, 20, 22, 25, 28, 33, 35},
                        new int[]{0, 4, 7, 10, 12})
        };

    }

    public station findStation (String stationName) throws Exception {
        for (int i=0;i<stationL.length;i++) {
            if (stationL[i].name.equals(stationName))
                return stationL[i];
        }
        throw new Exception("no such station");
    }

}
