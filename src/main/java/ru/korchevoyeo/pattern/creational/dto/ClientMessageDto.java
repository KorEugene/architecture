package ru.korchevoyeo.pattern.creational.dto;

import ru.korchevoyeo.pattern.creational.jdo.Client;

public class ClientMessageDto {
    private final Client client;
    private final String message;

    public ClientMessageDto(Client client, String message) {
        this.client = client;
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public String getMessage() {
        return message;
    }
}
