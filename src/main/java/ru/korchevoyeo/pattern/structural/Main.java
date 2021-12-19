package ru.korchevoyeo.pattern.structural;

import ru.korchevoyeo.pattern.structural.dto.EmailDto;
import ru.korchevoyeo.pattern.structural.dto.Message;
import ru.korchevoyeo.pattern.structural.dto.SmsDto;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> initial = initData();

        Sender sender = new EmailSender();
        sender = new SmsSender(sender);
        sender.sendMessage(initial.get(0));
        System.out.println();
        sender.sendMessage(initial.get(1));
    }

    private static List<Message> initData() {
        return Arrays.asList(new EmailDto("Ivanov Ivan", "ivan@mail.ru", "This is message for EMAIL"),
                new SmsDto("Petrov Petr", "89222222222", "This is message for SMS"));
    }
}
