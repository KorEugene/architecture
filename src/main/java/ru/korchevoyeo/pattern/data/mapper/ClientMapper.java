package ru.korchevoyeo.pattern.data.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.korchevoyeo.pattern.data.jdo.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client> {

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client client = new Client();

        client.setId(rs.getLong("id"));
        client.setFullName(rs.getString("full_name"));
        client.setPhone(rs.getString("phone"));
        client.setEmail(rs.getString("email"));

        return client;
    }
}
