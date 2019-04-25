CREATE TABLE ecommerce.member (
    member_id INT UNSIGNED AUTO_INCREMENT,
    account VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(20) NOT NULL,
    name VARCHAR(30) NOT NULL,
    birthday_year INT(4) NOT NULL,
    birthday_month INT(2) NOT NULL,
    birthday_date INT(2) NOT NULL,
    email VARCHAR(30) NOT NULL,
    address VARCHAR(100),
    create_date TIMESTAMP NOT NULL,
    update_date TIMESTAMP DEFAULT NOW(),
    PRIMARY KEY (member_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.authority (
    authority_id INT UNSIGNED AUTO_INCREMENT,
    member_id INT UNSIGNED NOT NULL,
    authority_char VARCHAR(10) NOT NULL,
    authority_number INT NOT NULL,
    create_date TIMESTAMP DEFAULT NOW(),
    create_member_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (authority_id),
    FOREIGN KEY (member_id)
        REFERENCES ecommerce.member (member_id)
        ON DELETE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.screen_authority (
    authority_char VARCHAR(10) NOT NULL,
    authority_number INT NOT NULL,
    url VARCHAR(50) NOT NULL
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.security_token (
    member_id INT UNSIGNED NOT NULL,
    token VARCHAR(100) NOT NULL,
    create_date TIMESTAMP DEFAULT NOW()
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;