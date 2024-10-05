INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES 
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679'),
('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123458', '12345680'),
('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0905123459', '12345681');


INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
('VIP01', 5, 'Duoc su dung', 'Phong VIP'),
('P02', 10, 'Duoc su dung', 'Phong binh thuong'),
('VIP04', 20, 'Duoc su dung', 'Phong VIP'),
('P03', 15, 'Duoc su dung', 'Phong binh thuong');

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa)
VALUES
('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
('MT03', 100000, 'Ap dung tu 22 gio den 6 gio sang');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia)
VALUES
('DV01', 'Hat Dua', 'Bao', 5000),
('DV02', 'Trai Cay', 'Dia', 30000),
('DV03', 'Bia', 'Lon', 35000),
('DV04', 'Nuoc Ngot', 'Chai', 10000);

INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15', '2015-11-20 12:30', 'Da thanh toan'),
('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10', '2015-12-12 17:20', 'Chua thanh toan'),
('HD003', 'KH001', 'P02', 'MT01', '2014-10-15 12:12', '2014-10-15 16:30', 'Da thanh toan'),
('HD004', 'KH003', 'VIP01', 'MT02', '2015-09-20 18:30', '2015-09-20 21:00', 'Chua thanh toan');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
('HD001', 'DV01', 5),
('HD001', 'DV02', 8),
('HD002', 'DV02', 5),
('HD002', 'DV03', 2),
('HD003', 'DV04', 1),
('HD003', 'DV01', 6),
('HD004', 'DV02', 5),
('HD004', 'DV04', 3);
