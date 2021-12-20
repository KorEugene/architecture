package ru.korchevoyeo.pattern.behavioral.handler;

import ru.korchevoyeo.pattern.behavioral.kafka.KafkaProducer;
import ru.korchevoyeo.pattern.behavioral.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.behavioral.enums.MessageType;
import ru.korchevoyeo.pattern.behavioral.utils.Converter;

public class SmsResolver extends Handler {

    @Override
    public void handle(ClientMessageDto message) {
        if (typeIsMatch(message)) {
            KafkaProducer.produceSms(Converter.convertClientMessageDtoToSmsDto(message));
        } else {
            System.out.println("Type mismatch for SmsResolver!");
            super.handle(message);
        }
    }

    private boolean typeIsMatch(ClientMessageDto message) {
        return message.getType().equals(MessageType.SMS);
    }
}
