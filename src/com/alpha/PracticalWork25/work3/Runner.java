package com.alpha.PracticalWork25.work3;

import com.alpha.PracticalWork25.work1.DaysOfWeek;

import java.util.*;

public class Runner {

    public void run() {

        TrainSchedule trainSchedule = new TrainSchedule();
    };

    private Train createTrain() {
        Train train;
        System.out.println("=== Train data entry ===");
        Scanner sn = new Scanner(System.in);
        System.out.println("Number : ");
        train = new Train(sn.nextInt());
        System.out.println("Station dispatch : ");
        train.setStationDispatch(sn.nextLine());
        System.out.println("Station arrival : ");
        train.setStationArrival(sn.nextLine());
        System.out.println("Time dispatch : ");
        train.setTimeDispatch(sn.nextLine());
        System.out.println("Time arrival : ");
        train.setTimeArrival(sn.nextLine());
        System.out.println("Days (separator - 'Space' : ");
        Set<DaysOfWeek> days = new HashSet<>();
        Arrays.stream(sn.nextLine().trim().toUpperCase().split(" ")).forEach(t -> days.add(DaysOfWeek.valueOf(t)));
        train.setDays(days);
        return train;
    }
}
