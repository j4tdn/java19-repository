-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
   SELECT ProjectName, StartDate, EndDate, Revenue
	FROM Projects
	WHERE YEAR(StartDate) = 2021 AND Revenue > 150000.00;
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT E.FullName, W.ProjectID, W.HoursWorked
FROM Employees E
JOIN WorkOn W ON E.EmployeeID = W.EmployeeID
WHERE W.HoursWorked > 40;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT E.FullName, E.Salary
FROM Employees E
JOIN Employees M ON E.ManagerID = M.EmployeeID
WHERE E.Salary >= M.Salary;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT D.DepartmentName, COUNT(E.EmployeeID) AS EmployeeCount
FROM Departments D
JOIN Employees E ON D.DepartmentID = E.DepartmentID
GROUP BY D.DepartmentName
HAVING COUNT(E.EmployeeID) > 2;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT E.FullName, E.DateJoined
FROM Employees E
WHERE YEAR(E.DateJoined) < YEAR(NOW()) - 1;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT E.EmployeeID, E.FullName
FROM Employees E
JOIN Departments D ON E.DepartmentID = D.DepartmentID
JOIN Projects P ON E.EmployeeID = P.ManagerID
WHERE E.EmployeeID = E.ManagerID
-- 7. Liệt kê các nhân viên quản lý nhiều có nhiều hơn 1 dự án
SELECT E.FullName
FROM Employees E
JOIN Projects P ON E.EmployeeID = P.ManagerID
GROUP BY E.FullName
HAVING COUNT(P.ProjectID) > 1;
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để biết nhân viên đó tham gia vào dự án vào thời gian nào Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật