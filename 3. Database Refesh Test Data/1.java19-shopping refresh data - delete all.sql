-- disable all foreign key
SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM bill;
DELETE FROM customer;
DELETE FROM department;
DELETE FROM employee;
DELETE FROM item;
DELETE FROM item_detail;
DELETE FROM item_group;
DELETE FROM payment_method;
DELETE FROM order_status_detail;
DELETE FROM order_status;
DELETE FROM order_detail;
DELETE FROM `order`;
DELETE FROM order_status_detail;

-- enable all foreign key
SET FOREIGN_KEY_CHECKS = 1;