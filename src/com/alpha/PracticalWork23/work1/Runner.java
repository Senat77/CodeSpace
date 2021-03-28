package com.alpha.PracticalWork23.work1;

import java.util.Arrays;

public class Runner {

    public void run() {
        Device device = new Device("AAA-111", "Manufacturer1", 100.05);
        System.out.println(device);
        Monitor monitor = new Monitor("MON-222", "Manufacture2", 105, 360, 280);
        System.out.println(monitor);
        Adapter adapter = new Adapter("ADA-333", "Man5", 34, 100, "DD:EE:11");
        System.out.println(adapter);

        Device[] devices = {device, monitor, adapter};

    }
}
