package ru.korchevoyeo.pattern.creational.dto;

import ru.korchevoyeo.pattern.creational.enums.MessageType;
import ru.korchevoyeo.pattern.creational.jdo.Client;

public class ClientMessageDto {
    private final Client client;
    private final MessageType type;
    private final String message;

    public ClientMessageDto(Client client, MessageType type, String message) {
        this.client = client;
        this.type = type;
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public MessageType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
