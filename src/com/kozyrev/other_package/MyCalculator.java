package com.kozyrev.other_package;

/**
 * Created by sergii on 7/3/17.
 */
public class MyCalculator {
    int height;
    int color;
    int width;

    public int addFive(int number) {
        if (number == 0) {
            return 0;
        } else {
            return 5 + number;
        }
    }
}
