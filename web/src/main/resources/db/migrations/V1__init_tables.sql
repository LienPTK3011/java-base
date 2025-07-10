-- Create the accounts table
CREATE TABLE accounts
(
    id        CHAR(36) PRIMARY KEY,                   -- UUID as string (e.g., '550e8400-e29b...')
    user_name VARCHAR(100) NOT NULL UNIQUE,           -- Login username (must be unique)
    password  VARCHAR(255) NOT NULL,                  -- Encrypted password
    status    VARCHAR(20)  NOT NULL DEFAULT 'active', -- Account status: active, inactive, locked...
    role      VARCHAR(50)  NOT NULL                   -- User role: admin, user, etc.
);


-- Create the users table
CREATE TABLE users (
    id CHAR(36) PRIMARY KEY,                         -- UUID
    full_name VARCHAR(255) NOT NULL,                 -- Full name of the user
    account_id CHAR(36) NOT NULL,                    -- Foreign key referencing accounts(id)
    CONSTRAINT fk_users_account FOREIGN KEY (account_id) REFERENCES accounts(id)
);
