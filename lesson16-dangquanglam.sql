CREATE DATABASE LESSON16EXAM;

USE LESSON16EXAM;

-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
-- Phòng ban (Department)
-- Attributes: DepartmentCode (PK), DepartmentName, ManagerEmployeeID (FK), ReceiptDate
-- Relationships: Mối quan hệ với Employee thông qua ManagerEmployeeID

-- Nhân viên (Employee):
-- Attributes: EmployeeID (PK), FullName, Address, Salary, Gender, BirthDate, JobDate, DepartmentCode (FK), ManagerEmployeeID (FK)
-- Relationships: Mối quan hệ với Department thông qua DepartmentCode, Mối quan hệ với Employee (quản lý/giám sát) thông qua ManagerEmployeeID

-- Dự án (Project):
-- Attributes: ProjectCode (PK), ProjectName, StartDate, EndDate, RevenueProject, ManagerEmployeeID (FK)
-- Relationships: Mối quan hệ với Employee thông qua ManagerEmployeeID

-- Tham gia dự án (ProjectParticipation):
-- Attributes: EmployeeID (PK, FK), ProjectCode (PK, FK), HoursWork
-- Relationships: Mối quan hệ với Employee thông qua EmployeeID, Mối quan hệ với Project thông qua ProjectCode
SET FOREIGN_KEY_CHECKS = 0;
-- PHÒNG BAN: Mỗi phòng ban có một tên duy nhất, một mã số duy nhất, một nhân viên cụ thể quản lý phòng đó.
CREATE TABLE Department (
    DepartmentCode VARCHAR(50) PRIMARY KEY,
    DepartmentName VARCHAR(255),
    ManagerEmployeeID INT,
    ReceiptDate DATE,
    CONSTRAINT FK_Department_ManagerEmployeeID FOREIGN KEY (ManagerEmployeeID) REFERENCES Employee(EmployeeID)
);

-- NHÂN VIÊN: Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FullName VARCHAR(255),
    Address VARCHAR(255),
    Salary DECIMAL(10, 2),
    Gender VARCHAR(10),
    BirthDate DATE,
    JobDate DATE,
    DepartmentCode VARCHAR(50),
    ManagerEmployeeID INT,
    CONSTRAINT FK_Employee_DepartmentCode FOREIGN KEY (DepartmentCode) REFERENCES Department(DepartmentCode),
    CONSTRAINT FK_Employee_ManagerEmployeeID  FOREIGN KEY (ManagerEmployeeID) REFERENCES Employee(EmployeeID)
);

-- DỰ ÁN : Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
CREATE TABLE Project (
    ProjectCode VARCHAR(50) PRIMARY KEY,
    ProjectName VARCHAR(255),
    StartDate DATE,
    EndDate DATE,
    RevenueProject DECIMAL(10, 2),
    ManagerEmployeeID INT,
    CONSTRAINT FK_Project_ManagerEmployeeID FOREIGN KEY (ManagerEmployeeID) REFERENCES Employee(EmployeeID)
);

CREATE TABLE ProjectParticipation (
    EmployeeID INT,
    ProjectCode VARCHAR(50),
    HoursWork INT,
    PRIMARY KEY (EmployeeID, ProjectCode),
	CONSTRAINT FK_ProjectParticipation_EmployeeID FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_ProjectParticipation_ProjectCode FOREIGN KEY (ProjectCode) REFERENCES Project(ProjectCode)
);
SET FOREIGN_KEY_CHECKS = 1;
--
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO Department (DepartmentCode, DepartmentName, ManagerEmployeeID, ReceiptDate)
VALUES ('IT', 'Information Technology', 101, '2023-11-01'),
       ('HR', 'Human Resources', 102, '2023-11-02'),
       ('SALES', 'Sales Department', 103, '2023-11-03'),
       ('TEST', 'Testting', 104, '2023-11-04'),
       ('BA', 'Bussiness Analyst', 105, '2023-11-05');

INSERT INTO Employee (EmployeeID, FullName, Address, Salary, Gender, BirthDate, JobDate, DepartmentCode, ManagerEmployeeID)
VALUES (101, 'John Doe', '123 Main St', 60000, 'Male', '1990-05-15', '2023-01-01', 'IT', NULL),
       (102, 'Jane Smith', '456 Oak St', 55000, 'Female', '1988-08-20', '2023-02-01', 'HR', 101),
       (103, 'Bob Johnson', '789 Elm St', 70000, 'Male', '1995-12-10', '2023-03-01', 'SALES', 102),
       (104, 'Alice Brown', '987 Pine St', 75000, 'Female', '1992-06-25', '2023-04-01', 'ENG', 101),
       (105, 'Charlie Wilson', '654 Birch St', 80000, 'Male', '1987-03-05', '2023-05-01', 'FIN', 103);

INSERT INTO Project (ProjectCode, ProjectName, StartDate, EndDate, RevenueProject, ManagerEmployeeID)
VALUES ('P001', 'Project A', '2023-03-01', '2023-06-30', 100000, 101),
       ('P002', 'Project B', '2023-04-01', '2023-07-31', 80000, 102),
       ('P003', 'Project C', '2023-05-01', '2023-08-31', 120000, 103),
       ('P004', 'Project D', '2023-06-01', '2023-09-30', 90000, 104),
       ('P005', 'Project E', '2023-07-01', '2023-10-31', 110000, 105);

INSERT INTO ProjectParticipation (EmployeeID, ProjectCode, HoursWork)
VALUES (101, 'P001', 80),
       (102, 'P001', 60),
       (103, 'P003', 40),
       (104, 'P002', 70),
       (105, 'P005', 90);
--

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM project
WHERE YEAR(StartDate) = 2023  AND RevenueProject > 100000;
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT EMP.FullName, PRO.ProjectCode, PRO.HoursWork
FROM employee AS EMP
JOIN projectParticipation AS PRO
ON EMP.EmployeeID = PRO.EmployeeID
WHERE PRO.HoursWork > 40;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT e1.FullName, e1.Salary
FROM employee e1
JOIN employee e2 
ON e1.ManagerEmployeeID = e2.EmployeeID
WHERE e1.Salary >= e2.Salary;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT department.DepartmentCode, department.DepartmentName, COUNT(employee.EmployeeID) AS EmployeeCount
FROM employee
JOIN department ON department.DepartmentCode = employee.DepartmentCode
GROUP BY department.DepartmentCode, department.DepartmentName
HAVING COUNT(employee.EmployeeID) >= 1;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT *
FROM employee
WHERE DATEDIFF(CURRENT_DATE, JobDate) > 3 * 365;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.FullName, d.DepartmentName, p.ProjectName
FROM employee e
JOIN department d ON e.EmployeeID = d.ManagerEmployeeID
JOIN project p ON e.EmployeeID = p.ManagerEmployeeID;
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT e.EmployeeID, e.FullName, COUNT(p.ProjectCode) AS NumberOfProjects
FROM employee e
JOIN project p ON e.EmployeeID = p.ManagerEmployeeID
GROUP BY e.EmployeeID, e.FullName
HAVING COUNT(p.ProjectCode) >= 2;
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
CREATE TABLE LogProjectParticipation (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID INT,
    ProjectCode VARCHAR(50),
    JoinTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ProjectCode) REFERENCES Project(ProjectCode)
);

CREATE TRIGGER AddLogProjectParticipation
AFTER INSERT ON ProjectParticipation
FOR EACH ROW
INSERT INTO LogProjectParticipation (EmployeeID, ProjectCode) 
VALUES (NEW.EmployeeID, NEW.ProjectCode);


CREATE TABLE LogHoursUpdate (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID INT,
    ProjectCode VARCHAR(50),
    HoursWorkOld INT,
    HoursWorkNew INT,
    UpdateTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ProjectCode) REFERENCES Project(ProjectCode)
);

CREATE TRIGGER UpdateLogHours
AFTER UPDATE ON ProjectParticipation
FOR EACH ROW
INSERT INTO LogHoursUpdate (EmployeeID, ProjectCode, HoursWorkOld, HoursWorkNew)
VALUES (NEW.EmployeeID, NEW.ProjectCode, OLD.HoursWork, NEW.HoursWork);
-- Hình thức nộp bài
-- + Nhánh nộp bài: lesson16-exam
-- + File nộp bài: lesson16-hoten.sql → copy đề và thực hiện các lệnh sql ngay phía dưới từng câu hỏi
-- + Thời gian làm bài: 120 phút