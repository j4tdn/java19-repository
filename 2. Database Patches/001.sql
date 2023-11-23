-- 001 sql
--  ITEM_GROUP 
-- ITEM 
-- SIZE 
-- ITEM_DETAIL
USE java19_shopping;

-- create table ITEM_GROUP
DROP TABLE IF EXISTS ITEM_GROUP;
CREATE TABLE ITEM_GROUP 
(
ID INT ,
`NAME` VARCHAR(100) NOT NULL,
 PRIMARY KEY(ID) -- Không cần đặt tên cho ràng buộc primary key 
);

-- create table item 
DROP TABLE IF EXISTS ITEM;
CREATE TABLE ITEM 
(
	ID INT ,
    MATERIAL  		VARCHAR(100) NOT NULL ,
    BUY_PRICE 		FLOAT NOT NULL,
    COLOR     		VARCHAR(50) NOT NULL,
    ITEM_GROUP_ID 	INT NOT NULL, -- khóa ngoại không nhất thiết phải gán null
    CONSTRAINT FK_ITEM_ITEM_GROUP FOREIGN KEY (ITEM_GROUP_ID) REFERENCES ITEM_GROUP(ID)
    
);