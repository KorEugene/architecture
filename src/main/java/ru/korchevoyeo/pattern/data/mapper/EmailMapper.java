package ru.korchevoyeo.pattern.data.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.korchevoyeo.pattern.data.jdo.Email;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmailMapper implements RowMapper<Email> {

    @Override
    public Email mapRow(ResultSet rs, int rowNum) throws SQLException {
        Email email = new Email();

        email.setId(rs.getLong("id"));
        email.setFullName(rs.getString("full_name"));
        email.setEmail(rs.getString("email"));
        email.setContent(rs.getString("content"));

        return email;
    }
}
