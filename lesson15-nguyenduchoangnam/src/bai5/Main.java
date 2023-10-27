package bai5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SinhVien {
	private String maSV;
	private String ten;
	private double diemTrungBinh;
	private String gioiTinh;

	public SinhVien(String maSV, String ten, double diemTrungBinh, String gioiTinh) {
		this.maSV = maSV;
		this.ten = ten;
		this.diemTrungBinh = diemTrungBinh;
		this.gioiTinh = gioiTinh;
	}

	public String getMaSV() {
		return maSV;
	}

	public String getTen() {
		return ten;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}
}

public class Main {
	public static void main(String[] args) {
		List<SinhVien> danhSachSinhVien = docDanhSachSinhVienTuTep("/Users/hoangnam/Documents/java19/student.txt");

		// Sắp xếp theo điểm trung bình (tăng dần) và sau đó theo tên (giảm dần)
		Collections.sort(danhSachSinhVien, (sv1, sv2) -> {
			if (sv1.getDiemTrungBinh() != sv2.getDiemTrungBinh()) {
				return Double.compare(sv1.getDiemTrungBinh(), sv2.getDiemTrungBinh());
			} else {
				return sv2.getTen().compareTo(sv1.getTen());
			}
		});

		// In danh sách đã sắp xếp
		System.out.println("Danh sách sinh viên sau khi sắp xếp:");
		for (SinhVien sv : danhSachSinhVien) {
			System.out.println(
					sv.getMaSV() + ", " + sv.getTen() + ", " + sv.getDiemTrungBinh() + ", " + sv.getGioiTinh());
		}

		// Tìm sinh viên có điểm trung bình > 8
		System.out.println("Danh sách sinh viên có điểm trung bình > 8:");
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.getDiemTrungBinh() > 8) {
				System.out.println(
						sv.getMaSV() + ", " + sv.getTen() + ", " + sv.getDiemTrungBinh() + ", " + sv.getGioiTinh());
			}
		}

		// Tìm toàn bộ sinh viên nữ
		System.out.println("Danh sách sinh viên nữ:");
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.getGioiTinh().equalsIgnoreCase("Nu")) {
				System.out.println(
						sv.getMaSV() + ", " + sv.getTen() + ", " + sv.getDiemTrungBinh() + ", " + sv.getGioiTinh());
			}
		}
	}

	public static List<SinhVien> docDanhSachSinhVienTuTep(String fileString) {
		List<SinhVien> danhSachSinhVien = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(fileString);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] parts = line.split(", ");
				if (parts.length == 4) {
					String maSV = parts[0];
					String ten = parts[1];
					double diemTrungBinh = Double.parseDouble(parts[2]);
					String gioiTinh = parts[3];
					SinhVien sv = new SinhVien(maSV, ten, diemTrungBinh, gioiTinh);
					danhSachSinhVien.add(sv);
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return danhSachSinhVien;
	}
}
