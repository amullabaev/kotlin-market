CREATE TABLE IF NOT EXISTS products (
    id               BIGSERIAL PRIMARY KEY,
    name             VARCHAR(50)                 NOT NULL,
    price            BIGINT                      NOT NULL,
    description      VARCHAR(255),
    amount           BIGINT,
    row_created_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    category_id      BIGINT                      NOT NULL REFERENCES categories(id)
);
