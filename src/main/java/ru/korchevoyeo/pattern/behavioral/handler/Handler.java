package ru.korchevoyeo.pattern.behavioral.handler;

import ru.korchevoyeo.pattern.behavioral.dto.ClientMessageDto;

public abstract class Handler {
    private Handler next;

    public void handle(ClientMessageDto message) {
        if (next != null)
            next.handle(message);
    }

    public Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
