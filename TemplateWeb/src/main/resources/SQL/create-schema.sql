CREATE SCHEMA myteam;

  CREATE DATABASE local;
   
  use local;
   
  CREATE TABLE local (
       id INT PRIMARY KEY,
       nome VARCHAR(30),
       cidade VARCHAR(30),
       pais VARCHAR(30),
       imagem BLOB,
       data_cadastro TIMESTAMP
  );

