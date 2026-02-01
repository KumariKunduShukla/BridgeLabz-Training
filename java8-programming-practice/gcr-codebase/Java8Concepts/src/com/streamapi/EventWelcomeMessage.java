package com.streamapi;
import java.util.*;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Nikita","Vinita","Aashi","Avika");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!"));
    }
}