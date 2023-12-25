-- Part A
CREATE TABLE employee (
	id INT PRIMARY KEY,
	name VARCHAR(50),
    dep_id INT,
	address VARCHAR(100),
	salary FLOAT,
	gender BIT,
	birth_date DATE,
	join_date DATE
);

CREATE TABLE department (
	id INT PRIMARY KEY,
	name VARCHAR(50),
	manager_id INT,
	assign_date DATE,
	FOREIGN KEY (manager_id) REFERENCES employee(id)
);

CREATE TABLE project (
	id INT PRIMARY KEY,
	name VARCHAR(100),
    manager_id INT,
	start_date DATE,
	end_date DATE,
	revenue FLOAT
);

CREATE TABLE participate (
	emp_id INT,
	pro_id INT,
	hours_worked INT,
	PRIMARY KEY (emp_id, pro_id),
	FOREIGN KEY (emp_id) REFERENCES employee(id),
	FOREIGN KEY (pro_id) REFERENCES project(id)
);

CREATE TABLE manage (
	emp_id INT,
	manager_id INT,
	PRIMARY KEY (emp_id, manager_id),
	FOREIGN KEY (emp_id) REFERENCES employee(id),
	FOREIGN KEY (manager_id) REFERENCES employee(id)
);

-- Part B

INSERT INTO employee VALUES
(1, 'John Doe', 5, 'New York', 5000, 1, '1990-01-01', '2010-01-01'),
(2, 'Jane Doe', 4, 'Washington', 6500, 0, '1995-06-06', '2012-04-04'),
(3, 'Bob Smith', 3, 'Chicago', 4000, 1, '1998-02-02', '2015-09-04'),
(4, 'Emma Wilson', 2, 'Los Angeles', 5500, 0, '2001-08-12', '2017-06-15'),
(5, 'Samuel Jackson', 1, 'Miami', 6200, 1, '1994-05-26', '2016-05-05');

INSERT INTO department VALUES

(1, 'Sales', 1, '2020-01-01'),
(2, 'Marketing', 2, '2019-04-01'),
(3, 'Engineering', 3, '2021-03-15'),
(4, 'Human Resources', 4, '2022-05-23'),
(5, 'Customer Service', 5, '2018-02-12');

INSERT INTO project VALUES
(1, 'Website Redesign', 2, '2022-01-01', '2022-06-30', 150000),
(2, 'Mobile App', 3, '2021-04-15', '2022-03-31', 250000),
(3, 'CRM System', 3, '2020-05-20', '2021-12-05', 200000),
(4, 'New Product', 5,'2023-02-01', '2023-08-31', 300000),
(5, 'Marketing Campaign', 2, '2019-09-12', '2020-02-28', 100000);

INSERT INTO participate VALUES
(1, 1, 10),
(2, 2, 15),
(3, 3, 20),
(4, 4, 25),
(5, 5, 30);

INSERT INTO manage VALUES
(1, 2),
(2, 1),
(3, 4),
(4, 3),
(5, 2);

--
--
-- Part C
--
--

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM project
WHERE YEAR(start_date) = 2023 AND revenue > 200000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT e.name, p.name, h.hours_worked
FROM employee e
JOIN participate h ON e.id = h.emp_id
JOIN project p ON h.pro_id = p.id
WHERE h.hours_worked > 20;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT e1.name
FROM employee e1 JOIN manage m ON e1.id = m.emp_id
JOIN employee e2 ON m.manager_id = e2.id
WHERE e1.salary >= e2.salary;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT d.*
FROM department d
JOIN employee e ON d.id = e.dep_id
GROUP BY d.id
HAVING COUNT(e.id) > 5;

-- 5. Liệt kê các công ty đã làm việc cho công ty hơn ?*? năm
SELECT *
FROM employee
WHERE YEAR(NOW()) - YEAR(join_date) > 5;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT DISTINCT e.*
FROM employee e
JOIN department d ON e.id = d.manager_id
JOIN project p ON e.id = p.manager_id;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT e.*
FROM employee e
JOIN project p ON e.id = p.manager_id
GROUP BY e.id
HAVING COUNT(p.id) > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
CREATE TABLE participate_log (
id INT AUTO_INCREMENT PRIMARY KEY,
emp_id INT,
pro_id INT,
change_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
action VARCHAR(50),
old_hours INT,
new_hours INT
);

DELIMITER $$
CREATE TRIGGER after_insert_participate
AFTER INSERT ON participate
FOR EACH ROW
BEGIN
INSERT INTO participate_log (emp_id, pro_id, action, new_hours)
VALUES (NEW.emp_id, NEW.pro_id, 'insert', NEW.hours_worked);
END$$

CREATE TRIGGER after_update_participate
AFTER UPDATE ON participate
FOR EACH ROW
BEGIN
IF OLD.hours_worked <> NEW.hours_worked THEN
INSERT INTO participate_log (emp_id, pro_id, action, old_hours, new_hours)

VALUES (NEW.emp_id, NEW.pro_id, 'update', OLD.hours_worked, NEW.hours_worked);
END IF;
END$$

DELIMITER ;