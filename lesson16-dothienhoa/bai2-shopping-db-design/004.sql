DROP TABLE IF EXISTS PAYMENT_METHOD;
CREATE TABLE PAYMENT_METHOD
(
	ID INT,
    `DESC` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS ORDER_STATUS;
CREATE TABLE ORDER_STATUS
(
	ID INT,
    `DESC` VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
)




