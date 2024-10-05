CREATE DATABASE karaoke;
USE karaoke;

CREATE TABLE KHACHHANG (
    MaKH VARCHAR(100) PRIMARY KEY,
    TenKH VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(225), 
    SoDT VARCHAR(15),  -- Changed to VARCHAR to accommodate various formats
    MaSoThue INT
);

CREATE TABLE MUCTIENGIO (
    MaTienGio VARCHAR(100) PRIMARY KEY,
    DonGia DECIMAL(10,2) NOT NULL, 
    MoTa VARCHAR(255)
);

CREATE TABLE PHONG (
    MaPhong VARCHAR(100) PRIMARY KEY,
    SoKhachToiDa INT NOT NULL,
    TrangThai VARCHAR(100) NOT NULL,
    MoTa VARCHAR(255)
);

CREATE TABLE DICHVU (
    MaDV VARCHAR(100) PRIMARY KEY,
    TenDV VARCHAR(255) NOT NULL, 
    DonViTinh VARCHAR(100),
    DonGia DECIMAL(10,2) NOT NULL
);

CREATE TABLE CHITIET_SUDUNGDV (
    MaHD VARCHAR(100),
    MaDV VARCHAR(100),
    SoLuong INT,
    PRIMARY KEY (MaHD, MaDV),
    CONSTRAINT FK_MaDV_CHITIET_SUDUNGDV FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

CREATE TABLE HOADON (
    MaHD VARCHAR(100) PRIMARY KEY,
    MaKH VARCHAR(100) NOT NULL,
    MaPhong VARCHAR(255) NOT NULL,
    MaTienGio VARCHAR(100),
    ThoiGianBatDau DATETIME NOT NULL,
    ThoiGianKetThuc DATETIME NOT NULL,
    CONSTRAINT FK_MaKH_HOADON FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    CONSTRAINT FK_MaPhong_HOADON FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
    CONSTRAINT FK_MaTienGio_HOADON FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio),
    CONSTRAINT FK_MaHD_CHITIET_SUDUNGDV FOREIGN KEY (MaHD) REFERENCES CHITIET_SUDUNGDV(MaHD)
);




-- CHEN DU LIEU
INSERT INTO KHACHHANG(MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES
('KH001', 'Tran Van Nam', 'Hai Chau', '0905025626', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905025627', '12345679'),
('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905025628', '12345680'),
('KH004', 'Nguyen Hoai Nguye', 'Hoa Cam', '0905025629', '1234581');

INSERT INTO HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDau, ThoiGianKetThuc) VALUES
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15:00', '2015-11-20 12:30:00'),
('HD002', 'KH002', 'P02', 'MT02', '2015-12-12 13:10:00', '2015-12-12 17:20:00'),
('HD003', 'KH001', 'P02', 'MT03', '2014-10-15 12:12:00', '2014-10-15 16:30:00'),
('HD004', 'KH003', 'VIP01', 'MT03', '2015-09-20 18:30:00', '2015-09-20 21:00:00');

INSERT INTO CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong) VALUES
('HD001', 'DV01', '5'),
('HD002', 'DV02', '8'),
('HD003', 'DV03', '5'),
('HD004', 'DV04', '2');

INSERT INTO MUCTIENGIO(MaTienGio, DonGia, Mota) VALUES
('MT01', '60000.00', 'Ap dung tu 6h den 7h'),
('MT02', '80000.00', 'Ap dung tu 17h den 22h'),
('MT03', '100000.00', 'Ap dung tu 22h den 6h sang');

INSERT INTO PHONG(MaPhong, SoKhachToiDa, TrangThai, Mota) VALUES
('VIP01', '5', 'Duoc su dung', 'phong vip'),
('P02', '10', 'Duoc su dung', 'phong binh thuong'),
('P03', '15', 'Duoc su dung', 'phong binh thuong'),
('VIP04', '25', 'Duoc su dung', 'phong vip');

INSERT INTO DICHVU(MaDV, TenDV, DonViTinh, DonGia) VALUES
('DV01', 'Hat Dua', 'Bao', '5000'),
('DV02', 'Trai cay', 'Dia', '30000'),
('DV03', 'Bia', 'Lon', '35000'),
('DV04', 'Ruou', 'Chai', '200000');



-- Cau 1
SELECT 
    p.MaPhong,
    p.MoTa,
    COUNT(h.MaHD) AS SoLanSuDung
FROM 
    HOADON h
JOIN 
    PHONG p ON h.MaPhong = p.MaPhong
WHERE 
    h.ThoiGianBatDau >= '2014-02-01' AND h.ThoiGianBatDau < '2015-03-01'
GROUP BY 
    p.MaPhong, p.MoTa
ORDER BY 
    SoLanSuDung DESC;
-- Cau 2
-- Cau 3
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';
  