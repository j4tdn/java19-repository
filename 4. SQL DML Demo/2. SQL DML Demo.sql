-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- -- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi

-- -- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM ITEM_GROUP;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    -- Truy vấn lồng
    -- Thực thi câu lệnh truy vấn con trước, được kết quả thực câu lệnh cha
    -- oralce: limit in IN clause is 1000 values
SELECT * 
 FROM ITEM
WHERE ITEM_GROUP_ID IN (SELECT ID 
						FROM ITEM_GROUP 
                        WHERE `NAME`= 'Thắt lưng');
-- Truy vấn lồng song song
-- Duyệt từng phần tử bên bảng cha
-- Lấy ra các phần tử ở bảng cha khi dòng hiện tại thỏa mãn điều kiện trong bảng con
-- Mệnh đề SELECT trong bảng con không quan trong, SELECT bất kỳ column nào                 
SELECT *
 FROM ITEM
 WHERE EXISTS (SELECT *
                 FROM ITEM_GROUP
                 WHERE `NAME`= 'Thắt lưng'
                 AND ITEM_GROUP.ID = ITEM.ITEM_GROUP_ID);
 
-- Top 5 mặt hàng có giá bán cao nhất
SELECT *
 FROM ITEM_DETAIL
 ORDER BY SALES_PRICE DESC
 LIMIT 5;
-- Neu truong mat hang gia ban cao thu 5 co gia trung voi cac mat hang khac, lay het
WITH CTE_TOP_5_SALES_PRICE AS
(
  SELECT SALES_PRICE
    FROM ITEM_DETAIL
    ORDER BY SALES_PRICE DESC, AMOUNT DESC
    LIMIT 5
)
SELECT *
  FROM ITEM_DETAIL
  WHERE EXISTS (SELECT *
				FROM CTE_TOP_5_SALES_PRICE top5
                WHERE ITEM_DETAIL.SALES_PRICE = top5.SALES_PRICE)
  ORDER BY SALES_PRICE;

-- 2. Đơn hàng
-- Được bán trong ngày 28/11/2019
-- default pattern yyyy-mm-dd
-- '15-02-2023' varchar
-- '2023-02-15' date
-- cast(CREATED_AT AS DATE) = '2023-02-15'
-- cast(CREATED_AT AS DATE) = str_to_date('15/02/2023','%d/%m/%Y')
SELECT *,
      cast(CREATED_AT AS DATE) created_at_date
  FROM `ORDER`
  WHERE cast(CREATED_AT AS DATE) = str_to_date('15/02/2023','%d/%m/%Y');
-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
  FROM `ORDER`
  WHERE cast(CREATED_AT AS DATE) BETWEEN '2023-08-01' AND '2023-09-30';
-- Được bán trong tháng 02/2023
SELECT *
  FROM `ORDER`
   WHERE MONTH(CREATED_AT) = 2
   AND YEAR(CREATED_AT) = 2023;
-- Được giao hàng tại Hòa Khánh

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *,
      SALES_PRICE * 0.77 PROMOTION_PRICE,
      ROUND(SALES_PRICE * 0.77, 2) ROUNDED_PROMOTION_PRICE
 FROM ITEM_DETAIL;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 15/02/2023
SELECT * FROM `ORDER` WHERE cast(CREATED_AT AS DATE) = '2023-02-15';
SELECT * FROM order_detail WHERE ORDER_ID IN (4, 5);
SELECT * FROM item_detail WHERE ID IN (5,11,24,39,41,46,56,69);
-- decimal(10,2)
SELECT *,
     CAST(SALES_PRICE * 0.8 AS DECIMAL(10,2)) ROUNDED_PROMOTION_PRICE
  FROM ITEM_DETAIL ITD
  WHERE ITD.ID IN (SELECT ODD.ITEM_DETAIL_ID
                     FROM ORDER_DETAIL ODD
                                       WHERE ODD.ORDER_ID IN (SELECT OD.ID
									                           FROM `ORDER` OD
                                                               ));

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT COLOR
  FROM ITEM;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 15/02/2023
WITH CTE_TABLE AS(
SELECT ITD.ITEM_ID ITEM_ID,
      CAST(CREATED_AT AS DATE) CREATED_DATETIME
FROM ITEM_DETAIL ITD
JOIN ORDER_DETAIL ODD
ON ITD.ID = ODD.ITEM_DETAIL_ID
JOIN `ORDER` OD
ON ODD.ORDER_ID = OD.ID
WHERE CAST(CREATED_AT AS DATE) = '2023-02-15')
SELECT *,
IT.`NAME`ITEM_NAME
FROM CTE_TABLE
JOIN ITEM IT
ON IT.ID = ITEM_ID;

-- 06:02:54	WITH CTE_TABLE AS( SELECT *,       CAST(CREATED_AT AS DATE) CREATED_DATETIME FROM ITEM_DETAIL ITD JOIN ORDER_DETAIL ODD ON ITD.ID = ODD.ITEM_DETAIL_ID JOIN `ORDER` OD ON ODD.ORDER_ID = OD.ID WHERE CAST(CREATED_AT AS DATE) = '2023-02-15') SELECT IT.ID ITEM_ID,        IT.`NAME` ITEM_NAME FROM ITEM IT JOIN CTE_TABLE CT ON IT.ID = CT.ITEM_ID	Error Code: 1060. Duplicate column name 'ID'	0.00041 sec


-- 8. Liệt kê các mặt hàng có giá bán từ 100-300

SELECT IT.ID ITEM_ID,
       IT.NAME ITEM_NAME,
       ITD.SALES_PRICE ITEM_SALES_PRICE
  FROM ITEM IT
JOIN ITEM_DETAIL ITD
ON IT.ID = ITD.ITEM_ID
WHERE SALES_PRICE BETWEEN 100 AND 300;
  
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT IT.ID,
       IT.`NAME`,
       IG.`NAME`ITEM_GROUP_NAME
  FROM ITEM IT
  JOIN ITEM_GROUP IG
  ON IT.ITEM_GROUP_ID = IG.ID
  WHERE IG.`NAME` IN ('Mũ','Thắt lưng');

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
  FROM `ORDER`
  WHERE DATE(CREATED_AT) IN ('2023-02-15','2023-09-07');
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * FROM ITEM_DETAIL;
SELECT ITD.ID ITEM_DETAIL_ID,
       IT.ID ITEM_ID,
       IT.`NAME` ITEM_NAME,
       ITD.SIZE_ID,
       ITD.SALES_PRICE
FROM ITEM_DETAIL ITD 
JOIN ITEM IT
   ON ITD.ITEM_ID = IT.ID
 ORDER BY ITD.SALES_PRICE DESC;

-- 11. Tim kich thuoc co gia ban lon nhat
-- sap xep theo giam dan
SELECT IT.ID,
	   IT.NAME,
       MAX(SALES_PRICE) MAX_SALES_PRICE
   FROM ITEM_DETAIL ITD
   JOIN ITEM IT
     ON IT.ID = ITD.ITEM_ID
GROUP BY IT.ID, IT.NAME
ORDER BY MAX(SALES_PRICE) DESC;
SELECT *
FROM ITEM_DETAIL ITD
JOIN SIZE SZ
  ON ITD.SIZE_ID = SZ.ID
  
 -- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * 
    FROM ITEM;
    
    
SELECT *
   FROM ITEM
   ORDER BY BUY_PRICE DESC;
  
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT 
       IT.ID,
       IT.NAME,
       IT.BUY_PRICE,
       IT.COLOR,
       ITD.SALES_PRICE
  FROM ITEM IT
  JOIN ITEM_DETAIL ITD
  ON IT.ID = ITD.ITEM_ID
  ORDER BY ITD.SALES_PRICE ASC, IT.BUY_PRICE DESC;


-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT *,
      sum(ITD.AMOUNT) ITEM_AMOUNT
FROM ITEM IT
JOIN ITEM_DETAIL ITD
ON IT.ID = ITD.ITEM_DETAIL
ORDER BY IT.ID, IT.NAME;

SELECT COUNT(*) as TOTAL_ITEMS
FROM ITEM_DETAIL;

-- Error Code: 1055. Expression #1 of SELECT list is not in GROUP BY clause and contains nonaggregated column 'java19_shoppingg.ITEM_DETAIL.ID' which is not functionally dependent on columns in GROUP BY clause; this is incompatible with sql_mode=only_full_group_by

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 16. Đếm tong số lượng các mặt hàng con lai theo từng loại hang
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

 
 SELECT itg.ID,
	   itg.NAME,
       sum(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;
 
SELECT itg.ID,
	   itg.NAME,
	   group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') DETAIL_INFO,
       sum(itd.AMOUNT) TOTAL_OF_ITEMS
  FROM item_group itg
  JOIN item it
    ON itg.ID = it.ITEM_GROUP_ID
  JOIN item_detail itd
    ON itd.ITEM_ID = it.ID
 GROUP BY itg.ID, itg.NAME;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT IT.ID ITEM_ID,
       IT.NAME ITEM_NAME,
       IG.ID ITEM_GROUP_ID,
       IG.NAME ITEM_GROUP_NAME,
       ITD.SALES_PRICE ITEM_SALES_PRICE
  FROM ITEM IT
  JOIN ITEM_DETAIL ITD
  ON IT.ID = ITD.ITEM_ID
  JOIN ITEM_GROUP IG
  ON IT.ITEM_GROUP_ID = IG.ID
  WHERE IG.NAME = 'Giày'
  ORDER BY ITD.SALES_PRICE DESC
  LIMIT 1;
-- Error Code: 1140. In aggregated query without GROUP BY, expression #1 of SELECT list contains nonaggregated column 'java19_shoppingg.IG.ID'; this is incompatible with sql_mode=only_full_group_by

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT IG.ID ITEM_GROUP_ID,
       IG.NAME ITEM_GROUP_NAME,
       MAX(ITD.SALES_PRICE) MAX_ITEM_SALES_PRICE
  FROM ITEM IT
  JOIN ITEM_DETAIL ITD
  ON IT.ID = ITD.ITEM_ID
  JOIN ITEM_GROUP IG
  ON IT.ITEM_GROUP_ID = IG.ID
  GROUP BY IG.ID, IG.NAME;
  

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
WITH CTE_ITEM_GROUP_DETAIL AS
(
	SELECT itg.ID        ITEM_GROUP_ID,
           itg.NAME      ITEM_GROUP_NAME,
           it.ID         ITEM_ID,
           it.NAME       ITEM_NAME,
           itd.ID        ITEM_DETAIL_ID,
           itd.SIZE_ID   SIZE,
           itd.AMOUNT    AMOUNT
	  FROM item_group itg
	  JOIN item it
		ON itg.ID = it.ITEM_GROUP_ID
	  JOIN item_detail itd
		ON it.ID = itd.ITEM_ID
),
CTE_ITEM_GROUP_MAX_AMOUNT AS 
(
	SELECT ITEM_GROUP_ID,
		   ITEM_GROUP_NAME,
		   MAX(AMOUNT) MAX_REMAINNING_ITEM_AMOUNT
	  FROM CTE_ITEM_GROUP_DETAIL
	  GROUP BY ITEM_GROUP_ID, ITEM_GROUP_NAME
)
SELECT *
  FROM CTE_ITEM_GROUP_DETAIL itg_d
  JOIN CTE_ITEM_GROUP_MAX_AMOUNT itg_max
    ON itg_d.ITEM_GROUP_ID = itg_max.ITEM_GROUP_ID
   AND itg_d.AMOUNT = itg_max.MAX_REMAINNING_ITEM_AMOUNT;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
 WITH SALES_ITEM AS (
	SELECT ITEM_ID
	  FROM item_detail itd
	  JOIN order_detail odd
		ON itd.ID = odd.ITEM_DETAIL_ID
	  JOIN `order` od
		ON odd.ORDER_ID = od.ID
	 WHERE cast(od.CREATED_AT AS DATE) = '2023-02-15'
)
SELECT *,
       '2023-02-15' SALES_DATE
  FROM item it
-- WHERE ID IN (SELECT ITEM_ID FROM SALES_ITEM);
-- WHERE EXISTS (SELECT 1 FROM SALES_ITEM WHERE it.ID = ITEM_ID);
  JOIN SALES_ITEM sit
    ON it.ID = sit.ITEM_ID
  WHERE it.ITEM_GROUP_ID = 2;

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
WITH SALES_ITEM AS(
     SELECT ITEM_ID
       FROM ITEM_DETAIL ITD
       JOIN ORDER_DETAIL ODD
         ON ITD.ID = ODD.ITEM_DETAIL_ID
	   JOIN `ORDER` OD
		 ON ODD.ORDER_ID = OD.ID
	   WHERE CAST(OD.CREATED_AT AS DATE) = '2023-02-15'
)
SELECT *,
      '2023-02-15' SALES_DATE
   FROM ITEM IT
   WHERE NOT EXISTS (SELECT 1 FROM SALES_ITEM WHERE IT.ID = ITEM_ID)
     AND EXISTS (SELECT 1 FROM ITEM_GROUP WHERE `NAME` LIKE '%Mũ%' AND IT.ITEM_GROUP_ID = ID);
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE BACKUP_ITEM_GROUP(
    ID INT,
    `NAME` VARCHAR(100)
);

INSERT INTO BACKUP_ITEM_GROUP(ID, NAME)
SELECT ID, NAME FROM ITEM_GROUP;

SELECT * FROM BACKUP_ITEM_GROUP;

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2
SELECT ITG.ID   ITEM_GROUP_ID,
	   ITG.NAME ITEM_GROUP_NAME,
       IT.ID    ITEM_ID,
       IT.NAME  ITEM_NAME,
       ITD.ID   ITEM_DETAIL_ID,
       ITD.SIZE_ID SIZE,
       ITD.AMOUNT  AMOUNT
  FROM ITEM_GROUP ITG
  JOIN ITEM IT
    ON ITG.ID = IT.ITEM_GROUP_ID
  JOIN ITEM_DETAIL ITD
    ON IT.ID = ITD.ITEM_ID
 WHERE ITG.NAME LIKE '%Áo%' OR ITG.NAME LIKE '%Quần%'
 ORDER BY ITD.AMOUNT DESC, ITD.ID DESC
 LIMIT 2;
 
 -- CACH 2
 WITH CTE_ITEMS AS
 (
 SELECT ITG.ID   ITEM_GROUP_ID,
        ITG.NAME ITEM_GROUP_NAME,
        IT.ID    ITEM_ID,
        IT.NAME  ITEM_NAME,
        ITD.ID   ITEM_DETAIL_ID,
        ITD.SIZE_ID  SIZE,
        ITD.AMOUNT AMOUNT
   FROM ITEM_GROUP ITG
   JOIN ITEM IT
     ON ITG.ID = IT.ITEM_GROUP_ID
   JOIN ITEM_DETAIL ITD
     ON IT.ID = ITD.ITEM_ID
   WHERE ITG.NAME LIKE '%Áo%' OR ITG.NAME LIKE '%Quần%'
 ),
 CTE_TOP_2_SHIRTS AS
 (
  SELECT * FROM CTE_ITEMS WHERE ITEM_GROUP_NAME LIKE '%Áo%' ORDER BY AMOUNT DESC, ITEM_DETAIL_ID DESC LIMIT 2
 ),
CTE_TOP_2_PANTS AS
(
  SELECT * FROM CTE_ITEMS WHERE ITEM_GROUP_NAME LIKE '%Quần%' ORDER BY AMOUNT DESC, ITEM_DETAIL_ID DESC LIMIT 2
)
SELECT * FROM CTE_TOP_2_SHIRTS
UNION
SELECT * FROM CTE_TOP_2_PANTS;

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100



