CREATE TABLE customer
(
    id         BIGSERIAL PRIMARY KEY,
    first_name VARCHAR,
    last_name  VARCHAR,
    coffee_id  BIGSERIAL,
    FOREIGN KEY (coffee_id) REFERENCES coffee (id)
);

