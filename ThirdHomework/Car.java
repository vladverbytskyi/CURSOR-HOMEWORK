package ThirdHomework;

public class Car {
    boolean start_engine;
    private int workEngine;
    private int speed;
    private int distance;

    public void startEngine(boolean start_engine) {
        if (start_engine = true) {
            System.out.println("Good job, your engine get started");
            while (workEngine < 10) {
                System.out.println("Engine work " + workEngine + " second");
                workEngine++;
                if (workEngine == 10) {
                    getStart();
                }
            }
        } else {
            System.out.println("Don`t worry, next time you can ");
        }
    }

    public void getStart() {
        System.out.println("Okay, lets go");
        while (distance < 20) {
            distance++;
            speed = 100;
            System.out.println("We drove by " + distance + " at speed " + speed + " km/h");

            if (distance == 20) {
                stop();
            }
        }
    }
    public void stop() {
        speed = 0;
        start_engine = false;
        System.out.println("Engine off");
    }
}
