/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Demo2 {
    static Scanner sc = new Scanner(System.in);
    static String chanDoi = "ốm rồi chán quá ncovi ơi :)) online mệt quá :))";
    
    public static void main(String[] args) {

        while (true) {
            menu();
        }
    }
    

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("1. Số lớn nhất");
        System.out.println("2. Thông tin cá nhân");
        System.out.println("3. Siêu thoát");

        System.out.print("Nhập số lô: ");
        int luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                toanTu3Ngoi();
                break;
            case 2:
                ttCaNhan();
                break;
            case 3:
                System.exit(0);// thoát
                break;
            default:
                System.out.println("Chỉ được nhập 1 -> 3 !");
                break;

        }
        
    }

    public static void toanTu3Ngoi() {
        int a = 5, b = 8, c = 9;

        int max = a > b ? a : b;

        String soLN = a > b ? "a là số LN" : "b là số LN";

        System.out.print(max + " = ");
        System.out.println(soLN);
        System.out.println(chanDoi);
    }

    public static void ttCaNhan() {

        // nhập chiều cao, cân nặng, họ tên -> in ra 
        double canNang = 0;
        String hoTen;
        System.out.print("Chiều cao:");
        double chieuCao = sc.nextDouble();
        sc.nextLine();

        try {
            // phần nhập
            System.out.print("Cân nặng:");
            canNang = Double.parseDouble(sc.nextLine()); //34 + enter

        } catch (Exception e) {
            // phần báo lỗi
            System.out.println("Cân nặng phải là số !!!");
            System.out.println(e);
            return;
        }

        System.out.print("Nhập tên: ");
        hoTen = sc.nextLine();

        System.out.println("================");
        System.out.println(chieuCao);
        System.out.println(canNang);
        System.out.println(hoTen);

    }

}
