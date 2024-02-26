package btvn2;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;
	public TaiLieu() {
		super();
	}
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	
	@Override
	public String toString() {
		return "TaiLieu [MaTaiLieu=" + maTaiLieu + ", TenNXB=" + tenNXB + ", SoBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	
	
	
	
	

}
