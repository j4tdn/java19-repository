-- 1 Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ALL_ITEMS()
BEGIN
	-- body, statements
	SELECT * FROM item;
    -- body end
END $$

-- Gọi sủ dụng procedure
CALL P_PRINT_ALL_ITEMS();

-- 2.1 Viết phương thức liệt kê các mặt hàng theo mã loại hàng
DROP PROCEDURE P_PRINT_ITEMS();

DELIMITER $$
CREATE PROCEDURE P_PRINT_ALL_ITEMS(p_item_group_id INT)
BEGIN
	SELECT * 
    FROM item
    WHERE ITEM_GROUP_ID = p_item_group_id;
END $$

CALL P_PRINT_ITEMS_BY_ITEM_GROUP_ID(2);
-- 2.2 Viết phương thức liệt kê các mặt hàng theo tên  loại hàng
CALL P_PRINT_ALL_ITEMS();

-- 2.1 Viết phương thức liệt kê các mặt hàng theo mã loại hàng
DELIMITER $$
CREATE PROCEDURE P_PRINT_ITEMS_BY_ITEM_GROUP_NAME(p_item_group_name VARCHAR(100))
BEGIN

	SELECT * 
    FROM item
    WHERE ITEM_GROUP_ID = (SELECT ID
							FROM ITEM_GROUP
                            WHERE NAME = p_item_group_name);
END $$

CALL P_PRINT_ITEMS(2);

-- CALL P_PRINT_ITEMS_BY_ITEM_GROUP_NAME('Thắt lựng')

-- 3. Viết phương thức thêm N dòng dữ liệu cho bảng loại mặt hàng
DELIMITER $$
CREATE PROCEDURE P_INSERT_DATA_ITEM_GROUP(p_rows INT)
BEGIN
    DECLARE max_id INT DEFAULT(SELECT max(ID) FROM item_group);
    DECLARE id INT DEFAULT max_id + 1;
    
    DECLARE i INT DEFAULT 0;
    
    WHILE i < p_rows DO
		INSERT INTO item_group (ID, NAME)
        SELECT (id+i), concat('lạoi hàng', (id + i));
        SET i = i + 1;
        END WHILE;

END $$

CALL P_INSERT_DATA_ITEM_GROUP(5);

-- 4. Viét phương thức liệt kê các phần tử chẳn nhỏ hơn N 
