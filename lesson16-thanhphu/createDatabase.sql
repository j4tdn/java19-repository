-- Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên

-- create database
-- CREATE DATABASE MANAGEMENT_COMPANY CHAR SET utf8mb4;

USE MANAGEMENT_COMPANY;

-- Departments
DROP TABLE IF EXISTS DEPARTMENTS;
CREATE TABLE IF NOT EXISTS DEPARTMENTS
(
	DepartmentID INT PRIMARY KEY,
	DepartmentName VARCHAR(255),
	ManagerID INT
);


-- Employees
DROP TABLE IF EXISTS EMPLOYEES;
CREATE TABLE IF NOT EXISTS EMPLOYEES
(
	EmployeeID INT PRIMARY KEY,
	DepartmentID INT,
	ProjectID INT,
	ManagerID INT,
	FullName VARCHAR(255),
	Address VARCHAR(255),
	Salary DECIMAL(10, 2),
	Gender VARCHAR(10),
	DateOfBirth DATE,
	DateJoined DATE,
	FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID),
	FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID),
	FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);

-- Projects
DROP TABLE IF EXISTS PROJECTS;
CREATE TABLE IF NOT EXISTS PROJECTS
(
	ProjectID INT PRIMARY KEY,
	ProjectName VARCHAR(255),
	StartDate DATE,
	EndDate DATE,
	Revenue DECIMAL(10, 2)
);
ALTER TABLE Projects
ADD COLUMN ManagerID INT;

ALTER TABLE Projects
ADD CONSTRAINT FK_Project_Manager
FOREIGN KEY (ManagerID)
REFERENCES Employees(EmployeeID);

-- WorkOn
DROP TABLE IF EXISTS WORKON;
CREATE TABLE IF NOT EXISTS WORKON
(
	EmployeeID INT,
	ProjectID INT,
	HoursWorked INT,
	FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
	FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID),
	PRIMARY KEY (EmployeeID, ProjectID)
);