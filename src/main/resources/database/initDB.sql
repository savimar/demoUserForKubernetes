DROP table IF EXISTS users;
DROP table IF EXISTS customer;

create table users (  id serial primary key,
                      first_name varchar(200),
                      last_name varchar(200)
);
 create table customer(id serial primary key,
                       name_ varchar(200), 
                       service_rendered varchar(200), 
                       address_ varchar(200)
);