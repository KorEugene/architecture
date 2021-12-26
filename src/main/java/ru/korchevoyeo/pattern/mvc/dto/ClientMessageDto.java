package ru.korchevoyeo.pattern.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.korchevoyeo.pattern.mvc.enums.MessageType;
import ru.korchevoyeo.pattern.mvc.jdo.Client;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientMessageDto {
    private Client client;
    private MessageType type;
    private String message;
}
