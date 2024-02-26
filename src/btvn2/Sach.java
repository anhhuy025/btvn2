package btvn2;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public String gettenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGIa(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	
	@Override
	public String toString() {
		return "Sach [TenTacGia=" + tenTacGia + ", SoTrang=" + soTrang + "]";
	}
	
	
	
	
	
	
	
	
	

}
