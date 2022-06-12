package com.fasttrack;

import java.io.Serializable;
import java.util.Objects;

public class Clock {
   private int hour;
    private int minute;

    public void setHour(int hour){
       this.hour=hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    int getHour(){
        return hour;
    }

    String getTime(){
        Serializable serializable = minute<10?"0"+minute:minute;
        return hour + ":"+serializable;
    }

    public String toString(){
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() !=o.getClass()) return false;
        Clock clock = (Clock) o;
        return hour == clock.hour && minute == clock.minute;
    }

    public int hashCode(){
        return Objects.hash(hour, minute);
    }
}
