package ru.korchevoyeo.pattern.mvc.jdo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String fullName;
    private String phone;
    private String email;
}
