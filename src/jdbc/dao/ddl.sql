-- DAO 패턴 연습을 위한 테이블 정의
USE jdbc;

CREATE TABLE members (
	id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

SELECT * FROM members;