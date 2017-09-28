package main.java.model;


import main.java.enums.Status;
import java.util.Random;


public class Intern extends Human{

    private Status status;

    public Intern(String user, Integer id) {
        super(user, id);
        setStatusRandomly();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStatusRandomly(){
        Random rnd = new Random();
        int tmp = rnd.nextInt(Status.values().length);
        status = Status.values()[tmp];
    }

    public String toString(){
        return this.getId() + " \t" + this.getUser() + " \t" + this.status;
    }

    public void sayHello(){
        System.out.println("Hello, I am intern " + this.getUser());
    }

    public  void sayGoodBye(){
        System.out.println("Good bye.");
    }
}
