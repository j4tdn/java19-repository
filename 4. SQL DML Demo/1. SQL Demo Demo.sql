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

-- ======================= REFRESH DATA =======================
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
-- Truy vấn lồng
-- Thực thi câu lệnh con trước, được kết quả thực hiện câu lệnh cha
SELECT * FROM item_group;
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * 
	FROM item 
    WHERE ITEM_GROUP_ID IN (SELECT ID FROM item_group WHERE `NAME` = 'Thắt lưng')
    
-- Truy vấn lồng song song
-- Duyệt từng phần tử trên bảng cha 
-- Lấy ra các phần tử cha khi dòng hiện tại thõa mãn điều kiện trong bảng cha
-- Mệnh đề select trong bảng con không quan trọng, SELECT bất kì column nào
SELECT *
	FROM item
	WHERE EXISTS (
		SELECT * FROM item_group
        WHERE `NAME` = 'Thắt lưng'
        AND item_group.ID = item.ITEM_GROUP_ID
    );

--     -- Top 5 mặt hàng có giá bán cao nhất
SELECT *
	FROM item_detail
	ORDER BY SALES_PRICE DESC, AMOUNT DESC
    LIMIT 5;
    
-- Nếu trường mặt hàng giá bán cao thứ 5 có giá trùng với các mặt hàng khác, lấy hết 
WITH CTE_TOP_5_SALES_PRICE AS
(
	SELECT SALES_PRICE
	  FROM item_detail
	  ORDER BY SALES_PRICE DESC, AMOUNT DESC
	 LIMIT 5
)
SELECT * 
  FROM item_detail
  -- WHERE SALES_PRICE IN (SELECT SALES_PRICE
                          -- FROM CTE_TOP_5_SALES_PRICE)
  WHERE EXISTS (SELECT 1
				  FROM CTE_TOP_5_SALES_PRICE top5
                  WHERE item_detail.SALES_PRICE = top5.SALES_PRICE)
  ORDER BY SALES_PRICE;


-- 2. Đơn hàng
--     -- Được bán trong ngày 28/11/2019

SELECT *,
	cast(CREATED_AT as date) created_at_date
	FROM `order`
    WHERE cast(CREATED_AT as date) = str_to_date("15/02/2023",'%d/%m/%Y');

--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *,
	cast(CREATED_AT as date) created_at_date_between
	FROM `order`
    WHERE cast(CREATED_AT as date) BETWEEN str_to_date("01/08/2023",'%d/%m/%Y') AND str_to_date("30/09/2023",'%d/%m/%Y');
--     -- Được bán trong tháng 11/2019

SELECT *,
	cast(CREATED_AT as date) created_at_month
	FROM `order`
    WHERE month(CREATED_AT) = 9
		AND year(CREATED_AT) =  2023;

--     -- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT ROUND(13.5678, 2);
SELECT ROUND(13.5000, 2);
SELECT ROUND(13.0000, 3);
SELECT *,
       SALES_PRICE * 0.77 PROMOTION_PRICE,
       ROUND(SALES_PRICE * 0.77, 2) ROUNDED_PROMOTION_PRICE
  FROM item_detail;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 15/02/2023
SELECT * FROM `order` WHERE cast(CREATED_AT as DATE) = '2023-02-15'; -- order(4->5)
SELECT * FROM order_detail WHERE ORDER_ID IN (4, 5); -- item (5,11,24,39,41,46,56,69)
SELECT * FROM item_detail WHERE ID IN (5,11,24,39,41,46,56,69);
--  decimal(10, 2) --> MathContext.DECIMAL32 | 64 | 128
SELECT *,
       cast(SALES_PRICE * 0.8 AS decimal(10, 2)) ROUNDED_PROMOTION_PRICE
  FROM item_detail itd
  WHERE itd.ID IN (SELECT odd.ITEM_DETAIL_ID
                     FROM order_detail odd
					WHERE odd.ORDER_ID IN (SELECT od.ID
                                             FROM `order` od
											WHERE cast(od.CREATED_AT as DATE) = '2023-02-15')
				  );
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần

SELECT itd.ID ITEM_DETAIL_ID,
		it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
		itd.SIZE_ID,
		itd.SALES_PRICE
	FROM item_detail itd
    JOIN item it
    ON itd.ITEM_ID = it.ID
    ORDER BY SALES_PRICE ASC

-- Tìm kích thước có giá bán lớn nhất trong mỗi mặt hàng
-- 		Sắp xếp giá bán giảm dần

SELECT it.ID,
		it.NAME,
		MAX(SALES_PRICE) MAX_SALES_PRICE
    FROM item_detail itd
    JOIN item it
		ON it.ID = itd.ITEM_ID
    GROUP BY it.ID, it.NAME
    ORDER BY MAX_SALES_PRICE DESC;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần

SELECT * 
	FROM item
	ORDER BY BUY_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

  

-- 14. Đếm số lượng các mặt hàng trong hệ thống

SELECT COUNT(*) AMOUNT_OF_ITEMS
	FROM item;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

SELECT 'giày' ITEM,
		SUM(odd.AMOUNT) TOTAL_AMOUNT_OF_SALES_ITEMS
	FROM `order` od
    JOIN `order_detail` odd
		ON od.ID = odd.ORDER_ID
    JOIN `item_detail` itd
		ON itd.ID = odd.ITEM_DETAIL_ID
	JOIN `item` it
		ON itd.ITEM_ID = it.ID
	WHERE cast(od.CREATED_AT AS DATE) = '2023-02-15'
    AND it.NAME LIKE '%giày%';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

SELECT 	itg.ID,
		itg.NAME,
		group_concat(concat(it.ID,'-', it.NAME,'-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR '- ') DETAIL_INFO,
        sum(itd.AMOUNT) TOTAL_OF_ITEMS
	FROM ITEM_GROUP itg
    JOIN ITEM it
		ON itg.ID = it.ITEM_GROUP_ID
    JOIN `item_detail` itd
		ON itd.ITEM_ID = it.ID
	GROUP BY itg.ID, itg.NAME;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

SELECT * 
	FROM item it
	JOIN item_detail itd
		ON it.ID = itd.ITEM_ID
	JOIN item_group itg
		ON itg.ID = it.ITEM_GROUP_ID
	WHERE itg.NAME LIKE '%Giày%'
    ORDER BY itd.SALES_PRICE DESC
    LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

SELECT 	itg.ID ITEM_GROUP_ID,
		itg.NAME ITEM_GROUP_NAME,
        MAX(itd.SALES_PRICE) MAX_ITEMS_SALES_PRICE
	FROM item it
	JOIN item_detail itd
		ON it.ID =  itd.ITEM_ID
	JOIN item_group itg
		ON itg.ID = it.ITEM_GROUP_ID
	GROUP BY itg.ID, itg.NAME;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================

UPDATE item_detail SET AMOUNT = 555 WHERE ID = 67;
UPDATE item_detail SET AMOUNT = 888 WHERE ID = 33;
UPDATE item_detail SET AMOUNT = 720 WHERE ID = 26;

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
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100



