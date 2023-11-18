-- Patches to creating tables

-- ITEM_GROUP, ITEM, SIZE, ITEM_DETAIL


-- create table ITEM_GROUP
DROP TABLE IF EXISTS ITEM_GROUP;
CREATE TABLE ITEM_GROUP 
(
	ID INT,
    `NAME` VARCHAR(100) NOT NULL,
    CONSTRAINT PK_ITEM_GROUP PRIMARY KEY (ID)
);
-- create table ITEM
DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM 
(
	ID INT,
    MATERIAL VARCHAR(100) NOT NULL,
    BUY_PRICE FLOAT NOT NULL,
    COLOR VARCHAR(50) NOT NULL,
    ITEM_GROUP_ID INT NOT NULL, -- khoa ngoai khong bat buoc khac null
    PRIMARY KEY (ID),
    CONSTRAINT FK_ITEM_ITEM_GROUP FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
);

-- create table SIZE
DROP TABLE IF EXISTS SIZE;
CREATE TABLE SIZE 
(
	ID INT,
    `KEY` VARCHAR(10) NOT NULL,
    GENDER BIT NOT NULL,
    `DESC` TEXT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT CHK_SIZE_KEY CHECK (`KEY` IN ('S', 'M', 'L', 'XL', 'XXL')),
    CONSTRAINT CHK_GENDER CHECK (GENDER IN (0, 1))
);

-- create table ITEM_DETAIL
DROP TABLE IF EXISTS ITEM_DETAIL;
CREATE TABLE ITEM_DETAIL
(
	ID INT,
    ITEM_ID INT NOT NULL,
    SIZE_ID INT NOT NULL,
    AMOUNT INT NOT NULL,
    SALES_PRICE FLOAT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT UNQ_ITEM_SIZE UNIQUE (ITEM_ID, SIZE_ID),
    CONSTRAINT FK_ITEM_DETAIL_ITEM FOREIGN KEY (ITEM_ID) REFERENCES ITEM(ID),
    CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES SIZE(ID)
);
