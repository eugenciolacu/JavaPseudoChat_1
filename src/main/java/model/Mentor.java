package main.java.model;


import main.java.enums.Status;

public class Mentor extends Human {

    public Mentor (String user, Integer id){
        super(user, id);
    }

    public void setStatus(Status status) {
        // Nothing here
    }

    public String toString(){
        return this.getId() + " \t" + this.getUser() + " \t" + "always available";
    }

    public void sayHello(){
        System.out.println("Hello, I am " + this.getUser());
    }

    public  void sayGoodBye(){
        System.out.println("Good bye.");
    }
}
