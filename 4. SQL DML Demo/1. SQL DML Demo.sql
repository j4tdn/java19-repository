-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--   Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--   MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng (item_group)
SELECT * FROM item_group;
    -- Mặt hàng(item) thuộc loại hàng(item_group) là 'Thắt lưng'
SELECT item.* FROM item JOIN item_group
on  item.ITEM_GROUP_ID = item_group.ID WHERE item_group.`NAME` = 'Thắt lưng';

SELECT * FROM item
WHERE ITEM_GROUP_ID IN (SELECT ID FROM item_group WHERE `NAME` = 'Thắt lưng');

SELECT * FROM item
WHERE EXISTS (SELECT * FROM item_group 
WHERE `NAME` = 'Thắt lưng' 
AND item.ITEM_GROUP_ID = item_group.ID);
    -- Top 5 mặt hàng kích cỡ(item_detail) có giá bán cao nhất
SELECT * FROM item_detail
ORDER BY SALES_PRICE DESC
LIMIT 5;
     -- Top 5 mặt hàng kích cỡ(item_detail) có giá bán cao nhất TRÙNG NHAU LẤY HẾT 
     
WITH CTE_SALES_PRICE AS
(
	SELECT * FROM item_detail
    ORDER BY SALES_PRICE DESC , AMOUNT DESC
    LIMIT 5
)

SELECT * FROM item_detail 
		-- WHERE SALES_PRICE IN (SELECT SALES_PRICE FROM CTE_SALES_PRICE);
		WHERE EXISTS (SELECT 43 FROM CTE_SALES_PRICE top5
        WHERE item_detail.SALES_PRICE = top5.SALES_PRICE)
ORDER BY SALES_PRICE;

-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
	-- cast(CREATED_AT AS DATE) = ('2023-02-15')
    -- cast(CREATED_AT AS DATE) = str_to_date('15/02/2023', '%d/%m/%Y')
SELECT *
	FROM `order`
	WHERE cast(CREATED_AT AS DATE) = str_to_date('15/02/2023', '%d/%m/%Y');
    
SELECT *
FROM `order`
WHERE DATE(CREATED_AT) = '2023-02-15';
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
	FROM `order`
    WHERE cast(CREATED_AT AS DATE) BETWEEN '2023-08-01' AND '2023-09-30';
    
    -- Được bán trong tháng 11/2019
SELECT *
	FROM `order`
    WHERE year(CREATED_AT) = 2023 AND month(CREATED_AT) = 09;
    -- Được giao hàng tại Hòa Khánh
SELECT *
	FROM `order`
    -- WHERE DELIVERY_ADDRESS = 'Địa chỉ 1';
    WHERE DELIVERY_ADDRESS LIKE '%Địa chỉ 1%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *,
	SALES_PRICE * 0.77 PROMOTION_PRICE,
    round(SALES_PRICE * 0.77, 2)  ROUNDED_PROMOTION_PRICE
    FROM item_detail;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 15/02/2023
SELECT * FROM `order` WHERE DATE(CREATED_AT) = '2023-02-15';
SELECT * FROM order_detail WHERE ORDER_ID IN (4, 5); -- item_detail 11,41,46,69,5,24,39,56
SELECT * FROM item_detail WHERE ID IN (11,41,46,69,5,24,39,56);

SELECT * ,
		round(SALES_PRICE * 0.77, 2)  AS ROUNDED_PROMOTION_PRICE
	FROM item_detail itd
    WHERE itd.ID IN (SELECT odd.ITEM_DETAIL_ID
						FROM order_detail odd
                        WHERE odd.ORDER_ID IN ( SELECT od.ID
												FROM `order` od
                                                WHERE DATE(CREATED_AT) = '2023-02-15')
											  );
-- cách 2 
SELECT ID.*,
		round(ID.SALES_PRICE * 0.77, 2)  AS ROUNDED_PROMOTION_PRICE
 FROM `order` AS O, order_detail AS OD, item_detail AS ID
WHERE O.ID = OD.ORDER_ID AND
	  OD.ITEM_DETAIL_ID = ID.ID AND
      DATE(CREATED_AT) = '2023-02-15';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT `NAME`, COLOR FROM item;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 2023-02-15
SELECT
    I.ID AS MaMH_ITEM,
    I.`NAME` AS TenMH_ITEM,
    O.CREATED_AT
FROM
    ITEM AS I,  item_detail ID, `order` AS O, `order_detail` AS OD
WHERE
	 I.ID = ID.ITEM_ID AND
     O.ID = OD.ORDER_ID AND
     OD.ITEM_DETAIL_ID = ID.ID AND
	 DATE(CREATED_AT) = '2023-02-15';

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * FROM item, item_detail
WHERE item.ID = item_detail.ITEM_ID AND
 SALES_PRICE BETWEEN 100 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT
    ID AS MaMH_ITEM,
    `NAME` AS TenMH_ITEM,
    ITEM_GROUP_ID
FROM
    ITEM
WHERE
    ITEM_GROUP_ID IN (
        SELECT ID
        FROM ITEM_GROUP
        WHERE `NAME` IN ('Mũ', 'Thắt lưng')
    );
    
-- cách 2:
SELECT
    I.ID AS MaMH_ITEM,
    I.`NAME` AS TenMH_ITEM,
    I.ITEM_GROUP_ID
FROM
    ITEM AS I,  ITEM_GROUP AS IG
WHERE
	 I.ITEM_GROUP_ID = IG.ID AND
	IG.`NAME` IN ('Mũ', 'Thắt lưng');
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

SELECT * FROM `ORDER`
WHERE DATE(CREATED_AT) IN ('2023-2-15', '2023-9-7');
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.ID ITEM_ID,
		itd.ID ITEM_DETAIL,
        it.NAME ITEM_NAME,
        itd.SIZE_ID,
        itd.SALES_PRICE
	FROM item_detail itd 
    JOIN item it
		ON itd.ITEM_ID = it.ID 
	ORDER BY SALES_PRICE ASC ;
    
    -- tìm kích thước có giá bán lớn nhất trong mỗi mặt hàng
    -- sắp xếp giá bán giảm dần
SELECT item.ID ID,
		item.NAME NAME,
	   MAX(SALES_PRICE) MAX_SALE_PRICE
 FROM item_detail JOIN item
 ON item_detail.ITEM_ID = item.ID
GROUP BY item.ID, item.NAME
ORDER BY MAX_SALE_PRICE DESC;
    
    
    SELECT * FROM item_detail;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * FROM item
ORDER BY BUY_PRICE DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT BUY_PRICE, SALES_PRICE FROM item JOIN item_detail
ON item.ID = item_detail.ITEM_ID
ORDER BY  SALES_PRICE ASC , BUY_PRICE DESC;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT
COUNT(*) AS 'mặt hàng trong hệ thống'
FROM item;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT
    SUM(odd.AMOUNT) AMOUNT
FROM
    ITEM AS I,  item_detail ID, `order` AS O, `order_detail` AS OD
WHERE
	 I.ID = ID.ITEM_ID AND
     O.ID = OD.ORDER_ID AND
     OD.ITEM_DETAIL_ID = ID.ID AND
     I.`NAME` LIKE '%Giày%' AND
	 DATE(CREATED_AT) = '2023-02-15';
     
SELECT * 
	FROM `order` AS O 
	JOIN `order_detail` AS OD
	ON  O.ID = OD.ORDER_ID
    JOIN item_detail AS ID
    ON OD.ITEM_DETAIL_ID = ID.ID
    JOIN item AS I
    ON I.ID = ID.ITEM_ID
WHERE i.NAME LIKE '%giay%' AND 
		DATE(CREATED_AT) = '2023-02-15';
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--    MaLoai  TenLoai SoLuong
-- 	1      --  Giày    20
-- 	2      --  Áo      28

SELECT ig.ID,
		ig.NAME,
        GROUP_CONCAT(concat(i.ID, '-', i.NAME, '-', id.SIZE_ID, '-', id.AMOUNT) SEPARATOR ',') DES,
		SUM(id.AMOUNT) total_of_items

		FROM item_detail AS id
		JOIN item AS i
		ON i.ID = id.ITEM_ID
		JOIN item_group AS ig
		ON ig.ID = i.ITEM_GROUP_ID
		GROUP BY ig.ID, ig.NAME;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT * FROM item i
		JOIN item_detail id
		ON i.ID = id.ITEM_ID
		JOIN item_group ig 
		ON ig.ID = i.ITEM_GROUP_ID
		WHERE ig.NAME LIKE '%Giày%'
ORDER BY id.SALES_PRICE DESC
LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT 	ig.ID,
		ig.NAME,
		MAX(id.SALES_PRICE) MAX_SALE_PRICE
		FROM item i
		JOIN item_detail id
		ON i.ID = id.ITEM_ID
		JOIN item_group ig 
		ON ig.ID = i.ITEM_GROUP_ID
		GROUP BY ig.ID , ig.NAME;
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 1600
SELECT 	ig.ID,
		ig.NAME,
        SUM(id.AMOUNT) 
 FROM item_detail id
		JOIN item i
        ON id.ITEM_ID = i.ID
        JOIN item_group ig
        ON i.ITEM_GROUP_ID = ig.ID
GROUP BY ig.ID, ig.NAME
HAVING SUM(id.AMOUNT) > 1600
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--    Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--    Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- SoDH ChiTietDonHang           TongTien
--    02   TenMH:GiaBan:SoLuong     100



