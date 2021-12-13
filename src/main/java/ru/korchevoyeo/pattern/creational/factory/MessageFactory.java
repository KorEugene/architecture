package ru.korchevoyeo.pattern.creational.factory;

import ru.korchevoyeo.pattern.creational.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;

public interface MessageFactory {
    MessageDto getMessage(ClientMessageDto dto);
}
