SELECT A.Thang, A.MaDV, A.TongSoLuong
FROM (
    SELECT 
        MONTH(ThoiGianBatDauSD) AS Thang, 
        MaDV, 
        SUM(SoLuong) AS TongSoLuong
    FROM HOADON 
    JOIN CHITIET_SUDUNGDV ON HOADON.MaHD = CHITIET_SUDUNGDV.MaHD
    WHERE ThoiGianBatDauSD >= '2014-01-01' AND ThoiGianBatDauSD <= '2014-12-31'
    GROUP BY MONTH(ThoiGianBatDauSD), MaDV
) AS A
WHERE (SELECT COUNT(*) 
       FROM (
           SELECT 
               MONTH(ThoiGianBatDauSD) AS Thang, 
               MaDV, 
               SUM(SoLuong) AS TongSoLuong
           FROM HOADON 
           JOIN CHITIET_SUDUNGDV ON HOADON.MaHD = CHITIET_SUDUNGDV.MaHD
           WHERE ThoiGianBatDauSD >= '2014-01-01' AND ThoiGianBatDauSD <= '2014-12-31'
           GROUP BY MONTH(ThoiGianBatDauSD), MaDV
       ) AS B
       WHERE B.Thang = A.Thang AND B.TongSoLuong >= A.TongSoLuong) <= 2
ORDER BY A.Thang, A.TongSoLuong DESC;

--> 6đ
