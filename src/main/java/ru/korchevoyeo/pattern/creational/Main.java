package ru.korchevoyeo.pattern.creational;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;
import ru.korchevoyeo.pattern.creational.enums.MessageType;
import ru.korchevoyeo.pattern.creational.factory.EmailFactory;
import ru.korchevoyeo.pattern.creational.factory.MessageFactory;
import ru.korchevoyeo.pattern.creational.factory.SmsFactory;
import ru.korchevoyeo.pattern.creational.jdo.Client;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClientMessageDto> initialData = initData();

        System.out.println("Create SMS DTO: ");
        System.out.println(createMessage(createFactory(initialData.get(0).getType()), initialData.get(0)));

        System.out.println("Create EMAIL DTO: ");
        System.out.println(createMessage(createFactory(initialData.get(1).getType()), initialData.get(1)));

    }

    private static MessageFactory createFactory(MessageType type) {
        switch (type) {
            case SMS:
                return SmsFactory.getInstance();
            case EMAIL:
                return EmailFactory.getInstance();
            default:
                throw new IllegalArgumentException("Unsupported message type");
        }
    }

    private static MessageDto createMessage(MessageFactory factory, ClientMessageDto initialData) {
        return factory.getMessage(initialData);
    }

    private static List<ClientMessageDto> initData() {
        return Arrays.asList(new ClientMessageDto(new Client("Ivanov Ivan", "89111111111", "ivan@mail.ru"), MessageType.SMS, "test sms"),
                new ClientMessageDto(new Client("Petrov Petr", "89222222222", "petr@mail.ru"), MessageType.EMAIL, "test email"));
    }
}
