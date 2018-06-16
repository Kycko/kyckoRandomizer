package com.github.kycko.kyckorandomizer;

import java.util.Random;

final class cubeVariations {
    private byte[][][] data;

    cubeVariations (String cubeSize) {
        switch (cubeSize) {
            case "7":
                data = new byte[][][]{
                        {{1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {0, 1, 2, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 0, 1, 1}}, // 1
                        {{0, 1, 0, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 2, 1, 0}, {1, 1, 1, 1, 1}, {0, 1, 0, 1, 0}}, // 2
                        {{0, 1, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 1, 2, 1, 0}, {1, 1, 1, 1, 0}, {0, 0, 0, 1, 0}}, // 3
                        {{0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}}, // 4
                        {{0, 1, 1, 0, 0}, {0, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 0}, {0, 0, 1, 1, 0}}, // 5
                        {{1, 1, 0, 0, 1}, {0, 1, 1, 1, 1}, {0, 1, 2, 1, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 1, 1}}, // 6
                        {{1, 0, 0, 0, 1}, {0, 1, 1, 1, 0}, {0, 1, 2, 1, 0}, {0, 1, 1, 1, 0}, {1, 0, 0, 0, 1}}, // 7
                        {{1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}, {1, 1, 2, 1, 1}, {0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}}, // 8
                        {{1, 1, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 0}, {1, 0, 1, 1, 1}}, // 9
                        {{0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 2, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}}, // 10
                        {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 2, 1, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}, // 11
                        {{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {1, 1, 2, 1, 1}, {0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}}, // 12
                        {{1, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 2, 1, 0}, {0, 0, 1, 0, 0}, {1, 0, 0, 0, 1}}, // 13
                        {{1, 0, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 2, 1, 1}, {0, 0, 1, 0, 0}, {1, 0, 1, 0, 1}}, // 14
                        {{1, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 0, 2, 0, 0}, {0, 1, 0, 1, 0}, {1, 0, 0, 0, 1}}, // 15
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 2, 2, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}, // 16
                        {{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {2, 2, 2, 0, 0}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}, // 17
                        {{0, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {1, 1, 2, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0, 0}}, // 18
                        {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {1, 1, 2, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}, // 19
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 2, 2, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 0}}, // 20
                        {{0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {1, 2, 2, 2, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}, // 21
                        {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 2, 2, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}}, // 22
                        {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 2, 1, 0}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}}, // 23
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 2, 0}, {1, 1, 2, 0, 0}, {0, 2, 1, 0, 0}, {0, 0, 1, 0, 0}}, // 24
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 2, 0, 0}, {1, 1, 1, 0, 0}, {2, 1, 1, 0, 0}}, // 25
                        {{0, 0, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 0}, {0, 0, 1, 1, 0}, {0, 0, 1, 1, 0}}, // 26
                        {{0, 0, 0, 0, 0}, {1, 0, 0, 2, 0}, {1, 1, 0, 0, 0}, {1, 2, 1, 0, 0}, {1, 1, 1, 1, 0}}, // 27
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 0, 2, 0, 0}, {1, 2, 0, 0, 0}, {2, 1, 1, 0, 0}}, // 28
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 2, 0}, {0, 0, 2, 0, 0}, {1, 2, 0, 0, 0}, {2, 1, 0, 0, 0}}, // 29
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}}, // 30
                        {{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 1, 0}}, // 31
                        {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}}, // 32
                        {{1, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {0, 1, 2, 1, 0}, {0, 0, 1, 1, 1}, {0, 0, 0, 1, 1}}, // 33
                        {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}, // 34
                        {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 1, 2, 1, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}}, // 35
                        {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 1, 1}}, // 36
                        {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 1}, {0, 0, 0, 2, 1}, {0, 0, 1, 1, 1}}, // 37
                        {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 1}, {0, 0, 1, 0, 1}, {0, 0, 0, 2, 1}, {0, 1, 1, 1, 1}}, // 38
                        {{0, 0, 0, 0, 0}, {1, 0, 0, 2, 0}, {1, 0, 2, 0, 0}, {1, 2, 0, 0, 0}, {2, 1, 1, 1, 0}}, // 39
                        {{0, 0, 0, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 2, 0, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}}, // 40
                        {{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 0, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}}, // 41
                        {{0, 0, 0, 1, 0}, {0, 0, 0, 1, 1}, {0, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}}, // 42
                        {{0, 0, 1, 1, 1}, {0, 0, 0, 0, 1}, {1, 0, 2, 0, 1}, {1, 0, 0, 0, 0}, {1, 1, 1, 0, 0}}, // 43
                        {{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {1, 0, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 1, 0, 0}}, // 44
                        {{0, 0, 0, 1, 0}, {0, 1, 0, 1, 1}, {0, 1, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}}, // 45
                        {{1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 2, 0, 0}, {1, 2, 0, 0, 0}, {2, 1, 1, 1, 1}}, // 46
                        {{1, 1, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 2, 0, 0}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}}, // 47
                        {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 1}, {0, 0, 1, 1, 1}, {0, 0, 1, 1, 1}, {0, 1, 1, 1, 1}}, // 48
                        {{0, 0, 0, 0, 0}, {0, 1, 0, 0, 1}, {0, 0, 1, 1, 1}, {0, 0, 1, 0, 1}, {0, 1, 1, 1, 1}}, // 49
                        {{0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}, {0, 0, 2, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}}, // 50
                        {{1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 2, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 1, 1}}, // 51
                        {{0, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}}, // 52
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 2, 0}, {0, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}}, // 53
                        {{0, 0, 0, 1, 0}, {0, 0, 0, 1, 1}, {0, 0, 2, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 0, 0, 0}}, // 54
                        {{0, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 2, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 1, 1, 0}}, // 55
                        {{0, 0, 0, 0, 2}, {1, 0, 1, 0, 0}, {1, 0, 1, 1, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}}, // 56
                        {{0, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 2, 0, 0}, {1, 1, 1, 1, 0}, {1, 1, 1, 1, 0}}, // 57
                        {{0, 0, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 2, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 0}}, // 58
                        {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {1, 1, 1, 0, 0}, {2, 1, 0, 0, 0}}, // 59
                };
//            case 6:
//                data = new byte[][][]{
//
//                };
        }
    }
    private int cubeDisplayed = -1;

    // funcs
    int getLength() {return data.length;}

    String getNew(Random rnd) {
        int curChoice;
        do curChoice = rnd.nextInt(getLength());
        while (curChoice == cubeDisplayed);
        cubeDisplayed = curChoice;
        return transform(data[curChoice]);

        // DEBUG (show list of cubes) {+transform()}
//        cubeDisplayed++;
//        if (cubeDisplayed == getLength()) cubeDisplayed = 0;
//        return transform(data[cubeDisplayed]);
    }

    private String transform(byte[][] data) {
        int index;
        final String CHARS = "□■☻"; // 0: white, 1: black, 2: debug
        String result = "  ";

        for (byte[] aData : data) {
            for (byte anAData : aData) {
                if (anAData == 2) index = new Random().nextInt(2);  // DEBUG-
                else index = anAData;                                       // DEBUG-
//                index = anAData;                                            // DEBUG+

                result += CHARS.charAt(index) + "  ";
            }
            result += "\n  ";
        }
        return result;
    }
}
