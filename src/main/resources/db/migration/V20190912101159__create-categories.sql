CREATE TABLE IF NOT EXISTS categories (
    id               BIGSERIAL PRIMARY KEY,
    name             VARCHAR(50)                 NOT NULL,
    description      VARCHAR(255),
    row_created_date TIMESTAMP WITHOUT TIME ZONE NOT NULL
);
