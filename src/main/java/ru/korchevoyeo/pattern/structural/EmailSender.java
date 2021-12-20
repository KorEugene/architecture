package ru.korchevoyeo.pattern.structural;

import ru.korchevoyeo.pattern.structural.dto.Message;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(Message message) {
        System.out.println("Send email: " + message);
    }
}
