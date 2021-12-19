package ru.korchevoyeo.pattern.structural.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailDto implements Message {
    private final String fullName;
    private final String email;
    private final String content;

    @Override
    public String toString() {
        return content;
    }
}
