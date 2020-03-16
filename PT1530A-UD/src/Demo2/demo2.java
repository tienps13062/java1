/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cuuChuong();
        
        while(true){
//            menu();
        }
    }
    
    public static void cuuChuong(){
        // in ra bảng cửu chương 5
        for(int i = 1; i <= 10; i++){
            System.out.printf(" 5 * %d = %d \n" ,i, (i * 5));
        }
        
        
    }

    public static void menu() {
        System.out.println("-----------------");
        System.out.println("1. Điều kiện");
        System.out.println("2. Nhập xuât");
        System.out.println("3. Siêu thoát");
        System.out.println("-----------------");
        System.out.print("Mời nhập lựa chọn: ");
        int luaChon = sc.nextInt();
        
        switch (luaChon) {
            case 1:
                dieuKien();
                break;
            case 2:
                nhapXuat();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Nhập lại từ 1-> 3 ");
                break;
        }

    }

    public static void dieuKien() {
        // toán tử 3 ngôi
        System.out.print("Nhập a: ");
        double a = sc.nextInt();
        System.out.print("Nhập b: ");
        double b = sc.nextInt();
        System.out.print("Nhập c: ");
        double c = sc.nextInt();

        double max = (a > b) ? a : b;
        String soMax = a > b ? "a là max" : "b là max";
        double max1 = (a > b) ? (a > c) ? a : c : b;// sai bét

        System.out.println(max1);
//        System.out.println(soMax);

    }

    public static void nhapXuat() {
        int tuoi;
        double diem;
        // bắt lỗi
        try {
            System.out.print("Nhập điểm : ");// 4 + enter = 1 chuỗi
            diem = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Điểm phải là số !");
            System.out.println(e);
            return;
        }

        System.out.print("Nhập tuổi : "); //30 + enter = chuỗi -> ép KDL nthuy
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập họ tên : ");
        String hoTen = sc.nextLine();

        
        System.out.println(tuoi * 2);

    }

}
