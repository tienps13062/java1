/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1530b_ud_1;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class PT1530B_UD_1 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while(true){
            menu();
        }
    }

    public static void menu() {
        System.out.println("------------------");
        System.out.println("1. Nhập xuất");
        System.out.println("2. Ép kiểu");
        System.out.println("3. Siêu thoát");
        System.out.println("------------------");
        
        System.out.print("Mời nhập số đề: ");
        int luaChon = sc.nextInt();
        switch (luaChon) {
            case 1:
                nhapXuat();
                break;
            case 2:
                epKieu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Chỉ nhập từ 1-> 3 thôi thánh ơi!");
                break;
        }

    }

    public static void nhapXuat() {

        
        int tuoi = 0;
        double diem = 0;

        try {
            System.out.print("Mời nhập tuổi:");
            tuoi = sc.nextInt();// 4 + enter
            sc.nextLine();
//              tuoi = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Nhập lại tuổi là số nguyên!!!");
            return;
        }
        try {
            System.out.print("Mời nhập điểm: ");
            diem = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
        }
        System.out.print("Mời nhập họ và tên: ");
        String hoTen = sc.nextLine();

        System.out.println("Tên => " + hoTen + "\nTuổi => " + tuoi);

        // nhập chiều cao, cân nặng -> in ra màn hình
    }

    // ép kiểu từ kiểu chuỗi sang kiểu DL nguyên thuỷ
    public static void epKieu() {
        String a = "3";
        String b = "4";
        String c = a + b;

//        System.out.println(c);
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double c1 = a1 + b1;

//        System.out.println(c1);
        double max1 = a1 > b1 ? a1 : b1;
        double max2 = max1 > c1 ? max1 : c1;
        
        String SLN = max1 > c1 ? "Max1" : "c1";
        
        System.out.println("Số lớn nhất là: " + max2);
        System.out.println(SLN);
        
    }

}
