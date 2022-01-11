package ru.korchevoyeo.pattern.data.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.korchevoyeo.pattern.data.jdo.Sms;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SmsMapper implements RowMapper<Sms> {

    @Override
    public Sms mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sms sms = new Sms();

        sms.setId(rs.getLong("id"));
        sms.setFullName(rs.getString("full_name"));
        sms.setPhone(rs.getString("phone"));
        sms.setContent(rs.getString("content"));

        return sms;
    }
}
