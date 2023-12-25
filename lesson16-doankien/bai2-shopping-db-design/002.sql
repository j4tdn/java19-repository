USE java19_shopping;

-- create table CUSTOMER
DROP TABLE IF EXISTS CUSTOMER;
CREATE TABLE CUSTOMER
(
	ID 			INT,
    `NAME` 		VARCHAR(100) NOT NULL,
    `EMAIL` 	VARCHAR(100) NOT NULL,
    `ADDRESS` 	VARCHAR(100) NOT NULL,
    `PHONE` 	INT NOT NULL,
    `PASSWORD` 	VARCHAR(50) NOT NULL,
    PRIMARY KEY (ID)
);

