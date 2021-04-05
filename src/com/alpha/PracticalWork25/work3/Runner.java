package com.alpha.PracticalWork25.work3;

import com.alpha.PracticalWork25.work1.DaysOfWeek;

import java.io.IOException;
import java.util.*;

public class Runner {

    public void run() throws IOException {

        TrainSchedule trainSchedule = new TrainSchedule();

        while(true) {
            System.out.println("Create train ? (y/n)");
            int b = System.in.read();
            if((char)b == 'n')
                break;
            if((char)b == 'y')
                trainSchedule.addTrain(createTrain());
        }

        trainSchedule.printTrains();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("\nInput arrival station :");
        String arrivalStation = sc.nextLine();
        System.out.println("Input day : ");
        DaysOfWeek day = DaysOfWeek.valueOf(sc.nextLine());
        System.out.println("Trains with criterion :");
        trainSchedule.searchTrains(arrivalStation, day).forEach(System.out::println);
    }

    private Train createTrain() {
        Train train;
        System.out.println("=== Train data entry ===");
        Scanner sn = new Scanner(System.in);
        System.out.println("Number : ");
        train = new Train(sn.nextInt());
        sn.nextLine();
        System.out.println("Station dispatch : ");
        train.setStationDispatch(sn.nextLine());
        System.out.println("Station arrival : ");
        train.setStationArrival(sn.nextLine());
        System.out.println("Time dispatch : ");
        train.setTimeDispatch(sn.nextLine());
        System.out.println("Time arrival : ");
        train.setTimeArrival(sn.nextLine());
        System.out.println("Days (separator - 'Space' : )");
        Set<DaysOfWeek> days = new HashSet<>();
        Arrays.stream(sn.nextLine().trim().toUpperCase().split(" ")).forEach(t -> days.add(DaysOfWeek.valueOf(t)));
        train.setDays(days);
        return train;
    }
}
