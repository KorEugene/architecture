package ru.korchevoyeo.pattern.mvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korchevoyeo.pattern.mvc.dto.ClientMessageDto;
import ru.korchevoyeo.pattern.mvc.jdo.Client;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UiService {

    private List<Client> clients;

    @PostConstruct
    private void init() {
        Client client1 = new Client("Petrov Petr", "+79111111111", "petrov@test.ru");
        Client client2 = new Client("Ivanov Ivan", "+79222222222", "ivanov@test.ru");
        Client client3 = new Client("Sidorov Semen", "+79333333333", "sidorov@test.ru");
        clients = Arrays.asList(client1, client2, client3);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void sendMessages(List<ClientMessageDto> messages) {
        System.out.println("Messages sent!: ");
        for (ClientMessageDto message : messages) {
            System.out.println(message);
        }
    }
}
