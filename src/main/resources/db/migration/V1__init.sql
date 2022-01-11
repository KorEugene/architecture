-- Все таблицы без внешних ключей для упрощения запросов в задаче
create table clients
(
    id          bigserial primary key,
    full_name   varchar(255),
    phone       varchar(255),
    email       varchar(255)
);

create table smss
(
    id          bigserial primary key,
    full_name   varchar(255),
    phone       varchar(255),
    content     varchar(255)
);

create table emails
(
    id          bigserial primary key,
    full_name   varchar(255),
    email       varchar(255),
    content     varchar(255)
);

insert into clients (full_name, phone, email)
values  ('Petrov Petr', '+79111111111', 'petrov@test.ru'),
        ('Ivanov Ivan', '+79222222222', 'ivanov@test.ru'),
        ('Sidorov Semen', '+79333333333', 'sidorov@test.ru');

insert into smss (full_name, phone, content)
values  ('Petrov Petr', '+79111111111', 'Hi Petr!'),
        ('Ivanov Ivan', '+79222222222', 'Hi Ivan!'),
        ('Sidorov Semen', '+79333333333', 'Hi Semen!');

insert into emails (full_name, email, content)
values  ('Petrov Petr', 'petrov@test.ru', 'Hi Petr!'),
        ('Ivanov Ivan', 'ivanov@test.ru', 'Hi Ivan!'),
        ('Sidorov Semen', 'sidorov@test.ru', 'Hi Semen!');
