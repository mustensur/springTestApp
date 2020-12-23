CREATE TABLESPACE users
DATAFILE '/u01/oracle/oradata/dev11g/users01.dbf'
   size 100M
autoextend on next 10M maxsize 4G;

CREATE TABLE clients (
                         client_id    NUMBER(4) CONSTRAINT pk_client_id PRIMARY KEY,
                         last_name    VARCHAR2(128) NOT NULL,
                         first_name   VARCHAR2(64) NOT NULL
) TABLESPACE users;

CREATE SEQUENCE client_id_seq
    INCREMENT BY 1
    START WITH 1;