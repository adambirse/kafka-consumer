package com.birse.consumer;

import java.util.ArrayList;
import java.util.List;

public class MessageStore {

    private static List<String> messages = new ArrayList<>();


    public static void addMessage(String message) {
        messages.add(message);
    }

    public static List<String> getMessages() {
    return messages;
    }
}
