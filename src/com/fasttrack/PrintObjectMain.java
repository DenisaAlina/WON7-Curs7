package com.fasttrack;

public class PrintObjectMain {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHour(18);
        clock.setMinute(19);
        System.out.println(clock);

        Clock clock1 = new Clock();
        clock1.setHour(18);
        clock1.setMinute(19);

        System.out.println(clock.equals(clock1));
    }
}
