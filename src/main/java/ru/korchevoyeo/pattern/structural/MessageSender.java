package ru.korchevoyeo.pattern.structural;

import lombok.RequiredArgsConstructor;
import ru.korchevoyeo.pattern.structural.dto.Message;

@RequiredArgsConstructor
public abstract class MessageSender implements Sender {
    private final Sender sender;

    @Override
    public void sendMessage(Message message) {
        sender.sendMessage(message);
    }
}
