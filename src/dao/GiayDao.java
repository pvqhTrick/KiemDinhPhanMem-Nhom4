package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Giay;


public class GiayDao {
	public static ArrayList<Giay> getgiay() throws SQLException{
		ArrayList<Giay> arrayList = new ArrayList<Giay>();
		String sql="select * from Giay";
		PreparedStatement cmd= CoSo.cn.prepareStatement(sql);
		ResultSet rs= cmd.executeQuery();
			while(rs.next()) {
				String MaGiay = rs.getString(1);
				String TenGiay = rs.getString(2);
				int MaLoaiGiay = rs.getInt(0);
				String HangGiay = rs.getString(0);
				int Size = rs.getInt(3);
				Float Gia = rs.getFloat(4);
				Date NgaySanXuat = rs.getDate(0);
				String MaNhanVien = rs.getString(6);
				String TrangThai = rs.getString(0);
				Giay giay = new Giay(MaGiay,TenGiay,MaLoaiGiay,HangGiay,Size,Gia,NgaySanXuat,MaNhanVien,TrangThai);
				arrayList.add(giay);
			}
		rs.close();
		return arrayList;
	}
	public int Them(int maGiay, String TenGiay,int Size,
					Float Gia,int MaLoaiGiay,int MaNhanVien)throws Exception{
		String sql = "INSERT INTO Giay(MaGiay,TenGiay,Size,Gia,MaLoaiGiay,MaNhanVien) Values(?,?,?,?,?,?)";
		PreparedStatement cmd= CoSo.cn.prepareStatement(sql);
			cmd.setInt(1, maGiay);
			cmd.setString(2, TenGiay);
			cmd.setInt(3,Size);
			cmd.setFloat(4,Gia);
			cmd.setInt(5,MaLoaiGiay);
			cmd.setInt(6,MaNhanVien);
			int kt = cmd.executeUpdate();
			cmd.close();
			return kt;
	}
	public int Sua (String maGiay, String TenGiay, int maLoaiGiay,String hangGiay, int Size, Float Gia,
			Date NgaySanXuat,String maNhanVien,String trangThai)throws Exception{
		String sql = "Update Giay Set MaGiay=?, TenGiay=?,maLoaiGiay=?,hangGiay=?, Size=?, Gia=?,"
				+ "NgaySanXuat=?,MaNhanVien=?,TrangThai=?"
				+ "Where MaGiay=?";
		PreparedStatement cmd= CoSo.cn.prepareStatement(sql);
		cmd.setString(1, maGiay);
		cmd.setString(2, TenGiay);
		cmd.setInt(3,maLoaiGiay);
		cmd.setString(4,hangGiay);
		cmd.setInt(5,Size);
		cmd.setFloat(6,Gia);
		cmd.setDate(7, NgaySanXuat);
		cmd.setString(8,maNhanVien);
		cmd.setString(9,trangThai);
		return cmd.executeUpdate();
	}
	public int Xoa (int maGiay) throws Exception{
		String sql = "delete from Giay where MaGiay =?";
		PreparedStatement cmd= CoSo.cn.prepareStatement(sql);
		cmd.setInt(1,maGiay);
		return cmd.executeUpdate();
	}

}
