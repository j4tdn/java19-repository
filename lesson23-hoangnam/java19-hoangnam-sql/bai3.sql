SELECT MaPhong, COUNT(MaHD) 
FROM HOADON 
WHERE ThoiGianBatDauSD >= '2014-02-01' AND ThoiGianBatDauSD <= '2015-02-28' 
GROUP BY MaPhong 
ORDER BY COUNT(MaHD) DESC;

-- Cách làm của em là tìm số lần sử dụng nhiều nhất, chưa chắc đã có thời gian sử dụng nhiều
-- Ví dụ ngày 18.02.2024
   -- Phòng A: Dùng 2 lần 1 lần 30p
   -- Phòng B: Dùng 1 lần 6 tiếng
-- Kết quả của e sẽ ra Phòng A, chưa đúng yêu cầu 100% nhưng chấp nhận: 4đ
