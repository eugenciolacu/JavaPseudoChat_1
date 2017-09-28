package main.java;


import main.java.model.Intern;
import main.java.service.InternsChatRoom;


public class Main {

    public static void main(String[] args) {
        InternsChatRoom chatRoom = new InternsChatRoom("Eugen", "Vasile", "Dumitru", "Artur");
        chatRoom.addMentorToChatRoom("Mila");

        System.out.println("Print all users (id, user, status)");
        for(Integer i = 0; i < chatRoom.hmapOfInterns.size(); i++){
            System.out.println(chatRoom.hmapOfInterns.get(i));
        }

        System.out.println("\nSimulate chat between two users");
        chatRoom.simulateChat(chatRoom.hmapOfInterns.get(0), chatRoom.hmapOfInterns.get(2));

        System.out.println("\nSimulate chat between mentor and a user");
        chatRoom.simulateChat(chatRoom.hmapOfInterns.get(chatRoom.hmapOfInterns.size() - 1), chatRoom.hmapOfInterns.get(3));
    }
}
