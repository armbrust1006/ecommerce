INSERT INTO ecommerce.permission
(session_flag, create_date, update_date)
VALUES
(0, now(), now()),
(0, now(), now()),
(0, now(), now());

INSERT INTO ecommerce.member 
(permission_id, name, age, create_date, update_date) 
VALUES 
(1, 'kim', 20, now(), now()),
(2, 'pack', 10, now(), now()),
(3, 'lee', 30, now(), now());