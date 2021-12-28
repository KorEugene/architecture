package ru.korchevoyeo.pattern.data.jdo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Email {
    private Long id;
    private String fullName;
    private String email;
    private String content;
}
