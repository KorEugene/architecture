package ru.korchevoyeo.pattern.data.dao;

import ru.korchevoyeo.pattern.data.jdo.Client;

import java.util.List;

public interface ClientDao {

    List<Client> findAll();

    Client findById(Long id);

    void save(Client client);
}
