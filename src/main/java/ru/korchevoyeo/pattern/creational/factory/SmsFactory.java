package ru.korchevoyeo.pattern.creational.factory;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;
import ru.korchevoyeo.pattern.creational.dto.SmsDto;

public class SmsFactory implements MessageFactory {

    private SmsFactory() {
    }

    private static SmsFactory smsFactory;
    private final static Object MONITOR = new Object();

    public static SmsFactory getInstance() {
        if (smsFactory == null) {
            synchronized (MONITOR) {
                if (smsFactory == null) {
                    smsFactory = new SmsFactory();
                }
                return smsFactory;
            }
        } else {
            return smsFactory;
        }
    }

    @Override
    public MessageDto getMessage(ClientMessageDto dto) {
        return new SmsDto(dto.getClient().getFullName(), dto.getClient().getPhone(), dto.getMessage());
    }
}
