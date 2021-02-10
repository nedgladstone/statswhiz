package com.github.nedgladstone.statswhiz.util;

public class StatsUtils {
    public static int tryParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException e) {
            return 0;
        }
    }

    public static double tryParseDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException | NullPointerException e) {
            return 0.0;
        }
    }
}
