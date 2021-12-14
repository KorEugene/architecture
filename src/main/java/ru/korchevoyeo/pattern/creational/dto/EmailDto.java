package ru.korchevoyeo.pattern.creational.dto;

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
        return "EmailDto{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
