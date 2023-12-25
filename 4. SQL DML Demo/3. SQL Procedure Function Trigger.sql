-- 1. Viet phuong thuc liet ke cac mat hang
DELIMITER //
CREATE PROCEDURE P_PRINT_ALL_ITEMS()
BEGIN
-- BODY, STATEMENTS
  SELECT * FROM ITEM; 
-- BODY END
END //

-- GOI SU DUNG PROCEDURE
CALL P_PRINT_ALL_ITEMS();

-- 2.1 Viet phuong thuc liet ke cac mat hang theo ma loai hang
--- 
DROP PROCEDURE P_PRINT_ITEMS;


DELIMITER //
CREATE PROCEDURE P_PRINT_ITEMS_BY_GROUP_ID(p_item_group_id INT)
BEGIN
  SELECT * 
  FROM ITEM 
  WHERE ITEM_GROUP_ID = p_item_group_id; 
END //

CALL P_PRINT_ITEMS_BY_GROUP_ID(4);

-- 2.2 Viet phuong thuc liet ke cac mat hang theo loai hang
DROP PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME;

DELIMITER //
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME(p_item_group_name VARCHAR(100))
BEGIN
  DECLARE p_ig_id INT;
  
  SET p_ig_id = (SELECT ID
                   FROM ITEM_GROUP
                   WHERE NAME = p_item_group_name);

  SELECT * 
  FROM ITEM 
  WHERE ITEM_GROUP_ID = p_ig_id; 
END //

CALL P_PRINT_ITEMS_BY_ITEM_GROUP_NAME('Quần');

-- 3 Viet phuong thuc them (append) N dong du lieu cho bang loai hang
DELIMITER //
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP(p_rows INT)
  
BEGIN
  DECLARE max_id INT DEFAULT (SELECT max(ID) FROM ITEM_GROUP);
  DECLARE id INT DEFAULT max_id + 1;
  
  DECLARE i INT DEFAULT 0;
  
  WHILE i < p_rows DO
     INSERT INTO ITEM_GROUP(ID, NAME)
     SELECT (id+i), concat('Loại hàng',(id+i));
     SET i = i +1;
 END WHILE;
END//

CALL P_INSERT_DATA_ITEM_GROUP(5);

-- 2. Viet phuong thuc liet ke ca phan tu chan nho hon N

DELIMITER //
CREATE PROCEDURE P_PRINT_EVEN_NUMBER(n INT)
BEGIN
   DECLARE i INT DEFAULT 0;
   DECLARE result TEXT DEFAULT '';

   TRUNCATE GTT_DATA;
   WHILE i < n DO
     IF i MOD 2 = 0 THEN
        INSERT INTO GTT_DATA(GTT_COL)
        SELECT i;
	 END WHILE;
     SET i = i + 1;
   END WHILE;
   SELECT * FROM 


-- Tinh tong cac phan tu chan nho hon N


