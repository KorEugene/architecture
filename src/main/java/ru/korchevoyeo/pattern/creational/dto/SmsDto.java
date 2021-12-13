package ru.korchevoyeo.pattern.creational.dto;

public class SmsDto extends MessageDto {
    private final String fullName;
    private final String phone;
    private final String content;

    public SmsDto(String fullName, String phone, String content) {
        this.fullName = fullName;
        this.phone = phone;
        this.content = content;
    }

    @Override
    public String toString() {
        return "SmsDto{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
