
SHOW VARIABLES LIKE 'version';

ALTER TABLE SIZE
CHANGE `KEY` `SIZE` VARCHAR(10) NOT NULL;

-- RENAME column KEY to SIZE in table SIZE

-- DELETE constraint CHK_SIZE_KEY
ALTER TABLE SIZE 
DROP CONSTRAINT CHK_SIZE_KEY;

-- RENAME column
ALTER TABLE SIZE RENAME COLUMN `KEY` TO `SIZE`;

-- RECREATE constraint
ALTER TABLE SIZE
ADD CONSTRAINT `CHK_SIZE` CHECK (`SIZE` IN ('S','M','L','XL','XXL','XXXL')); 

-- ADD Column `NAME` to table ITEM
ALTER TABLE ITEM 
ADD COLUMN `NAME` VARCHAR(100) NOT NULL AFTER ID;

-- ADD Column `DELIVERY_ADDRESS` to table ODER
ALTER TABLE `ORDER` 
ADD COLUMN DELIVERY_ADDRESS VARCHAR(100) NOT NULL AFTER ID;

-- ADD Column UNIQUE contraint for column ORDER_ID in table BILL
ALTER TABLE `BILL`
ADD CONSTRAINT UNQ_ORDER UNIQUE (ORDER_ID);
