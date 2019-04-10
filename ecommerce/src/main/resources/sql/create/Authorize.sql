CREATE TABLE ecommerce.authorize (
	authorize_code	INT(11)		NOT NULL,
    member_code		INT(11)		NOT NULL,
	session_flag	INT(1)		NOT NULL,
	create_date		TIMESTAMP	NOT NULL,
    update_date		TIMESTAMP	NOT NULL,
    PRIMARY KEY (authorize_code)
);