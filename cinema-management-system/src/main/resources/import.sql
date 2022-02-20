INSERT INTO tb_roles (name) VALUES ('admin');
INSERT INTO tb_roles (name) VALUES ('standard');

INSERT INTO tb_users (name, last_name, birth_date, cpf, email, role_id) VALUES ('Felipe', 'Appio', TIMESTAMP WITH TIME ZONE '1998-01-31T20:50:07.12345Z', '91933210826', 'felipe@email.com', 1);
INSERT INTO tb_users (name, last_name, birth_date, cpf, email, role_id) VALUES ('Vitória', 'Gonçalves', TIMESTAMP WITH TIME ZONE '1996-12-31T20:50:07.12345Z', '72940221006', 'vitoria@email.com', 1);