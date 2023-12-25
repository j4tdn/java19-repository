
SELECT * FROM bill;
SELECT * FROM customer;
SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM item;
SELECT * FROM item_detail;
SELECT * FROM item_group;
SELECT * FROM `order`;
SELECT * FROM order_detail;
SELECT * FROM order_status;
SELECT * FROM order_status_detail;
SELECT * FROM payment_method;
SELECT * FROM size;

-- -----------------------------------------------------
-- COMMIT
-- Khi thực thị 1 câu lệnh SQL(insert/update/delete) dữ liệu sẽ tác động
-- trực tiếp vào database khi thực hiện COMMIT, nếu chưa COMMIT dữ liệu chưa ăn vào database

-- SET AUTO_COMMIT = TRUE | FALSE
-- TRUE: khi run lệnh --> tự động commit
-- FALSE: khi run lệnh --> phải commit bằng tay
--                     --> có thể rollback dữ liệu về trạng thái trước khi lệnh dc thực thi

-- ROLLBACK

SET AUTOCOMMIT = 0;
SET AUTOCOMMIT = 1;
ROLLBACK;

-- Test delete/update option --> restrict(no option)/casecade all
-- DEFAULT: no option
SELECT * FROM ORDER_STATUS WHERE ID = 2; -- Xác nhận thành công
SELECT * FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;

DELETE FROM ORDER_STATUS WHERE ID = 2;
DELETE FROM ORDER_STATUS_DETAIL WHERE ORDER_STATUS_ID = 2;

ALTER TABLE order_status_detail
DROP CONSTRAINT FK_ORDER_STATUS_DETAIL_ORDER_STATUS;

ALTER TABLE order_status_detail
ADD CONSTRAINT `FK_ORDER_STATUS_DETAIL_ORDER_STATUS` FOREIGN KEY (`ORDER_STATUS_ID`) REFERENCES `order_status` (`ID`) 
ON DELETE CASCADE; -- xoá cha xoá luôn con liên quan đến khoá ngoại ORDER_STATUS_ID;

-- DEMO GROUP BY 

SELECT ITEM_GROUP_ID ,
		GROUP_CONCAT(`NAME` ORDER BY `NAME` ASC SEPARATOR '-') NAME
FROM item
GROUP BY ITEM_GROUP_ID;

SELECT ITEM_GROUP_ID ,
		CONCAT(COUNT(*), 'rows') NAME
FROM item
GROUP BY ITEM_GROUP_ID;