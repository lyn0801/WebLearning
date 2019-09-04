DROP DATABASE IF EXISTS test01;
CREATE DATABASE test01;
USE test01;
CREATE TABLE userInfo
(
    id    BIGINT         NOT NULL,
    name  VARCHAR(32)    NOT NULL,
    password VARCHAR(32) NOT NULL,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
DROP DATABASE IF EXISTS test02;
CREATE DATABASE test02;
USE test02;
CREATE TABLE userInfo
(
    id    BIGINT         NOT NULL,
    name  VARCHAR(32)    NOT NULL,
    password VARCHAR(32) NOT NULL,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
