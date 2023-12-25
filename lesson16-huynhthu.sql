-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
CREATE DATABASE COMPANY_MANAGEMENT_DB CHAR SET utf8mb4;
USE COMPANY_MANAGEMENT_DB;

DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE DEPARTMENT
(
ID INT,
NAME VARCHAR(100) NOT NULL,
MANAGER_ID INT NOT NULL,
EMPLOYEE_ID INT NOT NULL,
PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS MANAGER;
CREATE TABLE MANAGER
(
ID INT,
NAME VARCHAR(100) NOT NULL,
START_DAY DATETIME NOT NULL,
PRIMARY KEY (ID) 
);

DROP TABLE IF EXISTS PROJECT;
CREATE TABLE PROJECT
(
ID INT,
NAME VARCHAR(100) NOT NULL,
PJ_START_DAY DATETIME NOT NULL,
PJ_END_DAY DATETIME NOT NULL,
PROFIT FLOAT NOT NULL,
PRIMARY KEY (ID)
);
DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE
(
ID INT,
NAME VARCHAR(100) NOT NULL,
ADDRESS VARCHAR(100) NOT NULL,
SALARY FLOAT NOT NULL,
GENDER BIT NOT NULL,
DAY_OF_BIRTH DATETIME NOT NULL,
ONBOARD_DAY DATETIME NOT NULL,
DEPARTMENT_ID INT NOT NULL,
JOB_DETAIL_ID INT NOT NULL,
PRIMARY KEY (ID),
CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
CONSTRAINT FK_JOB_DETAIL FOREIGN KEY (JOB_DETAIL_ID) REFERENCES JOB_DETAIL(ID),
CONSTRAINT CK_GENDER CHECK (`GENDER` IN (0,1))

);
DROP TABLE IF EXISTS JOB_DETAIL;
CREATE TABLE JOB_DETAIL
(
ID INT,
PJ_ID INT NOT NULL,
POSITION VARCHAR(100) NOT NULL,
WORK_HOUR FLOAT NOT NULL,
PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS PJ_DETAIL;
CREATE TABLE PJ_DETAIL
(
ID INT,
EMPLOYEE_ID INT NOT NULL,
PJ_ID INT NOT NULL,
PRIMARY KEY (ID),
CONSTRAINT UNQ_EMPLOYEE_PJ UNIQUE (EMPLOYEE_ID, PJ_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO DEPARTMENT(ID, NAME, MANAGER_ID, EMPLOYEE_ID)
VALUES ( 1, 'DP1', 1, 2),
( 2, 'DP2', 2, 1),
( 3, 'DP3', 3, 4),
( 4, 'DP4', 4, 3),
( 5, 'DP5', 5, 5);

INSERT INTO EMPLOYEE(ID, NAME, ADDRESS, SALARY, GENDER, DAY_OF_BIRTH, ONBOARD_DAY, DEPARTMENT_ID, JOB_DETAIL_ID)
VALUES(1, 'A1', 'ADD1', 100, 1, str_to_date('1/1/1996', '%d/%m/%Y'),str_to_date('1/1/2019', '%d/%m/%Y') , 1, 1),
(2, 'A2', 'ADD2', 200, 1, str_to_date('1/1/1997', '%d/%m/%Y'),str_to_date('1/1/2020', '%d/%m/%Y') , 2, 2),
(3, 'A3', 'ADD3', 300, 0, str_to_date('1/1/1995', '%d/%m/%Y'),str_to_date('1/1/2018', '%d/%m/%Y'), 3, 3), 
(4, 'A4', 'ADD4', 400, 0, str_to_date('1/1/1996', '%d/%m/%Y'),str_to_date('1/1/2017', '%d/%m/%Y'), 4, 4), 
(5, 'A5', 'ADD5', 500, 1, str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y') , 5, 5);

-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`company_management_db`.`employee`, CONSTRAINT `FK_JOB_DETAIL` FOREIGN KEY (`JOB_DETAIL_ID`) REFERENCES `job_detail` (`ID`))
INSERT INTO JOB_DETAIL(ID, PJ_ID, POSITION, WORK_HOUR)
VALUES ( 1, 1, 'Tester', 200),
( 2, 2, 'Dev', 300),
( 3, 3, 'PM', 300),
( 4, 4, 'Dev', 100),
( 5, 5, 'Dev', 500);


INSERT INTO MANAGER(ID, `NAME`, START_DAY)
VALUES(1, 'B1', str_to_date('1/1/2020', '%d/%m/%Y')),
(2, 'B2', str_to_date('1/2/2020', '%d/%m/%Y')),
(3, 'B5', str_to_date('1/3/2020', '%d/%m/%Y')),
(4, 'B3', str_to_date('1/4/2020', '%d/%m/%Y')),
(5, 'B4', str_to_date('1/5/2020', '%d/%m/%Y'))
;

INSERT INTO PROJECT(ID, `NAME`, PJ_START_DAY, PJ_END_DAY, PROFIT)
VALUES(1, 'PJ1', str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y'), 100000),
(2, 'PJ2', str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y'), 500000),
(3, 'PJ3', str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y'), 600000),
(4, 'PJ4', str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y'), 700000),
(5, 'PJ5', str_to_date('1/1/1998', '%d/%m/%Y'),str_to_date('1/1/2022', '%d/%m/%Y'), 800000)
;

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND

SELECT * FROM PROJECT WHERE cast(PJ_START_DAY AS DATE) = str_to_date('1/1/1998','%d/%m/%Y') AND PROFIT > 700000;


--
