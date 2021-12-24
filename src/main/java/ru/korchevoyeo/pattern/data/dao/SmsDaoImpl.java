package ru.korchevoyeo.pattern.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.korchevoyeo.pattern.data.jdo.Sms;
import ru.korchevoyeo.pattern.data.mapper.SmsMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SmsDaoImpl implements SmsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String FIND_ALL = "SELECT * FROM smss";
    private final static String FIND_BY_ID = "SELECT * FROM smss WHERE id = ?";
    private final static String SAVE = "INSERT INTO smss (full_name, phone, content) VALUES (?, ?, ?)";

    private final Map<Long, Sms> smsMap = new HashMap<>();

    @Override
    public List<Sms> findAll() {
        return jdbcTemplate.query(FIND_ALL, new SmsMapper());
    }

    @Override
    public Sms findById(Long id) {
        Sms sms = smsMap.get(id);
        if (sms == null) {
            sms = jdbcTemplate.queryForObject(FIND_BY_ID, new SmsMapper(), id);
            if (sms != null) {
                smsMap.put(id, sms);
            }
        }
        return sms;
    }

    @Override
    public void save(Sms sms) {
        if (sms.getId() != null) {
            smsMap.remove(sms.getId());
        }
        jdbcTemplate.update(SAVE, sms.getFullName(), sms.getPhone(), sms.getContent());
    }
}
