-- Patches to creating tables
-- ORDER, BILL, ORDER_DETAIL, ORDER_STATUS_DETAIL

USE java19_shopping;

-- create table ORDER
DROP TABLE IF EXISTS `ORDER`;
CREATE TABLE `ORDER`
(
	ID 					INT,
    DELIVERY_FEE 		FLOAT NOT NULL,
    CREATED_AT 			DATE NOT NULL,
    PAYMENT_METHOD_ID 	INT NOT NULL,
    EMPLOYEE_ID 		INT NOT NULL,
    CUSTOMER_ID 		INT NOT NULL,
    PRIMARY 			KEY (ID),
    CONSTRAINT 			FK_ORDER_DEPARTMENT FOREIGN KEY (PAYMENT_METHOD_ID) REFERENCES PAYMENT_METHOD(ID),
    CONSTRAINT 			FK_ORDER_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT 			FK_ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(ID)
);

-- create table BILL
DROP TABLE IF EXISTS BILL;
CREATE TABLE BILL
(
	ID 				INT,
    CREATED_AT 		DATETIME NOT NULL,
    TOTAL_OF_MONEY 	FLOAT NOT NULL,
    ORDER_ID 		INT NOT NULL,
    PRIMARY 		KEY (ID),
    CONSTRAINT 			FK_BILL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID)
);

-- create table ORDER_DETAIL
DROP TABLE IF EXISTS ORDER_DETAIL;
CREATE TABLE ORDER_DETAIL
(
	ID 				INT,
    ORDER_ID 		INT NOT NULL,
    ITEM_DETAIL_ID 	INT NOT NULL,
    AMOUNT 			INT NOT NULL,
    PRIMARY 		KEY (ID),
    CONSTRAINT 		FK_ORDER_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT 		FK_ORDER_DETAIL_ITEM_DETAIL FOREIGN KEY (ITEM_DETAIL_ID) REFERENCES `ITEM_DETAIL`(ID)
);

-- create table ORDER_STATUS_DETAIL
DROP TABLE IF EXISTS ORDER_STATUS_DETAIL;
CREATE TABLE ORDER_STATUS_DETAIL
(
	ID 				INT,
    ORDER_ID 		INT NOT NULL,
    ORDER_STATUS_ID INT NOT NULL,
    EMPLOYEE_ID 	INT NOT NULL,
    UPDATED_AT 		DATETIME NOT NULL,
    CONSTRAINT 		FK_ORDER_STATUS_DETAIL_ORDER FOREIGN KEY (ORDER_ID) REFERENCES `ORDER`(ID),
    CONSTRAINT 		FK_ORDER_STATUS_DETAIL_ORDER_STATUS FOREIGN KEY (ORDER_STATUS_ID) REFERENCES ORDER_STATUS(ID),
    CONSTRAINT 		FK_ORDER_STATUS_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID)
);