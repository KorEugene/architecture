package ru.korchevoyeo.pattern.structural;

import ru.korchevoyeo.pattern.structural.dto.Message;

public interface Sender {
    void sendMessage(Message message);
}
