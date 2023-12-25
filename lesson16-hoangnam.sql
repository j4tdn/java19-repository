CREATE DATABASE JAVA19_EXAM CHAR SET utf8mb4;

-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
USE JAVA19_EXAM;

CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FullName VARCHAR(255),
    Address VARCHAR(255),
    Salary DECIMAL(10, 2),
    Gender BIT NOT NULL DEFAULT 0,
    DateOfBirth DATE,
    DateOfJoining DATE,
    DepartmentID INT
);

CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(255),
    DepartmentCode VARCHAR(20),
    HeadEmployeeID INT
);

ALTER TABLE Employee
ADD CONSTRAINT FK_Employee_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID);

ALTER TABLE Department
ADD CONSTRAINT FK_Department_HeadEmployee FOREIGN KEY (HeadEmployeeID) REFERENCES Employee(EmployeeID);

CREATE TABLE Project (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(255),
    ProjectCode VARCHAR(20),
    StartDate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    EndDate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    TotalRevenue DECIMAL(15, 2),
    ProjectManagerID INT,
    CONSTRAINT FK_Project_ProjectManager FOREIGN KEY (ProjectManagerID) REFERENCES Employee(EmployeeID)
);


CREATE TABLE WorksOn ( 	-- giữa employee và project (n-n)
    EmployeeID INT,
    ProjectID INT,
    HoursWorked INT,
    PRIMARY KEY (EmployeeID, ProjectID),
    CONSTRAINT FK_WorksOn_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_WorksOn_Project FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)
);

CREATE TABLE Supervises ( 	-- giám sát  giữa employee và employee để quản lý dự án (1-n)
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT,
    CONSTRAINT FK_Supervises_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_Supervises_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Manages (		-- quản lý	giữa employee và department 	(1-1)
    EmployeeID INT PRIMARY KEY,
    DepartmentID INT,
    StartDate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_Manages_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_Manages_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

CREATE TABLE Directs (		-- chỉ đạo	giữa employee và project	(1-n)
    EmployeeID INT PRIMARY KEY,
    ProjectID INT,
    CONSTRAINT FK_Directs_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    CONSTRAINT FK_Directs_Project FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án (Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu)
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO Employee (EmployeeID, FullName, Address, Salary, Gender, DateOfBirth, DateOfJoining, DepartmentID)
VALUES
(4, 'Nguyễn Thị Ánh Dương', '123 Đường ABC', 52000.00, 0, '1992-04-12', '2017-05-20', 3),
(5, 'Trần Văn Anh Tuấn', '456 Đường XYZ', 48000.00, 1, '1988-10-25', '2016-09-10', 2),
(6, 'Phạm Minh Tuấn', '789 Đường LMN', 60000.00, 0, '1993-07-08', '2020-03-05', 1),
(7, 'Đặng Hồng Phúc', '111 Đường DEF', 55000.00, 1, '1995-02-18', '2019-12-01', 3),
(8, 'Ngô Thị Hồng Lý', '222 Đường GHI', 58000.00, 0, '1990-09-30', '2018-06-15', 2);

INSERT INTO Employee (EmployeeID, FullName, Address, Salary, Gender, DateOfBirth, DateOfJoining, DepartmentID)
VALUES
  (11, 'Nguyễn Văn Cường', '555 Đường UVW', 55000.00, 1, '1990-03-22', '2018-04-15', 2),
  (12, 'Trần Thị Bích Ngọc', '666 Đường XYZ', 52000.00, 0, '1993-09-18', '2019-07-01', 3),
  (13, 'Lê Văn Thành', '777 Đường ABC', 60000.00, 1, '1985-12-10', '2017-08-10', 1),
  (14, 'Phạm Thị Diệu Linh', '888 Đường LMN', 48000.00, 0, '1996-02-28', '2020-06-25', 2),
  (15, 'Đỗ Văn Hiếu', '999 Đường DEF', 58000.00, 1, '1987-07-05', '2016-03-12', 1),
  (16, 'Nguyễn Thị Hồng', '101 Đường GHI', 51000.00, 0, '1994-04-05', '2021-11-30', 3),
  (17, 'Trương Văn Dũng', '202 Đường JKJ', 53000.00, 1, '1989-01-15', '2018-02-20', 2),
  (18, 'Phan Thị Hương', '303 Đường LMN', 49000.00, 0, '1992-08-20', '2017-09-05', 1),
  (19, 'Lê Văn Minh', '404 Đường OPQ', 56000.00, 1, '1986-06-30', '2019-04-10', 3),
  (20, 'Nguyễn Thị Hạnh', '505 Đường UVW', 54000.00, 0, '1991-03-25', '2016-12-15', 2);

INSERT INTO Department (DepartmentID, DepartmentName, DepartmentCode, HeadEmployeeID)
VALUES
(4, 'Bộ Phận Tiếp Thị', 'MARK001', 5),
(5, 'Bộ Phận Tài Chính', 'FIN001', 7),
(6, 'Bộ Phận Pháp Lý', 'LEGAL001', 4),
(7, 'Bộ Phận Nghiên Cứu và Phát Triển', 'R&D001', 6),
(8, 'Bộ Phận Hỗ Trợ Khách Hàng', 'CS001', 4);


INSERT INTO Project (ProjectID, ProjectName, ProjectCode, StartDate, EndDate, TotalRevenue, ProjectManagerID)
VALUES
(4, 'Dự Án D', 'PROJ004', '2022-04-01', '2022-09-30', 90000.00, 4),
(5, 'Dự Án E', 'PROJ005', '2022-05-15', '2022-11-30', 75000.00, 5),
(6, 'Dự Án F', 'PROJ006', '2022-06-10', '2023-03-31', 110000.00, 6),
(7, 'Dự Án G', 'PROJ007', '2022-07-05', '2023-01-31', 85000.00, 7),
(8, 'Dự Án H', 'PROJ008', '2022-08-20', '2023-06-30', 120000.00, 8);

INSERT INTO WorksOn (EmployeeID, ProjectID, HoursWorked)
VALUES
(4, 4, 25),
(5, 4, 30),
(6, 5, 35),
(7, 5, 40),
(8, 6, 28);

INSERT INTO Supervises (EmployeeID, DepartmentID)
VALUES
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8);

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm 2023 có số tiền thu được trên 75000 triệu VND
SELECT *
FROM Project
WHERE (YEAR(StartDate) = 2023 OR YEAR(EndDate) = 2023)
    AND TotalRevenue > 75000;
    
-- 2. Liệt kê các nhân viên đã tham gia hơn 30 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi 
-- dự án mà nhân viên tham gia
SELECT E.FullName, W.EmployeeID, W.ProjectID, W.HoursWorked
FROM WorksOn W
JOIN Employee E ON W.EmployeeID = E.EmployeeID
WHERE W.HoursWorked > 30;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó

SELECT E1.EmployeeID, E1.FullName, E1.Salary, E1.DepartmentID
FROM Employee E1
WHERE EXISTS (
    SELECT 1
    FROM Supervises S
    JOIN Employee E2 ON S.EmployeeID = E2.EmployeeID
    WHERE E1.EmployeeID = S.EmployeeID
    AND E1.Salary >= IFNULL(E2.Salary, 0)
);

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 1 ^-^
SELECT D.DepartmentID, D.DepartmentName, COUNT(E.EmployeeID) AS EmployeeCount
FROM Department D
LEFT JOIN Employee E ON D.DepartmentID = E.DepartmentID
GROUP BY D.DepartmentID, D.DepartmentName
HAVING EmployeeCount > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 1 năm
SELECT *
FROM Employee
WHERE DATEDIFF(CURDATE(), DateOfJoining) > 365;


-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT E.EmployeeID, E.FullName, COUNT(P.ProjectID) AS ManagedProjects
FROM Employee E
JOIN Project P ON E.EmployeeID = P.ProjectManagerID
GROUP BY E.EmployeeID, E.FullName
HAVING ManagedProjects > 1;






