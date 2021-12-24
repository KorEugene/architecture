package ru.korchevoyeo.pattern.data.dao;

import ru.korchevoyeo.pattern.data.jdo.Sms;

import java.util.List;

public interface SmsDao {

    List<Sms> findAll();

    Sms findById(Long id);

    void save(Sms sms);
}
