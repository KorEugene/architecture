package ru.korchevoyeo.pattern.creational.factory;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.EmailDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;

public class EmailFactory implements MessageFactory {

    private EmailFactory() {
    }

    private static EmailFactory emailFactory;
    private final static Object MONITOR = new Object();

    public static EmailFactory getInstance() {
        if (emailFactory == null) {
            synchronized (MONITOR) {
                if (emailFactory == null) {
                    emailFactory = new EmailFactory();
                }
                return emailFactory;
            }
        } else {
            return emailFactory;
        }
    }

    @Override
    public MessageDto getMessage(ClientMessageDto dto) {
        return new EmailDto(dto.getClient().getFullName(), dto.getClient().getEmail(), dto.getMessage());
    }
}
