package ru.korchevoyeo.pattern.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.korchevoyeo.pattern.data.jdo.Email;
import ru.korchevoyeo.pattern.data.mapper.EmailMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmailDaoImpl implements EmailDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String FIND_ALL = "SELECT * FROM emails";
    private final static String FIND_BY_ID = "SELECT * FROM emails WHERE id = ?";
    private final static String SAVE = "INSERT INTO emails (full_name, email, content) VALUES (?, ?, ?)";

    private final Map<Long, Email> emailMap = new HashMap<>();

    @Override
    public List<Email> findAll() {
        return jdbcTemplate.query(FIND_ALL, new EmailMapper());
    }

    @Override
    public Email findById(Long id) {
        Email email = emailMap.get(id);
        if (email == null) {
            email = jdbcTemplate.queryForObject(FIND_BY_ID, new EmailMapper(), id);
            if (email != null) {
                emailMap.put(id, email);
            }
        }
        return email;
    }

    @Override
    public void save(Email email) {
        if (email.getId() != null) {
            emailMap.remove(email.getId());
        }
        jdbcTemplate.update(SAVE, email.getFullName(), email.getEmail(), email.getContent());
    }
}
