-- Phần A. Viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả trên
CREATE DATABASE  lesson16_truongcongtrinh CHAR SET utf8mb4;
USE lesson16_truongcongtrinh;

	DROP TABLE IF EXISTS EMPLOYEE;
	CREATE TABLE IF NOT EXISTS EMPLOYEE
	(
		ID INT PRIMARY KEY,
		`NAME` VARCHAR(255) NOT NULL,
		ADDRESS TEXT NOT NULL,
		SALARY DECIMAL(18, 2) NOT NULL DEFAULT 0,
		GENDER BOOLEAN CHECK (GENDER IN (0, 1)),
		BIRTHDAY DATE NOT NULL,
        DEPARTMENT_ID INT NOT NULL,
        START_DATE DATE,
		SUPERVISOR_ID INT NOT NULL,
        CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
		CONSTRAINT FK_EMPLOYEE_EMPLOYEE FOREIGN KEY (SUPERVISOR_ID) REFERENCES EMPLOYEE(ID)
	);

	DROP TABLE IF EXISTS DEPARTMENT;
	CREATE TABLE IF NOT EXISTS DEPARTMENT 
	(
		ID INT PRIMARY KEY,
		`NAME` VARCHAR(255) NOT NULL,
		MANAGER_DEP_ID INT NOT NULL,
		START_DATE DATE NOT NULL,
		CONSTRAINT FK_DEPARTMENT_EMPLOYEE FOREIGN KEY (MANAGER_DEP_ID) REFERENCES EMPLOYEE(ID)
	);

	DROP TABLE IF EXISTS PROJECT;
	CREATE TABLE IF NOT EXISTS PROJECT 
	(
		ID INT PRIMARY KEY,
		`NAME` VARCHAR(255) UNIQUE NOT NULL,
		START_DATE DATE NOT NULL,
		END_DATE DATE NOT NULL,
		REVENUE DECIMAL(18, 2) NOT NULL DEFAULT 0,
		MANAGER_PROJ_ID INT NOT NULL,
		CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (MANAGER_PROJ_ID) REFERENCES EMPLOYEE(ID)
	);

	DROP TABLE IF EXISTS PROJECT_DETAIL;
	CREATE TABLE IF NOT EXISTS PROJECT_DETAIL (
		PROJECT_DETAIL_ID INT PRIMARY KEY,
		EMPLOYEE_ID INT NOT NULL,
		PROJECT_ID  INT NOT NULL,
		WORKED_HOUR INT NOT NULL,
		CONSTRAINT UNQ_EMPLOYEE_ID_PROJECT_ID UNIQUE (EMPLOYEE_ID,PROJECT_ID),
		CONSTRAINT FK_PROJECT_DETAIL_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
		CONSTRAINT FK_PROJECT_DETAIL_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(ID)
	);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO EMPLOYEE(ID, `NAME`, ADDRESS, SALARY, GENDER, BIRTHDAY, DEPARTMENT_ID, START_DATE, SUPERVISOR_ID) 
VALUES  (1, 'Nguyễn Văn A', '123 Hòa Khánh', 50000000, 1, '1990-01-01',1, '2019-05-08' , 1),
		(2, 'Trương Công B', '456 Điện Biên Phủ', 60000000, 1, '1985-05-15',1, '2019-01-01' , 3),
		(3, 'Lê Thị C', '789 Cẩm Lệ', 55000000, 0, '1995-12-10',1, '2020-01-20' , 1),
		(4, 'Trần Văn D', '111 Ngũ Hành Sơn', 70000000, 1, '1980-08-20', 2, '2019-08-08' , 2),
		(5, 'Hồ Thị E', '222 Trần Thị Lý', 65000000, 0, '1998-03-25', 2, '2019-12-20' , 4);


INSERT INTO DEPARTMENT(ID, `NAME`, MANAGER_DEP_ID, START_DATE)
VALUES  (1, 'Bộ Phận Nhân Sự', 1, '2021-01-01'),
		(2, 'Bộ Phận Công Nghệ Thông Tin', 4, '2021-02-15'),
		(3, 'Bộ Phận Tài Chính', 3, '2021-03-20'),
		(4, 'Bộ Phận Tiếp Thị', 5, '2021-04-10'),
		(5, 'Bộ Phận Vận Hành', 2, '2021-05-05');

INSERT INTO PROJECT(ID, `NAME`, START_DATE, END_DATE, REVENUE, MANAGER_PROJ_ID) 
VALUES  (1, 'Dự Án A', '2022-01-10', '2022-03-15', 10000000, 1),
		(2, 'Dự Án B', '2022-02-20', '2022-04-25', 80000000, 1),
		(3, 'Dự Án C', '2022-03-30', '2022-06-10', 12000000, 3),
		(4, 'Dự Án D', '2022-05-05', '2023-05-05', 90000000, 1),
		(5, 'Dự Án E', '2022-06-15', '2022-09-05', 11000000, 5);


INSERT INTO PROJECT_DETAIL(PROJECT_DETAIL_ID, EMPLOYEE_ID, PROJECT_ID, WORKED_HOUR) 
VALUES  (1 , 1, 1, 40),
		(2 , 2, 2, 35),
		(3 , 3, 3, 30),
		(4 , 4, 4, 25),
		(5 , 5, 5, 45),
		(6 , 1, 5, 40),
		(7 , 2, 4, 35),
		(8 , 3, 2, 30),
		(9 , 4, 2, 25),
		(10, 5, 1, 45);

-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;
-- Phần C. Thực hiện truy vấn 
-- 1. Liệt kê các dự án diễn ra trong năm 2022 có số tiền thu được trên 60 triệu VND
SELECT *
  FROM PROJECT
 WHERE YEAR(START_DATE) = 2022
   AND REVENUE > 60000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn 30 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia

SELECT E.ID  EMPLOYEE_ID,
       E.`NAME`  EMPLOYEE_NAME,
       PD.PROJECT_ID,
       P.`NAME`  PROJECT_NAME,
       PD.WORKED_HOUR
  FROM EMPLOYEE E
  JOIN PROJECT_DETAIL PD 
    ON E.ID = PD.EMPLOYEE_ID
  JOIN PROJECT P 
    ON PD.PROJECT_ID = P.ID
 WHERE PD.WORKED_HOUR > 30;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó

SELECT e.`NAME`,
       e.SALARY,
       ej.`NAME` SUPERVISOR_NAME,
       ej.SALARY SUPERVISOR_SALARY
  FROM employee e
  JOIN employee ej
    ON e.SUPERVISOR_ID = ej.ID
   AND e.SALARY >= ej.SALARY;
  
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 1
SELECT d.ID   DEPARTMENT_ID,
       d.`NAME` DEPARTMENT_NAME,
       COUNT(e.ID) TOTAL_EMPLOYEES
  FROM department d
  JOIN employee e ON d.ID = e.DEPARTMENT_ID
 GROUP BY d.ID, d.NAME
HAVING TOTAL_EMPLOYEES > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 3 năm

SELECT *
  FROM employee
 WHERE DATEDIFF(NOW(), START_DATE) > 3*365;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

SELECT E.ID,
       E.`NAME`,
       D.MANAGER_DEP_ID,
       D.`NAME`,
       P.MANAGER_PROJ_ID,
       P.`NAME`
  FROM employee E
  JOIN department D 
    ON E.ID = D.MANAGER_DEP_ID
  JOIN PROJECT P 
    ON E.ID = P.MANAGER_PROJ_ID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án

SELECT E.*,
       COUNT(P.ID) AS NUM_MANAGED_PROJECTS
  FROM EMPLOYEE E
  JOIN PROJECT P 
    ON E.ID = P.MANAGER_PROJ_ID
 GROUP BY E.ID
HAVING COUNT(P.ID) > 1;


-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, 
-- số giờ tham gia cũ, số giờ tham gia mới. Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật


-- disable all fks
SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM department;
DELETE FROM employee;
DELETE FROM project;
DELETE FROM project_detail;

-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;

SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM project;
SELECT * FROM project_detail;
