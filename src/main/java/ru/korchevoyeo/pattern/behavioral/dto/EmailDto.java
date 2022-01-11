package ru.korchevoyeo.pattern.behavioral.dto;

import lombok.Getter;
import ru.korchevoyeo.pattern.creational.dto.MessageDto;

@Getter
public class EmailDto extends MessageDto {
    private final String fullName;
    private final String email;
    private final String content;

    public EmailDto(String fullName, String email, String content) {
        this.fullName = fullName;
        this.email = email;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
