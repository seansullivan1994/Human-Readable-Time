package com.CodeWars.Problems;

public class Main {

    public static void main(String[] args) {
        System.out.println(makeReadable(90));
    }
    public static String makeReadable(int seconds) {
        int hours =0, minutes =0, second =0;
        second = seconds % 60;
        minutes = seconds/60%60;
        hours = (seconds/60/60)-(minutes/60)-(second/120);
        return String.format("%02d:%02d:%02d",hours,minutes,second);
    }
}
