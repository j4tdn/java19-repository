-- disable all fks
SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM departments;
DELETE FROM employees;
DELETE FROM projects;
DELETE FROM workon;


-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;