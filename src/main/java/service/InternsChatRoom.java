package main.java.service;

import main.java.enums.Status;
import main.java.model.Human;
import main.java.model.Intern;
import main.java.model.Mentor;

import java.util.HashMap;
import java.util.Map;

public class InternsChatRoom {
    public Map<Integer, Human> hmapOfInterns = new HashMap<>();

    public InternsChatRoom(String... strings) {
        for(Integer i = 0; i < strings.length; i++) {
            hmapOfInterns.put(i, new Intern(strings[i], i));
        }
    }

    public void addMentorToChatRoom(String mentor){
        hmapOfInterns.put(hmapOfInterns.size(), new Mentor(mentor, hmapOfInterns.size()));
    }

    public void simulateChat(Human first, Human second){
        if((first instanceof Intern) && (second instanceof Intern)) {
            ((Intern) first).setStatus(Status.available);

            while (true) {
                if (((Intern) second).getStatus().getDelay() == 0) {
                    ((Intern) first).sayHello();
                    ((Intern) second).sayHello();
                    System.out.println(((Intern) first).getUser() + " had a conversation with " + ((Intern) second).getUser());
                    ((Intern) first).sayGoodBye();
                    ((Intern) second).sayGoodBye();
                    break;
                } else {
                    System.out.println(((Intern) second).getUser() + " had status " + ((Intern) second).getStatus()
                            + ". Wait " + ((Intern) second).getStatus().getDelay() + " seconds before another attempt");
                    ((Intern) second) .setStatusRandomly();
                }
            }
        }

        if((first instanceof Mentor) && (second instanceof Intern)){
            while (true) {
                if (((Intern) second).getStatus().getDelay() == 0) {
                    ((Mentor) first).sayHello();
                    ((Intern) second).sayHello();
                    System.out.println(((Mentor) first).getUser() + " had a conversation with " + ((Intern) second).getUser());
                    ((Mentor) first).sayGoodBye();
                    ((Intern) second).sayGoodBye();
                    break;
                } else {
                    System.out.println(((Intern) second).getUser() + " had status " + ((Intern) second).getStatus()
                            + ". Wait " + ((Intern) second).getStatus().getDelay() + " seconds before another attempt");
                    ((Intern) second) .setStatusRandomly();
                }
            }
        }
    }
}
