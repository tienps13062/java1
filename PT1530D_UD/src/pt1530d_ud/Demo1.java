/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1530d_ud;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Demo1 {
    //
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        while (true) {
//            menu();
//        }
        dieuKien();
    }

    public static void dieuKien(){
        int a = 100;
        
        if(a > 100){
            System.out.println("Số lớn hơn 100");
        } else if (a == 100){// đk ngầm
            System.out.println("Số nhỏ hơn 100");
        } else{// đk ngầm
            System.out.println("aaaaa gì đấy");
        }
        
    }
    public static void toanTu3Ngoi(){
        double a = 234234324, b = 234242344, c = 232536323;
        
        double max = (a > b) ? a : b;
        String maaaax = (max > c) ? "A B lớn nhất" : "C lớn nhất";

        System.out.println(max);
        System.out.println(maaaax);
        
        
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Ép kiểu");
        System.out.println("2. Nhập xuất");
        System.out.println("3. Siêu thoát");

        System.out.print("Mời nhập số lô: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        switch (luaChon) {
            case 1:
                epKieu();
                break;
            case 2:
                nhapXuat();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Chỉ nhập từ 1-> 3 !!!");
                break;

        }

    }

    public static void epKieu() {

        String a = "3";
        String b = "8";
        String c = a + b;

        System.out.println("Tổng: " + c);

        int a1 = Integer.parseInt(a);
        double b1 = Double.parseDouble(b);

        double c1 = a1 + b1;
        System.out.println(c1);

    }

    public static void nhapXuat() {
        Scanner sc = new Scanner(System.in);

        String hoTen;
        double tuoi, diem = 0;
        // nhập thông tin

        try {
            System.out.print("Mời nhập điểm: "); // 9 + enter = chuỗi -> KDL nguyên thuỷ
            diem = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Điểm phải là số thánh ơi");
//            System.out.println(e);
            return ;
        }

        System.out.print("Mời nhập tuổi: ");
        tuoi = sc.nextDouble(); // (23 + enter) = chuỗi
        sc.nextLine();

        System.out.print("Mời nhập tên: ");
        hoTen = sc.nextLine();// giá trị

        int tuoiThat = (int) tuoi;

        // xuất thông tin
        System.out.println("---------------------");
        System.out.println(diem);
        System.out.println("Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoiThat);
    }
}
