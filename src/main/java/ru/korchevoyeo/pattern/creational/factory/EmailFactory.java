package ru.korchevoyeo.pattern.creational.factory;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.EmailDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;

public class EmailFactory implements MessageFactory {
    @Override
    public MessageDto getMessage(ClientMessageDto dto) {
        return new EmailDto(dto.getClient().getFullName(), dto.getClient().getEmail(), dto.getMessage());
    }
}
