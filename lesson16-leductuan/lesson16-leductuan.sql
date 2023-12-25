-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban có một tên duy nhất, một mã
-- số duy nhất, một nhân viên cụ thể quản lý phòng đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
--
DROP TABLE IF EXISTS Department; 
CREATE TABLE IF NOT EXISTS Department (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) UNIQUE NOT NULL,
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES Employee(id)
);
DROP TABLE IF EXISTS Employee; 
CREATE TABLE IF NOT EXISTS Employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL, 
    code VARCHAR(20) UNIQUE NOT NULL,
    address VARCHAR(255), 
    salary DECIMAL(10,2),
    gender ENUM('Male', 'Female'),
    birth_date DATE,
    start_date DATE,
    department_id INT,
    manager_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(id),
    FOREIGN KEY (manager_id) REFERENCES Employee(id)
);
DROP TABLE IF EXISTS Project; 
CREATE TABLE IF NOT EXISTS Project (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) UNIQUE NOT NULL,
    code VARCHAR(20) UNIQUE NOT NULL,
    start_date DATE,
    end_date DATE,
    revenue DECIMAL(10,2),
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES Employee(id)
);
DROP TABLE IF EXISTS Works_On; 
CREATE TABLE IF NOT EXISTS Works_On (
    employee_id INT,
    project_id INT,
    hours INT,
    PRIMARY KEY (employee_id, project_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);
DROP TABLE IF EXISTS Project_Log; 
CREATE TABLE IF NOT EXISTS Project_Log (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT, 
    project_id INT,
    join_date DATETIME,
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);
DROP TABLE IF EXISTS Work_Log; 
CREATE TABLE IF NOT EXISTS Work_Log (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    project_id INT,
    update_time DATETIME, 
    old_hours INT,
    new_hours INT,
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)  
);
--
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
--
INSERT INTO Department (name, manager_id) 
VALUES
  ('Marketing', 1),
  ('Sales', 2),
  ('Dev', 3),
  ('Operations', 4),
  ('Finance', 5);

INSERT INTO Employee (name, code, address, salary, gender, birth_date, start_date, department_id, manager_id)
VALUES
  ('AAA', 'E001', '123 ABC', 5000000, 'Male', '1990-01-01', '2020-01-01', 1, 4),
  ('BBB', 'E002', '456 DEF', 4000000, 'Female', '1995-05-05', '2021-05-01', 2, 1),
  ('CCC', 'E003', '789 GHI', 4500000, 'Male', '1992-08-15', '2022-01-15', 3, 2),  
  ('DDD', 'E004', '135 JKL', 6500000, 'Female', '2000-11-03', '2020-06-01', 1, 1),
  ('EEE', 'E005', '246 MNO', 9000000, 'Male', '1989-09-12', '2018-04-01', 4, 3);

  
INSERT INTO Project (name, code, start_date, end_date, revenue, manager_id)  
VALUES
  ('Project X', 'P001', '2023-01-01', '2023-06-01', 25000000, 1),
  ('Project Y', 'P002', '2022-05-15', '2023-02-28', 45000000, 3),
  ('Project Z', 'P003', '2023-03-01', 2023-01-03, 55000000, 4),
  ('Website', 'P004', '2023-04-01', NULL, NULL, 5),
  ('Mobile App', 'P005', '2023-10-01', NULL, NULL, 2);
 
 INSERT INTO Works_On (employee_id, project_id, hours)
VALUES
  (1, 1, 100), 
  (2, 1, 80),
  (3, 2, 90),
  (4, 3, 100),
  (5, 4, 60);
--

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm 2023 có số tiền thu được trên 4000000 triệu VND
--

SELECT *
FROM Project
WHERE YEAR(start_date) = 2023
  AND revenue > 40000000;
  
-- 2. Liệt kê các nhân viên đã tham gia hơn 80 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
--

SELECT e.name, p.name AS project, w.hours 
FROM Employee e JOIN Works_on w ON e.id = w.employee_id 
             JOIN Project p ON w.project_id = p.id
WHERE w.hours > 80;


-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
--


SELECT e1.name, e1.salary 
FROM Employee e1 JOIN Employee e2
ON e1.manager_id = e2.id
WHERE e1.salary >= e2.salary;


-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 5
--
SELECT d.name
FROM Department d JOIN Employee e
ON d.id = e.department_id
GROUP BY d.id
HAVING COUNT(e.id) > 5;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 3 năm
--


SELECT e.name
FROM Employee e
WHERE YEAR(CURRENT_DATE()) - YEAR(e.start_date) > 3;


-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án


SELECT e.name
FROM Employee e JOIN Department d
ON e.id = d.manager_id
JOIN Project p
ON e.id = p.manager_id;


-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
--

SELECT e.name, COUNT(p.id) AS num_projects 
FROM Employee e JOIN Project p
ON e.id = p.manager_id
GROUP BY e.id
HAVING COUNT(p.id) > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
--

-- Hình thức nộp bài
-- + Nhánh nộp bài: lesson16-exam
-- + File nộp bài: lesson16-hoten.sql → copy đề và thực hiện các lệnh sql ngay phía dưới từng câu hỏi
-- + Thời gian làm bài: 120 phút