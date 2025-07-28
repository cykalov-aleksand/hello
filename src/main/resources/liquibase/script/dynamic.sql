-- liquibase formatted sql

-- changeset acycalov:1
CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    username TEXT NOT NULL,
    password TEXT NOT NULL,
    enabled INT NOT NULL);

   -- changeset acycalov:2
   CREATE TABLE authorities(
          id BIGSERIAL PRIMARY KEY,
          username TEXT,
          authority TEXT);





