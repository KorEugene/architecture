package ru.korchevoyeo.pattern.behavioral;

import ru.korchevoyeo.pattern.behavioral.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.behavioral.enums.MessageType;
import ru.korchevoyeo.pattern.behavioral.handler.EmailResolver;
import ru.korchevoyeo.pattern.behavioral.handler.EntryHandler;
import ru.korchevoyeo.pattern.behavioral.handler.Handler;
import ru.korchevoyeo.pattern.behavioral.handler.SmsResolver;
import ru.korchevoyeo.pattern.behavioral.jdo.Client;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ClientMessageDto> initialData = initData();

        Handler handler = new EntryHandler();

        handler.link(new SmsResolver())
                .link(new EmailResolver())
                .link(handler);

        int counter = 1;
        for (ClientMessageDto message : initialData) {
            System.out.println("Counter=" + counter);
            handler.handle(message);
            counter++;
        }

    }

    private static List<ClientMessageDto> initData() {
        return Arrays.asList(new ClientMessageDto(new Client("Ivanov Ivan", "89111111111", "ivan@mail.ru"), MessageType.SMS, "test sms"),
                new ClientMessageDto(new Client("Petrov Petr", "89222222222", "petr@mail.ru"), MessageType.EMAIL, "test email"),
                new ClientMessageDto(new Client("Sidorov Sidr", "89333333333", "sidr@mail.ru"), MessageType.SMS, "test sms"),
                new ClientMessageDto(new Client("Mikhailov Mikhail", "89444444444", "mikhail@mail.ru"), MessageType.EMAIL, "test email"));
    }

}
