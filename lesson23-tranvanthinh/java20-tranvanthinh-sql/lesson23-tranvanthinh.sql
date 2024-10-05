USE `karaoke`;
SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS=0; 

CREATE TABLE KHACHHANG (
    MaKH VARCHAR(50) PRIMARY KEY,
    TenKH VARCHAR(100),
    DiaChi VARCHAR(255),
    SoDT VARCHAR(15),
    MaSoThue VARCHAR(50)
);

CREATE TABLE PHONG (
    MaPhong VARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(50),
    MoTa TEXT
);

CREATE TABLE MUCTIENGIO (
    MaTienGio VARCHAR(50) PRIMARY KEY,
    DonGia DECIMAL(10, 2),
    MoTa TEXT
);

CREATE TABLE DICHVU (
    MaDV VARCHAR(50) PRIMARY KEY,
    TenDV VARCHAR(100),
    DonViTinh VARCHAR(50),
    DonGia DECIMAL(10, 2)
);

CREATE TABLE HOADON (
    MaHD VARCHAR(50) PRIMARY KEY,
    MaKH VARCHAR(50),
    MaPhong VARCHAR(50),
    MaTienGio VARCHAR(50),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(50),
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
    MaHD VARCHAR(50),
    MaDV VARCHAR(50),
    SoLuong INT,
    PRIMARY KEY (MaHD, MaDV),
    FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES 
	('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
	('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679'),
	('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123458', '12345680'),
	('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0905123459', '12345681'),
	('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', '0905123460', '12345682'),
	('KH006', 'Ho Hoai Anh', 'Hai Chau', '0905123461', '12345683'),
	('KH007', 'Pham Thi Huong', 'Son Tra', '0905123462', '12345684'),
	('KH008', 'Chau Trinh Tri', 'Hai Chau', '0905123463', '12345685'),
	('KH009', 'Phan Nhu Thao', 'Hoa Khanh', '0905123464', '12345686'),
	('KH010', 'Tran Thi To Tam', 'Son Tra', '0905123465', '12345687');
    
INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES 
	('VIP01', 5, 'Duoc su dung', 'phong vip'),
	('P02', 10, 'Duoc su dung', 'phong binh thuong'),
	('P03', 15, 'Duoc su dung', 'phong binh thuong'),
	('VIP04', 20, 'Duoc su dung', 'phong vip'),
	('P05', 25, 'Duoc su dung', 'phong binh thuong'),
	('P06', 30, 'Duoc su dung', 'phong binh thuong'),
	('VIP07', 35, 'Duoc su dung', 'phong vip'),
	('P08', 40, 'Duoc su dung', 'phong binh thuong'),
	('VIP09', 45, 'Duoc su dung', 'phong vip'),
	('P10', 50, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia)
	VALUES 
	('DV01', 'Hat Dua', 'Bao', 5000),
	('DV02', 'Trai cay', 'Dia', 30000),
	('DV03', 'Bia', 'Lon', 35000),
	('DV04', 'Nuoc Ngot', 'Chai', 10000),
	('DV05', 'Ruou', 'Chai', 200000);

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa)
VALUES 
('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
('MT03', 100000, 'Ap dung tu sau 22 gio den 6 gio sang');

INSERT INTO CHITIET_SUDUNGDV(MaHD,MaDV,SoLuong) 
VALUES  ('HD001','DV01',5),
        ('HD002','DV01',8),
        ('HD002','DV02',5),
        ('HD002','DV03',2),
        ('HD003','DV04',1),
        ('HD003','DV05',6),
        ('HD005','DV02',3),
        ('HD005','DV03',10),
        ('HD005','DV04',2);

INSERT INTO HOADON(MaHD,MaKH,MaPhong,MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD) 
VALUES
    ('HD001','KH001','VIP01','MT01',str_to_date('11/20/2015 8:15','%m/%d/%Y %h:%i'),str_to_date('11/20/2015 12:30','%m/%d/%Y %h:%i'),'Da thanh toan'),
    ('HD002','KH002','P02','MT01',str_to_date('12/12/2015 13:10','%m/%d/%Y %H:%i'),str_to_date('12/12/2015 17:20','%m/%d/%Y %H:%i'),'Chua thanh toan'),
    ('HD003','KH001','P02','MT01',str_to_date('10/15/2014 12:12','%m/%d/%Y %H:%i'),str_to_date('10/15/2014 16:30','%m/%d/%Y %H:%i'),'Da thanh toan'),
    ('HD004','KH003','VIP01','MT02',str_to_date('9/20/2015 18:30','%m/%d/%Y %H:%i'),str_to_date('9/20/2015 21:00','%m/%d/%Y %H:%i'),'Chua thanh toan'),
    ('HD005','KH001','P03','MT02',str_to_date('11/25/2014 20:00','%m/%d/%Y %H:%i'),str_to_date('11/25/2014 21:45','%m/%d/%Y %H:%i'),'Thanh toan mot phan');


-- Cau 3
SELECT P.MaPhong, SUM(TIMESTAMPDIFF(MINUTE, H.ThoiGianBatDauSD, H.ThoiGianKetThucSD)) AS TongThoiGianSuDungTheoPhut
FROM HOADON H
JOIN PHONG P ON H.MaPhong = P.MaPhong
WHERE H.ThoiGianBatDauSD >= '2014-02-01' 
  AND H.ThoiGianBatDauSD <= '2015-02-28'
GROUP BY P.MaPhong, P.SoKhachToiDa, P.TrangThai
ORDER BY TongThoiGianSuDungTheoPhut DESC;

-- Cau 4
WITH SuDungDichVuTheoThang AS (
    SELECT DV.MaDV, DV.TenDV, MONTH(H.ThoiGianBatDauSD) AS Thang, YEAR(H.ThoiGianBatDauSD) AS Nam,
           SUM(CT.SoLuong) AS TongSoLuong,
           ROW_NUMBER() OVER (PARTITION BY YEAR(H.ThoiGianBatDauSD), MONTH(H.ThoiGianBatDauSD) 
                              ORDER BY SUM(CT.SoLuong) DESC) AS XepHang
    FROM HOADON H
    JOIN CHITIET_SUDUNGDV CT ON H.MaHD = CT.MaHD
    JOIN DICHVU DV ON CT.MaDV = DV.MaDV
    WHERE H.ThoiGianBatDauSD >= '2014-01-01' 
      AND H.ThoiGianBatDauSD <= '2014-12-31'
    GROUP BY DV.MaDV, DV.TenDV, YEAR(H.ThoiGianBatDauSD), MONTH(H.ThoiGianBatDauSD)
)
SELECT MaDV, TenDV, Thang, Nam, TongSoLuong
FROM SuDungDichVuTheoThang
WHERE XepHang <= 2
ORDER BY Nam, Thang, XepHang;

-- Cau 5
SELECT * FROM PHONG WHERE MaPhong like 'VIP%';

SET FOREIGN_KEY_CHECKS=1; 