CREATE TABLE ecommerce.permission (
    permission_id INT NOT NULL AUTO_INCREMENT,
    session_flag INT(1) NOT NULL,
    create_date TIMESTAMP NOT NULL,
    update_date TIMESTAMP NOT NULL,
    PRIMARY KEY (permission_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;

CREATE TABLE ecommerce.member (
    member_id INT NOT NULL AUTO_INCREMENT,
    permission_id INT NOT NULL,
    name VARCHAR(30) NOT NULL,
    age INT(3) NOT NULL,
    create_date TIMESTAMP NOT NULL,
    update_date TIMESTAMP NOT NULL,
    PRIMARY KEY (member_id),
    FOREIGN KEY (permission_id)
        REFERENCES ecommerce.permission (permission_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;