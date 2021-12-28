package ru.korchevoyeo.pattern.data.jdo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sms {
    private Long id;
    private String fullName;
    private String phone;
    private String content;
}
