package btvn2;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [SoPhatHanh=" + soPhatHanh + ", ThangPhatHanh=" + thangPhatHanh + "]";
	}
}
