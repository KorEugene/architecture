package ru.korchevoyeo.pattern.creational;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;
import ru.korchevoyeo.pattern.creational.enums.MessageType;
import ru.korchevoyeo.pattern.creational.factory.EmailFactory;
import ru.korchevoyeo.pattern.creational.factory.MessageFactory;
import ru.korchevoyeo.pattern.creational.factory.SmsFactory;
import ru.korchevoyeo.pattern.creational.jdo.Client;

public class Main {
    public static void main(String[] args) {
        ClientMessageDto initialData = initData();

        System.out.println("Create SMS DTO: ");
        System.out.println(createMessage(createFactory(MessageType.SMS), initialData));

        System.out.println("Create EMAIL DTO: ");
        System.out.println(createMessage(createFactory(MessageType.EMAIL), initialData));

    }

    private static MessageFactory createFactory(MessageType type) {
        switch (type) {
            case SMS:
                return new SmsFactory();
            case EMAIL:
                return new EmailFactory();
            default:
                throw new IllegalArgumentException("Unsupported message type");
        }
    }

    private static MessageDto createMessage(MessageFactory factory, ClientMessageDto initialData) {
        return factory.getMessage(initialData);
    }

    private static ClientMessageDto initData() {
        return new ClientMessageDto(new Client("Ivanov Ivan", "89111111111", "ivan@mail.ru"), "testMessage");
    }
}
