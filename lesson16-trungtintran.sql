-- Phần A. Viết các lệnh để xây dựng mô hình thực thể kết hợp (ER) dựa vào mô tả trên
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Gender`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Gender` (
  `GenderId` INT NOT NULL,
  `GenderName` VARCHAR(256) NULL,
  PRIMARY KEY (`GenderId`),
  UNIQUE INDEX `GenderId_UNIQUE` (`GenderId` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Employee` (
  `EmployeeId` INT NOT NULL,
  `FullName` VARCHAR(256) NULL,
  `Address` VARCHAR(256) NULL,
  `Salary` DOUBLE NULL,
  `GenderId` INT NULL,
  `DateOfBirth` DATETIME NULL,
  `JoiningDate` DATETIME NULL,
  `SupervisorId` INT NULL,
  `DepartmentId` INT NOT NULL,
  UNIQUE INDEX `EmployeeId_UNIQUE` (`EmployeeId` ASC) VISIBLE,
  PRIMARY KEY (`EmployeeId`),
  CONSTRAINT `fk_Employee_Department1`
    FOREIGN KEY (`DepartmentId`)
    REFERENCES `mydb`.`Department` (`DepartmentId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employee_Gender1`
    FOREIGN KEY (`GenderId`)
    REFERENCES `mydb`.`Gender` (`GenderId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employee_Employee`
    FOREIGN KEY (`SupervisorId`)
    REFERENCES `mydb`.`Employee` (`EmployeeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Department` (
  `DepartmentId` INT NOT NULL,
  `DepartmentName` VARCHAR(256) NULL,
  `DepartmentLeaderId` INT NULL,
  `DepartmentLeaderDebutDate` DATETIME NULL,
  PRIMARY KEY (`DepartmentId`),
  UNIQUE INDEX `DepartmentId_UNIQUE` (`DepartmentId` ASC) VISIBLE,
  UNIQUE INDEX `DepartmentName_UNIQUE` (`DepartmentName` ASC) VISIBLE,
  INDEX `fk_Employee_Department_idx` (`DepartmentLeaderId` ASC) VISIBLE,
  CONSTRAINT `fk_Employee_Department`
    FOREIGN KEY (`DepartmentLeaderId`)
    REFERENCES `mydb`.`Employee` (`EmployeeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Project` (
  `ProjectId` INT NOT NULL,
  `ProjectName` VARCHAR(256) NULL,
  `StartDate` DATETIME NULL,
  `EndDate` DATETIME NULL,
  `ProjectRevenue` DOUBLE NULL,
  `ProjectManagerId` INT NULL,
  PRIMARY KEY (`ProjectId`),
  UNIQUE INDEX `ProjectId_UNIQUE` (`ProjectId` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ProjectDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ProjectDetail` (
  `ProjectManagerId` INT NOT NULL,
  `ProjectId` INT NOT NULL,
  `MemberId` INT NOT NULL,
  `WorkingHours` FLOAT NULL,
  PRIMARY KEY (`ProjectManagerId`, `ProjectId`),
  INDEX `fk_Employee_has_Project_Project1_idx` (`ProjectId` ASC) VISIBLE,
  INDEX `fk_Employee_has_Project_Employee1_idx` (`ProjectManagerId` ASC) VISIBLE,
  INDEX `fk_ProjectDetail_Employee2_idx` (`MemberId` ASC) VISIBLE,
  CONSTRAINT `fk_ProjectDetail_Employee1`
    FOREIGN KEY (`ProjectManagerId`)
    REFERENCES `mydb`.`Employee` (`EmployeeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProjectDetail_Project`
    FOREIGN KEY (`ProjectId`)
    REFERENCES `mydb`.`Project` (`ProjectId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProjectDetail_Employee2`
    FOREIGN KEY (`MemberId`)
    REFERENCES `mydb`.`Employee` (`EmployeeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

-- Inserting 5 records into Gender table
INSERT INTO `mydb`.`Gender` (`GenderId`, `GenderName`)
VALUES
(1, 'Male'),
(2, 'Female'),
(3, 'LGBT1'),
(4, 'LGBT2'),
(5, 'LGBT3');

-- Inserting 5 records into Employee table
INSERT INTO `mydb`.`Employee` (`EmployeeId`, `FullName`, `Address`, `Salary`, `GenderId`, `DateOfBirth`, `JoiningDate`, `SupervisorId`, `DepartmentId`)
VALUES
(1, 'John Doe', '123 Main St', 60000.00, 1, '1990-05-15', '2015-01-10', NULL, 1),
(2, 'Jane Smith', '456 Oak St', 70000.00, 2, '1988-08-22', '2016-03-05', 1, 2),
(3, 'Bob Johnson', '789 Pine St', 80000.00, 1, '1995-02-28', '2017-06-20', 1, 1),
(4, 'Alice Brown', '101 Elm St', 75000.00, 2, '1992-11-10', '2018-09-15', 2, 3),
(5, 'Chris Lee', '202 Cedar St', 90000.00, 3, '1985-07-03', '2019-12-01', 1, 2);

-- Inserting 5 records into Department table
INSERT INTO `mydb`.`Department` (`DepartmentId`, `DepartmentName`, `DepartmentLeaderId`, `DepartmentLeaderDebutDate`)
VALUES
(1, 'HR', 3, '2017-06-20'),
(2, 'Finance', 2, '2016-03-05'),
(3, 'IT', 5, '2019-12-01'),
(4, 'Marketing', NULL, NULL),
(5, 'Operations', 1, '2015-01-10');

-- Inserting 5 records into Project table
INSERT INTO `mydb`.`Project` (`ProjectId`, `ProjectName`, `StartDate`, `EndDate`, `ProjectRevenue`, `ProjectManagerId`)
VALUES
(1, 'Project X', '2023-01-01', '2023-05-31', 50000000.00, 1),
(2, 'Project Y', '2023-02-15', '2023-06-30', 75000000.00, 2),
(3, 'Project Z', '2023-03-10', '2023-08-15', 100000000.00, 3),
(4, 'Project W', '2023-04-20', '2023-10-31', 120000000.00, 4),
(5, 'Project V', '2023-06-01', '2024-01-15', 80000000.00, 5);

-- Inserting 5 records into ProjectDetail table
INSERT INTO `mydb`.`ProjectDetail` (`ProjectManagerId`, `ProjectId`, `MemberId`, `WorkingHours`)
VALUES
(1, 1, 2, 40),
(2, 2, 3, 35),
(3, 3, 1, 45),
(4, 4, 5, 30),
(5, 5, 4, 50);




--
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm 2023 có số tiền thu được trên 50000000 triệu VND
SELECT *
FROM `mydb`.`Project`
WHERE YEAR(`StartDate`) = 2023
  AND `ProjectRevenue` > 50000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia

SELECT
    E.EmployeeId,
    E.FullName,
    PD.ProjectId,
    P.ProjectName,
    PD.WorkingHours
FROM
    mydb.Employee E
JOIN
    mydb.ProjectDetail PD ON E.EmployeeId = PD.MemberId
JOIN
    mydb.Project P ON PD.ProjectId = P.ProjectId
WHERE
    PD.WorkingHours > 40;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT
    E1.EmployeeId ,
    E1.FullName ,
    E1.Salary ,
    E2.EmployeeId ,
    E2.FullName ,
    E2.Salary
FROM
    mydb.Employee E1
JOIN
    mydb.Employee E2 ON E1.SupervisorId = E2.EmployeeId
WHERE
    E1.Salary >= E2.Salary;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 2
SELECT
    D.DepartmentId,
    D.DepartmentName,
    COUNT(E.EmployeeId) AS EmployeeCount
FROM
    mydb.Department D
JOIN
    mydb.Employee E ON D.DepartmentId = E.DepartmentId
GROUP BY
    D.DepartmentId, D.DepartmentName
HAVING
    EmployeeCount > 2;


-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 2 năm 
SELECT
    EmployeeId,
    FullName,
    JoiningDate,
    DATEDIFF(NOW(), JoiningDate) AS YearsWorked
FROM
    mydb.Employee
WHERE
    DATEDIFF(NOW(), JoiningDate) > 365 * 2;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.*
FROM mydb.Employee e
JOIN mydb.Department d ON e.EmployeeId = d.DepartmentLeaderId
JOIN mydb.ProjectDetail pd ON e.EmployeeId = pd.ProjectManagerId

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT e.EmployeeId, e.FullName, COUNT(pd.ProjectId) AS NumProjectsManaged
FROM mydb.Employee e
JOIN mydb.ProjectDetail pd ON e.EmployeeId = pd.ProjectManagerId
GROUP BY e.EmployeeId, e.FullName
HAVING NumProjectsManaged > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi 
nào, số giờ tham gia cũ, số giờ tham gia mới
Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhậ