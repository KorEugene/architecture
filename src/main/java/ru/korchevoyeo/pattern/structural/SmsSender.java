package ru.korchevoyeo.pattern.structural;

import ru.korchevoyeo.pattern.structural.dto.Message;

public class SmsSender extends MessageSender {
    public SmsSender(Sender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);
        System.out.println("Send sms: " + message);
    }
}
