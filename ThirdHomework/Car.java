package ThirdHomework;

public class Car {
    private boolean engineWork;
    private int workEngine;
    private int speed;
    private int distance;

    public void startEngine() {
        engineWork = true;
        if (engineWork) {
            System.out.println("Good job, your engine get started");
            while (workEngine < 10) {
                System.out.println("Engine work " + workEngine + " second");
                workEngine++;
            }
        } else {
            System.out.println("Don`t worry, next time you can ");
        }
    }
    public void startCar() {
        System.out.println("Okay, lets go");
        while (distance < 20) {
            distance++;
            speed = 100;
            System.out.println("We drove by " + distance + " at speed " + speed + " km/h");
        }
    }
    public void stopCar() {
        speed = 0;
        System.out.println("Engine off");
    }
    public void stopEngine() {
        this.engineWork = false;
        System.out.println("fdgjfbgjfm");

    }
}