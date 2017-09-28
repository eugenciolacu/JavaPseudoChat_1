package main.java.enums;


public enum Status {
    available(0), //FIXME capslock
    offline(20),
    busy(15),
    away(10);

    private int delay;

    Status(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
};
