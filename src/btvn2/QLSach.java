package btvn2;
import java.util.*;

public class QLSach {
	public TaiLieu[] TLs;
	private Scanner sc;
	public int soluong = 0;
	
	public QLSach(Scanner sc) {
		super();
		TLs = new TaiLieu[0];
		this.sc = sc;
	}
	
	 private TaiLieu TaoTaiLieu(int Them){
	        TaiLieu TL;
	        System.out.print("Nhập mã tài liệu : ");
	        String maTaiLieu = sc.nextLine();
	        System.out.print("Nhập tên nhà xuất bản : ");
	        String tenNXB = sc.nextLine();
	        System.out.print("Nhập số bản phát hành : ");
	        int soBanPhatHanh =Integer.parseInt(sc.nextLine());
	 
	        if (Them == 1) {
	            System.out.print("Nhập tên tác giả : ");
	            String tenTacGia = sc.nextLine();
	            System.out.print("Nhập số trang : ");
	            int soTrang = Integer.parseInt(sc.nextLine());
	            TL = new Sach(maTaiLieu,tenNXB,soBanPhatHanh,tenTacGia,soTrang);
	        } else if (Them == 2) {
	            System.out.print("Nhập số phát hành : ");
	            int soPhatHanh =Integer.parseInt(sc.nextLine());
	            System.out.print("Nhập tháng phát hành : ");
	            int thangPhatHanh = Integer.parseInt(sc.nextLine());
	            TL = new TapChi(maTaiLieu,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh);
	        } else {
	            System.out.print("Nhập ngày phát hành : ");
	            int ngayPhatHanh = Integer.parseInt(sc.nextLine());
	            TL = new Bao(maTaiLieu,tenNXB,soBanPhatHanh,ngayPhatHanh);
	        }
	        return TL;
	 }
	   
	    
	    public void hienThiDanhSach() {
			for (TaiLieu TL : TLs) {
				System.out.println(TL.toString());
			}
		}
	 
	    public void ThemTaiLieu(int Them) {
		TaiLieu[] newTLs = Arrays.copyOf(TLs, TLs.length + 1);
		newTLs[soluong] = TaoTaiLieu(Them);
		TLs = newTLs;
		soluong++;
	}
	    public void TimTL (){
	        boolean kiemTra = false;
	        System.out.println("Chọn loại tài liệu cần tìm : ");
	        System.out.println("1. Sách");
	        System.out.println("2. Tạp chí");
	        System.out.println("3. Báo");
	        System.out.println("Nhập lựa chọn: ");
	        int chon = Integer.parseInt(sc.nextLine());
	        if (chon == 1) {
	            for (TaiLieu TL : TLs){
	                if(TL instanceof Sach){
	                    if (TL != null) {
	                        System.out.println(TL.toString());
	                    }
	                }
	            }
	            if(kiemTra) System.out.println("Không có sách trong dữ liệu !");
	        } else if (chon == 2) {
	            for (TaiLieu TL : TLs){
	                if(TL instanceof TapChi){
	                    if (TL != null) {
	                        System.out.println(TL.toString());
	                    }
	                }
	            }
	            if(kiemTra) System.out.println("Không có tạp chí trong dữ liệu !");
	        } else {
	            for (TaiLieu TL : TLs){
	                if(TL instanceof Bao){
	                    if (TL != null) {
	                        System.out.println(TL.toString());
	                    }
	                }
	            }
	            if(kiemTra) System.out.println("Không có báo trong dữ liệu !");
	        }
	    }

	    public boolean xoaTaiLieu(){
	        String maTaiLieu;
	        boolean kiemTra =false;
	        int layViTri= TLs.length;
	        do{
	            System.out.print("Nhập mã tài liệu muốn xóa : ");
	            maTaiLieu = sc.nextLine();;
	            for (TaiLieu TL : TLs){
	                if (TL.getMaTaiLieu().equals(maTaiLieu)){
	                    kiemTra=true;
	                }
	            }
	            if(kiemTra){
	                TaiLieu[] newTLs = new TaiLieu[TLs.length-1];
	                for (int i =0 ; i<TLs.length-1;i++){
	                    if(TLs[i].getMaTaiLieu().equals(maTaiLieu)){
	                        layViTri = i;
	                    }
	                    if (i>=layViTri){
	                        TLs[i]=TLs[i+1];
	                    }
	                    else newTLs[i]=TLs[i];
	                }
	                TLs = newTLs;
	            }
	            else System.out.println("Mã tài liệu không tồn tại !");
	        }while (!kiemTra);
	        return true;
	    }

	
}
