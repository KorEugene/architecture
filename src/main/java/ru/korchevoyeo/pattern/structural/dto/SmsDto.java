package ru.korchevoyeo.pattern.structural.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SmsDto implements Message {
    private final String fullName;
    private final String phone;
    private final String content;

    @Override
    public String toString() {
        return content;
    }
}
