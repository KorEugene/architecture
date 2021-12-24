package ru.korchevoyeo.pattern.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.korchevoyeo.pattern.data.jdo.Client;
import ru.korchevoyeo.pattern.data.mapper.ClientMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String FIND_ALL = "SELECT * FROM clients";
    private final static String FIND_BY_ID = "SELECT * FROM clients WHERE id = ?";
    private final static String SAVE = "INSERT INTO clients (full_name, phone, email) VALUES (?, ?, ?)";

    private final Map<Long, Client> clientMap = new HashMap<>();

    @Override
    public List<Client> findAll() {
        return jdbcTemplate.query(FIND_ALL, new ClientMapper());
    }

    @Override
    public Client findById(Long id) {
        Client client = clientMap.get(id);
        if (client == null) {
            client = jdbcTemplate.queryForObject(FIND_BY_ID, new ClientMapper(), id);
            if (client != null) {
                clientMap.put(id, client);
            }
        }
        return client;
    }

    @Override
    public void save(Client client) {
        if (client.getId() != null) {
            clientMap.remove(client.getId());
        }
        jdbcTemplate.update(SAVE, client.getFullName(), client.getPhone(), client.getEmail());
    }
}
