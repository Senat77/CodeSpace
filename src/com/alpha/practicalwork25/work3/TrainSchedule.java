package com.alpha.practicalwork25.work3;

import com.alpha.practicalwork25.work1.DaysOfWeek;

import java.util.ArrayList;
import java.util.List;

public class TrainSchedule {

    private final List<Train> trains = new ArrayList<>();

    public boolean addTrain(Train train) {
        if(trains.stream().anyMatch(t -> t.getNumber() == train.getNumber())) return false;
        trains.add(train);
        return true;
    }

    public void printTrains() {
        trains.forEach(System.out::println);
    }

    public List<Train> searchTrains(String stationArrival, DaysOfWeek day) {
        List<Train> result = new ArrayList<>();
        trains.forEach((t) -> {if (t.getStationArrival().equals(stationArrival) && t.getDays().contains(day)) result.add(t);});
        return result;
    }
}
