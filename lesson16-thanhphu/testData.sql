-- Viết các lệnh để tạo dữ liệu kiểm thử cho dự án

SET FOREIGN_KEY_CHECKS = 1;

-- Data for table Departments
INSERT INTO Departments (DepartmentID, DepartmentName)
VALUES (1, 'Sales'),
       (2, 'Marketing'),
       (3, 'Finance'),
       (4, 'Human Resources'),
       (5, 'Operations');

-- Data for table Employees
INSERT INTO Employees (EmployeeID, DepartmentID, ManagerID, FullName, Address, Salary, Gender, DateOfBirth, DateJoined)
VALUES (1, 1, NULL, 'Nguyen Van A', 'Da Nang', 5000.00, 'Male', '1990-01-01', '2021-01-01'),
       (2, 1, 1, 'Le Van B', 'Hue', 4000.00, 'Female', '1995-02-15', '2021-02-15'),
       (3, 2, 1, 'Tran Van C', 'Quang Nam', 6000.00, 'Male', '1988-07-10', '2021-03-01'),
       (4, 2, 2, 'Nguyen Van D', 'Quang Nam', 4500.00, 'Female', '1992-04-20', '2021-04-15'),
       (5, 3, 1, 'Tran Thi E', 'Da Nang', 5500.00, 'Male', '1985-11-30', '2021-05-01');

-- Data for table Projects
INSERT INTO Projects (ProjectID, ProjectName, StartDate, EndDate, Revenue)
VALUES (1, 'Project A', '2021-01-01', '2021-06-30', 100000.00),
       (2, 'Project B', '2021-03-15', '2021-09-30', 150000.00),
       (3, 'Project C', '2021-05-01', '2021-12-31', 200000.00),
       (4, 'Project D', '2021-07-01', '2022-03-31', 180000.00),
       (5, 'Project E', '2021-09-15', '2022-06-30', 250000.00);

-- Data for table WorkOn
INSERT INTO WorkOn (EmployeeID, ProjectID, HoursWorked)
VALUES (1, 1, 40),
       (2, 1, 35),
       (3, 2, 42),
       (4, 2, 38),
       (5, 3, 45);
       
UPDATE Projects
SET ManagerID = 
    CASE 
        WHEN ProjectID IN (1, 2) THEN 1
        WHEN ProjectID IN (3, 4) THEN 2
        WHEN ProjectID = 5 THEN 3
    END
WHERE ProjectID IN (1, 2, 3, 4, 5)