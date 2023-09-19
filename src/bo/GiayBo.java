package bo;

import java.io.Console;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Giay;
import bean.NhanVien;
import dao.GiayDao;
import dao.NhanVienDao;

public class GiayBo {
	GiayDao gdao = new GiayDao();
	ArrayList<Giay> dsg= new  ArrayList<Giay>();
		
	public ArrayList<Giay> getgiay() throws SQLException{
		dsg = gdao.getgiay();
		return dsg;
	}
	
	public int Them(String maGiay, String TenGiay, int maLoaiGiay,String hangGiay, int Size, Float Gia,
			Date NgaySanXuat,String maNhanVien,String trangThai)throws Exception {

		for(Giay g : dsg) {
			if(g.getMaNhanVien()==maGiay )
				return 0;
		}
		dsg.add(new Giay(maGiay,TenGiay,maLoaiGiay,hangGiay,Size,Gia,NgaySanXuat,maNhanVien,trangThai));
		return gdao.Them(maGiay,TenGiay,Size,Gia,maLoaiGiay,maNhanVien);
	}
	public int Sua(String maGiay, String TenGiay, int maLoaiGiay,String hangGiay, int Size, Float Gia,
			Date NgaySanXuat,String maNhanVien,String trangThai)throws Exception {
		for(Giay g: dsg) {
			String[] DinhDang= maGiay.split("_");
			try {
				if(DinhDang[0].toString()=="Giay" 
				   && Integer.parseInt(DinhDang[1]) >0 
				   &&Integer.parseInt(DinhDang[1]) >10)
					if(g.getMaGiay()==maGiay) {
						g.setTenGiay(TenGiay);
						g.setMaLoaiGiay(maLoaiGiay);
						g.setHangGiay(hangGiay);
						g.setSize(Size);
						g.setGia(Gia);
						g.setNgaySanXuat(NgaySanXuat);
						g.setMaNhanVien(maNhanVien);
						
						if(NgaySanXuat.before(2020)){
							g.setTrangThai("Sale 20%");
						}
						return gdao.Sua(maGiay,TenGiay, maLoaiGiay,hangGiay,Size, Gia,
								NgaySanXuat,maNhanVien, trangThai);
					}
					else {
						return 0;
					}
			} catch (Exception e) {
				// TODO: handle exception
			}
					
		}
		return 0;
	}
	public int Xoa(int MaGiay)throws Exception{
		for(Giay g:dsg) {
			if(g.getMaGiay()==MaGiay)
				dsg.remove(g);
				return gdao.Xoa(MaGiay);
		}
		return 0;
	}
	public ArrayList<Giay> Tim(String key) throws Exception{
   	 ArrayList<Giay> tam= new ArrayList<Giay>();
   	 
   	 for(Giay giay: dsg) {
   		 if(giay.getMaGiay()==Integer.parseInt(key))
   			 tam.add(giay);
   	 }
   	 return tam;
   }
	 	
	
	 
}
