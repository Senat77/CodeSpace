package com.alpha.PracticalWork25.work3;

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

    }
}
