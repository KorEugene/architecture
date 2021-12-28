package ru.korchevoyeo.pattern.behavioral.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.korchevoyeo.pattern.behavioral.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.behavioral.dto.EmailDto;
import ru.korchevoyeo.pattern.behavioral.dto.SmsDto;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Converter {
    public static SmsDto convertClientMessageDtoToSmsDto(ClientMessageDto dto) {
        return new SmsDto(dto.getClient().getFullName(), dto.getClient().getPhone(), dto.getMessage());
    }

    public static EmailDto convertClientMessageDtoToEmailDto(ClientMessageDto dto) {
        return new EmailDto(dto.getClient().getFullName(), dto.getClient().getEmail(), dto.getMessage());
    }
}
