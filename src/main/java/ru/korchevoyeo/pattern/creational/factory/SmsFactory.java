package ru.korchevoyeo.pattern.creational.factory;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;
import ru.korchevoyeo.pattern.creational.dto.SmsDto;

public class SmsFactory implements MessageFactory {
    @Override
    public MessageDto getMessage(ClientMessageDto dto) {
        return new SmsDto(dto.getClient().getFullName(), dto.getClient().getPhone(), dto.getMessage());
    }
}
