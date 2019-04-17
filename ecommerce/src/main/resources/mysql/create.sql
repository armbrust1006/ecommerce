CREATE TABLE ecommerce.screen_per (
    permission_char VARCHAR(10) NOT NULL,
    permission_number INT NOT NULL,
    url VARCHAR(50) NOT NULL
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.permission (
    permission_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    permission_char VARCHAR(10) NOT NULL,
    permission_number INT NOT NULL,
    create_date TIMESTAMP NOT NULL,
    create_user_id INT NOT NULL,
    PRIMARY KEY (permission_id),
    FOREIGN KEY (user_id)
        REFERENCES ecommerce.user (user_id)
        ON DELETE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.user (
    user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    account VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(20) NOT NULL,
    name VARCHAR(30) NOT NULL,
    birth_year INT(4) NOT NULL,
    birth_month INT(2) NOT NULL,
    birth_day INT(2) NOT NULL,
    email VARCHAR(30) NOT NULL,
    address VARCHAR(100),
    create_date TIMESTAMP NOT NULL,
    update_date TIMESTAMP NOT NULL,
    PRIMARY KEY (user_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;