CREATE TABLE ECOMMERCE.MEMBER (
	member_code	INT(11)		NOT NULL,
    name		VARCHAR(30)	NOT NULL,
    age			INT(3)		NOT NULL,
    create_date	TIMESTAMP	NOT NULL,
    update_date	TIMESTAMP	NOT NULL,
    PRIMARY KEY (member_code)
);