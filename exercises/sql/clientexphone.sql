UNIDADE_FEDERATIVA
	(int) id [PK],
	(char[2]) codigo,
	(varchar[255]) nome

TELEFONE_TIPO
	(int) id [PK],
	(varchar[255]) tipo

CLIENTE
	(int) id [PK],
	(int) id_unidade_federativa [FK -> UNIDADE_FEDERATIVA.id],
	(varchar[255]) razao_social
	(varchar[255]) email

CLIENTE_TELEFONE
	(int) id [PK],
	(int) id_cliente [FK -> CLIENTE.id],
	(int) id_telefone_tipo [FK -> TELEFONE_TIPO.id],
	(varchar[255]) telefone


CREATE TABLE UNIDADE_FEDERATIVA (
    id int NOT NULL AUTO_INCREMENT,
    codigo char(2) NOT NULL,
    nome varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE TELEFONE_TIPO (
    id int NOT NULL AUTO_INCREMENT,
    tipo varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE CLIENTE (
    id int NOT NULL AUTO_INCREMENT,
    id_unidade_federativa int NOT NULL,
    razao_social varchar(255),
    email varchar(255),
    PRIMARY KEY (id),
    FOREIGN KEY (id_unidade_federativa) REFERENCES UNIDADE_FEDERATIVA(id)
);

CREATE TABLE CLIENTE_TELEFONE (
    id int NOT NULL AUTO_INCREMENT,
    id_cliente int NOT NULL,
    id_telefone_tipo int NOT NULL,
    telefone varchar(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTE(id),
    FOREIGN KEY (id_telefone_tipo) REFERENCES TELEFONE_TIPO(id)  
);

INSERT INTO UNIDADE_FEDERATIVA (codigo, nome)
VALUES ('SP','São Paulo'); 
INSERT INTO UNIDADE_FEDERATIVA (codigo, nome)
VALUES ('RS','Rio Grande do Sul');

INSERT INTO TELEFONE_TIPO (tipo)
VALUES ('Comercial'); 
INSERT INTO TELEFONE_TIPO (tipo)
VALUES ('Residencial');

INSERT INTO CLIENTE (id_unidade_federativa, razao_social, email)
VALUES (1, 'Comercio A', 'comercioa@email.com');
INSERT INTO CLIENTE (id_unidade_federativa, razao_social, email)
VALUES (2, 'Comercio B', 'comerciob@email.com');
INSERT INTO CLIENTE (id_unidade_federativa, razao_social, email)
VALUES (1, 'Comercio C', 'comercioc@email.com');

INSERT INTO CLIENTE_TELEFONE (id_cliente, id_telefone_tipo, telefone)
VALUES (1, 1, '99555-555');
INSERT INTO CLIENTE_TELEFONE (id_cliente, id_telefone_tipo, telefone)
VALUES (1, 2, '99444-444');
INSERT INTO CLIENTE_TELEFONE (id_cliente, id_telefone_tipo, telefone)
VALUES (2, 1, '81555-555');
INSERT INTO CLIENTE_TELEFONE (id_cliente, id_telefone_tipo, telefone)
VALUES (3, 1, '99777-777');

SELECT CLIENTE.id AS 'código', CLIENTE.razao_social AS 'razão social', CLIENTE.email AS 'e-mail', CONCAT(CLIENTE_TELEFONE.telefone, ' ', TELEFONE_TIPO.tipo) AS 'telefone(s)' 
FROM CLIENTE INNER JOIN CLIENTE_TELEFONE ON CLIENTE.id = CLIENTE_TELEFONE.id_cliente 
            INNER JOIN TELEFONE_TIPO ON CLIENTE_TELEFONE.id_telefone_tipo = TELEFONE_TIPO.id 
            INNER JOIN UNIDADE_FEDERATIVA ON CLIENTE.id_unidade_federativa = UNIDADE_FEDERATIVA.id 
WHERE UNIDADE_FEDERATIVA.codigo = 'SP';
