package ru.korchevoyeo.pattern.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.korchevoyeo.pattern.mvc.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.mvc.jdo.Client;
import ru.korchevoyeo.pattern.mvc.service.UiService;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UiController {
    private final UiService uiService;

    @GetMapping
    public List<Client> getClientList() {
        return uiService.getClients();
    }

    @PostMapping
    public void sendMessage(@RequestBody List<ClientMessageDto> messages) {
        uiService.sendMessages(messages);
    }
}
