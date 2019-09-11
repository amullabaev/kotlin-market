CREATE TABLE IF NOT EXISTS users (
    id               BIGSERIAL PRIMARY KEY,
    first_name       VARCHAR(30)                 NOT NULL,
    last_name        VARCHAR(30)                 NOT NULL,
    email            VARCHAR(100)                NOT NULL,
    row_created_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    role_id          BIGINT                      NOT NULL REFERENCES roles(id)
);


INSERT INTO users (id, first_name, last_name, email, row_created_date, role_id)
VALUES (1, 'Admin', 'Main', 'noreply@example.com', current_timestamp, 1);
