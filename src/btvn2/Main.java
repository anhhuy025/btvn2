package btvn2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        QLSach qls = new QLSach(sc);
        int them;
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu theo mã tài liệu");
            System.out.println("3. Hiển thị danh sách tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            them = Integer.parseInt(sc.nextLine());
            switch (them) {
                case 1:
                    System.out.println("Chọn loại tài liệu muốn tạo: ");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int them1 = Integer.parseInt(sc.nextLine());
                    qls.ThemTaiLieu(them1);
                    break;
                case 2:
                    if(qls.xoaTaiLieu()) System.out.println("Xóa thành công !");
                    break;
                case 3:
                    qls.hienThiDanhSach();
                    break;
                case 4:
                    qls.TimTL();
                    break;
            }
        } while (them != 0);
	}
}
