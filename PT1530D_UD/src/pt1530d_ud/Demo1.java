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

    public static void main(String[] args) {
        
        nhapXuat();
//        epKieu();
        
        
    }
    
    public static void epKieu(){
    
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
        double tuoi, diem;
        // nhập thông tin
        
        System.out.print("Mời nhập điểm: "); // 9 + enter = chuỗi -> KDL nguyên thuỷ
        diem = Double.parseDouble(sc.nextLine());
        

        System.out.print("Mời nhập tuổi: ");
        tuoi = sc.nextDouble(); // (23 + enter) = chuỗi
        sc.nextLine();
        
        System.out.print("Mời nhập tên: ");
        hoTen = sc.nextLine();// giá trị

        int tuoiThat = (int) tuoi;

        // xuất thông tin
        System.out.println("---------------------");
        System.out.println("Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoiThat);
    }
}
