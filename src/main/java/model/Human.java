package main.java.model;


import main.java.enums.Status;
import main.java.humanBehavior.Behavior;

public abstract class Human implements Behavior{

    private String user;
    private Integer id;

    public Human(String user, Integer id) {
        this.user = user;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public abstract void setStatus(Status status);

    public abstract void sayHello();
    public abstract void sayGoodBye();
}

