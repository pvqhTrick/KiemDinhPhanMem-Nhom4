package bean;

import java.sql.Date;

public class Giay {
	private String MaGiay;
	private String TenGiay;
	private	int MaLoaiGiay;
	private String HangGiay;
	private	int Size;
	private	float Gia;
	private Date NgaySanXuat;
	private String MaNhanVien;
	private String TrangThai;
	
	public Giay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Giay(String maGiay, String tenGiay, int maLoaiGiay, String hangGiay, int size, float gia, 
			Date ngaySanXuat, String maNhanVien, String trangThai) {
		super();
		MaGiay = maGiay;
		TenGiay = tenGiay;
		MaLoaiGiay = maLoaiGiay;
		HangGiay = hangGiay;
		Size = size;
		Gia = gia;
		NgaySanXuat = ngaySanXuat;
		MaNhanVien = maNhanVien;
		TrangThai = trangThai;
	}
	public String getMaGiay() {
		return MaGiay;
	}
	public void setMaGiay(String maGiay) {
		MaGiay = maGiay;
	}
	public String getTenGiay() {
		return TenGiay;
	}
	public void setTenGiay(String tenGiay) {
		TenGiay = tenGiay;
	}
	public int getMaLoaiGiay() {
		return MaLoaiGiay;
	}
	public void setMaLoaiGiay(int maLoaiGiay) {
		MaLoaiGiay = maLoaiGiay;
	}
	public String getHangGiay() {
		return HangGiay;
	}
	public void setHangGiay(String hangGiay) {
		HangGiay = hangGiay;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public float getGia() {
		return Gia;
	}
	public void setGia(float gia) {
		Gia = gia;
	}
	public Date getNgaySanXuat() {
		return NgaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		NgaySanXuat = ngaySanXuat;
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	@Override
	public String toString() {
		return "Giay [MaGiay=" + MaGiay + ", TenGiay=" + TenGiay + ", MaLoaiGiay=" + MaLoaiGiay + ", HangGiay="
				+ HangGiay + ", Size=" + Size + ", Gia=" + Gia + ", NgaySanXuat=" + NgaySanXuat + ", MaNhanVien="
				+ MaNhanVien + ", TrangThai=" + TrangThai + "]";
	}
	
	
}
