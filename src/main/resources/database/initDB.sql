DROP table IF EXISTS users;

create table users (  id serial primary key,
                      first_name varchar(200),
                      last_name varchar(200)
);