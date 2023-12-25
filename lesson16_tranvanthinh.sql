-- Phần A
-- Tạo bảng Employees (Nhân viên)
DROP TABLE IF EXISTS `Employees`;
CREATE TABLE Employees (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) UNIQUE,
    unique_code VARCHAR(50) UNIQUE,
    address VARCHAR(255),
    salary DECIMAL(10, 2),
    gender VARCHAR(10),
    date_of_birth DATE,
    start_date DATE,
    department_id INT,
    supervisor_id INT
);

-- Tạo bảng Departments (Phòng ban)
DROP TABLE IF EXISTS `Departments`;
CREATE TABLE Departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(255) UNIQUE,
    department_code VARCHAR(50) UNIQUE
);

DROP TABLE IF EXISTS `Employee_Department_Manager`;
CREATE TABLE Employee_Department_Manager (
    employee_id INT,
    department_id INT,
    manager_start_date DATE
    
);

DROP TABLE IF EXISTS `Projects`;
-- Tạo bảng Projects (Dự án)
CREATE TABLE Projects (
    project_id INT AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(255) UNIQUE,
    project_code VARCHAR(50) UNIQUE,
    start_date DATE,
    end_date DATE,
    revenue DECIMAL(15, 2),
    project_manager_id INT
);

DROP TABLE IF EXISTS `Employee_Projects`;
-- Tạo bảng Employee_Projects (Nhân viên tham gia dự án)
CREATE TABLE Employee_Projects (
    employee_id INT,
    project_id INT,
    hours_worked INT
);

-- Thêm các ràng buộc khóa ngoại với tên đặt rõ ràng
ALTER TABLE Employees ADD CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES Departments(department_id);
ALTER TABLE Employees ADD CONSTRAINT fk_supervisor_id FOREIGN KEY (supervisor_id) REFERENCES Employees(employee_id);

ALTER TABLE Employee_Department_Manager ADD CONSTRAINT fk_manager_id FOREIGN KEY (employee_id) REFERENCES Employees(employee_id);
ALTER TABLE Employee_Department_Manager ADD CONSTRAINT fk_department_managed_id FOREIGN KEY (department_id) REFERENCES Departments(department_id);
ALTER TABLE Employee_Department_Manager ADD CONSTRAINT unique_employee_deparment UNIQUE (employee_id, department_id);

ALTER TABLE Projects ADD CONSTRAINT fk_project_manager_id FOREIGN KEY (project_manager_id) REFERENCES Employees(employee_id);

ALTER TABLE Employee_Projects ADD CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES Employees(employee_id);
ALTER TABLE Employee_Projects ADD CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES Projects(project_id);
ALTER TABLE Employee_Projects ADD CONSTRAINT unique_employee_project UNIQUE (employee_id, project_id);

-- Phần B
SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;
DELETE FROM Employees;
DELETE FROM Departments;
DELETE FROM Employee_Department_Manager;
DELETE FROM Projects;
DELETE FROM Employee_Projects;


INSERT INTO Employees (employee_id, full_name, unique_code, address, salary, gender, date_of_birth, start_date, department_id, supervisor_id) VALUES
(1, 'Nguyễn Văn A', 'NV001', '123 Đường Nguyễn Du, TP.HCM', 50000.00, 'Nam', '1990-05-15', '2020-01-01', 1, NULL),
(2, 'Trần Thị B', 'TTB002', '456 Đường Lê Lợi, Hà Nội', 60000.00, 'Nữ', '1985-09-22', '2019-03-10', 2, NULL),
(3, 'Phạm Văn C', 'PVC003', '789 Đường CMT8, Đà Nẵng', 55000.00, 'Nam', '1993-11-30', '2021-07-05', 1, 1),
(4, 'Hoàng Thị D', 'HTD004', '101 Đường Phan Đăng Lưu, Nha Trang', 52000.00, 'Nữ', '1991-07-18', '2022-02-20', 1, 1),
(5, 'Lê Văn E', 'LVE005', '246 Đường Nguyễn Văn Linh, Huế', 58000.00, 'Nam', '1987-04-10', '2018-11-12', 2, 2),
(6, 'Trần Văn F', 'TVF006', '321 Đường Lý Thường Kiệt, TP.HCM', 48000.00, 'Nam', '1992-08-20', '2022-05-10', 3, NUll),
(7, 'Lê Thị G', 'LTG007', '567 Đường Hồ Tùng Mậu, Hà Nội', 51000.00, 'Nữ', '1994-03-12', '2023-01-15', 3, 6),
(8, 'Nguyễn Đình H', 'NDH008', '876 Đường Nguyễn Trãi, Đà Lạt', 49000.00, 'Nam', '1990-12-05', '2021-11-30', 2, 6),
(9, 'Hoàng Văn I', 'HVI009', '432 Đường Lê Lai, Huế', 53000.00, 'Nam', '1989-06-25', '2020-09-05', 3, 6);

INSERT INTO Departments (department_id, department_name, department_code) VALUES
(1, 'Phòng Nhân sự', 'NS001'),
(2, 'Phòng Tài chính', 'TC001'),
(3, 'Phòng Marketing', 'MK001'),
(4, 'Phòng Kĩ thuật', 'KT001'),
(5, 'Phòng An ninh', 'AN001');

INSERT INTO Employee_Department_Manager (employee_id, department_id, manager_start_date) VALUES
(1, 1, '2020-01-01'),
(2, 2, '2019-03-10'),
(3, 1, '2021-07-05'),
(4, 2, '2022-02-20'),
(5, 3, '2018-11-12'),
(6, 4, '2020-12-15'),
(7, 5, '2019-06-18'),
(8, 3, '2021-11-12');

INSERT INTO Projects (project_id, project_name, project_code, start_date, end_date, revenue, project_manager_id) VALUES
(1, 'Dự án Alpha', 'DA001', '2021-01-15', '2023-05-20', 75000000.00, 1),
(2, 'Dự án Beta', 'DA002', '2022-03-05', '2024-02-28', 82000000.00, 2),
(3, 'Dự án Gama', 'DA003', '2020-09-10', '2023-12-31', 6900000.00, 6),
(4, 'Dự án Delta', 'DA004', '2023-02-01', '2025-07-15', 9000000.00, 4),
(5, 'Dự án Epsilon', 'DA005', '2019-11-20', '2022-08-10', 63000000.00, 5);

INSERT INTO Employee_Projects (employee_id, project_id, hours_worked) VALUES
(1, 1, 120),
(1, 2, 100),
(1, 3, 110),
(2, 1, 10),
(2, 4, 110),
(2, 5, 70),
(3, 2, 120),
(3, 3, 150),
(4, 3, 80),
(4, 4, 90),
(4, 5, 70),
(5, 4, 110),
(5, 5, 10),
(5, 2, 90),
(6, 5, 150),
(6, 4, 120),
(7, 3, 80),
(7, 2, 70),
(8, 4, 110);

SET FOREIGN_KEY_CHECKS=1;
SET SQL_SAFE_UPDATES = 1;

-- Phần C
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
DELIMITER $$
CREATE PROCEDURE FindProjectsByYearAndRevenue(IN target_year INT, IN target_revenue DECIMAL(15, 2))
BEGIN
    SELECT project_name, revenue
    FROM Projects
    WHERE YEAR(start_date) = target_year AND revenue > target_revenue;
END $$
CALL FindProjectsByYearAndRevenue(2023, 5000000);

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
DELIMITER $$
CREATE PROCEDURE FindEmployeesByHours(IN min_hours INT)
BEGIN
    SELECT P.project_id, EP.employee_id, E.full_name, P.project_name, EP.hours_worked
    FROM Employee_Projects EP
    JOIN Employees E ON EP.employee_id = E.employee_id
    JOIN Projects P ON EP.project_id = P.project_id
    WHERE EP.hours_worked > min_hours;
END $$

CALL FindEmployeesByHours(100);

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT E.*
	FROM Employees E
    JOIN Employees E1
    ON E.supervisor_id = E1.employee_id
    WHERE E.salary > E1.salary;
    
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
DELIMITER $$
CREATE PROCEDURE FindDepartmentsByEmployeeCount(IN min_employee_count INT)
BEGIN
    SELECT D.department_name, COUNT(E.employee_id) AS employee_count
    FROM Departments D
     JOIN Employees E ON D.department_id = E.department_id
    GROUP BY D.department_id
    HAVING COUNT(E.employee_id) > min_employee_count;
END $$
CALL FindDepartmentsByEmployeeCount(3);

-- 5. Liệt kê nhân viên đã làm việc cho công ty hơn *?* năm 
DELIMITER $$
CREATE PROCEDURE FindEmployeesByYears(IN min_years INT)
BEGIN
    SELECT full_name
    FROM Employees
    WHERE DATEDIFF(CURDATE(), start_date) >= min_years * 365;
END $$
CALL FindEmployeesByYears(1);

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
WITH CurrentDepartmentManager AS (
	SELECT EDM.department_id, EDM.employee_id, EDM.manager_start_date
	FROM Employee_Department_Manager EDM
	JOIN (
		SELECT department_id, MAX(manager_start_date) AS max_manager_start_date
		FROM Employee_Department_Manager
		GROUP BY department_id
	) AS max_dates ON EDM.department_id = max_dates.department_id
				  AND EDM.manager_start_date = max_dates.max_manager_start_date;
)
SELECT * 
	FROM Employees E
    JOIN Projects P
    ON E.employee_id = P.project_manager_id
	JOIN CurrentDepartmentManager CDM
    ON E.employee_id = CDM.employee_id;
    
-- 7.Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT E.*
FROM Employees E
JOIN Projects P ON E.employee_id = P.project_manager_id
GROUP BY E.employee_id
HAVING COUNT(P.project_id) > 1;



