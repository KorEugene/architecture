package ru.korchevoyeo.pattern.behavioral.handler;

import ru.korchevoyeo.pattern.behavioral.dto.ClientMessageDto;

public class EntryHandler extends Handler {
    private ClientMessageDto message;

    @Override
    public void handle(ClientMessageDto message) {
        if (this.message == message) {
            System.out.println("No resolvers for this type of message!");
        } else {
            this.message = message;
        }
        super.handle(message);
    }
}
