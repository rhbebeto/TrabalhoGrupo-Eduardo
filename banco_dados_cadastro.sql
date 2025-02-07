CREATE DATABASE cadastro;

USE cadastro;

CREATE TABLE cadastro.cadastro_pessoa (
 id       INT auto_increment NOT NULL,
 nome     varchar(100)       NOT NULL,
 endereco varchar(100)       NOT NULL,
 email    varchar(100)       NULL    ,
 telefone varchar(100)       NULL    ,
 CONSTRAINT cadastro_pessoa_pk PRIMARY KEY (id)
);

select * from cadastro_pessoa;

CREATE TABLE cadastro.uf (
 id    INT auto_increment NOT NULL,
 nome  varchar(100)       NOT NULL,
 sigla varchar(2)         NOT NULL,
 CONSTRAINT cadastro_pessoa_pk PRIMARY KEY (id)
);

select * from uf;

-- Criação da tabela fornecedor
CREATE TABLE fornecedor (
  id                INT AUTO_INCREMENT NOT NULL,
  nome              VARCHAR(100)    NOT NULL,
  email             VARCHAR(100)    NULL,
  endereco          VARCHAR(100)    NOT NULL,
  uf                INT             NOT NULL,  -- chave estrangeira que referencia a tabela uf
  telefone          VARCHAR(100)    NULL,
  cnpj              VARCHAR(50)     NOT NULL,
  inscricaoEstadual VARCHAR(50)     NOT NULL,
  nomeFantasia      VARCHAR(100)    NOT NULL,
  categoria         VARCHAR(100)    NOT NULL,
  CONSTRAINT fornecedor_pk PRIMARY KEY (id),
  CONSTRAINT fk_fornecedor_uf FOREIGN KEY (uf) REFERENCES uf(id)
);
