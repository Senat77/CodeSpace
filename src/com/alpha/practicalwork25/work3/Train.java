package com.alpha.practicalwork25.work3;

import com.alpha.practicalwork25.work1.DaysOfWeek;

import java.util.Set;

public class Train {

    private final int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    private Set<DaysOfWeek> days;

    public Train(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getStationDispatch() {
        return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public Set<DaysOfWeek> getDays() {
        return days;
    }

    public void setDays(Set<DaysOfWeek> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Train:" +
                "\tnumber=" + number +
                ", \tstationDispatch='" + stationDispatch + '\'' +
                ", \tstationArrival='" + stationArrival + '\'' +
                ", \ttimeDispatch='" + timeDispatch + '\'' +
                ", \ttimeArrival='" + timeArrival + '\'' +
                ", \tdays=" + days.toString();
    }
}
