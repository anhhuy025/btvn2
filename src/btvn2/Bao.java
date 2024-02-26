package btvn2;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		ngayPhatHanh = ngayPhatHanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [NgayPhatHanh=" + ngayPhatHanh + "]";
	}

}
