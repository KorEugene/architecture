package ru.korchevoyeo.pattern.data.dao;

import ru.korchevoyeo.pattern.data.jdo.Email;

import java.util.List;

public interface EmailDao {

    List<Email> findAll();

    Email findById(Long id);

    void save(Email email);
}
