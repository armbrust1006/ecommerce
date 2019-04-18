INSERT INTO `ecommerce`.`member`
(`account`,`password`,`name`,`birth_year`,`birth_month`,`birth_day`,`email`,`address`,`create_date`,`update_date`)
VALUES
("absc","1234","kim",2000,01,02,"sabs","asd",now(),now()),
("abcd","1234","kim",2000,01,02,"sabs","asd",now(),now());

INSERT INTO `ecommerce`.`authority`
(`member_id`,`authority_char`,`authority_number`,`create_date`,`create_member_id`)
VALUES
(1,"ra",1,now(),1),
(1,"rb",1,now(),1),
(1,"ra",1,now(),1),
(1,"ra",2,now(),1);
