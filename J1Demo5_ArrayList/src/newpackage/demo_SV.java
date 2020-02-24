/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo_SV {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<SV_Poly> list = new ArrayList<SV_Poly>();

    public static void main(String[] args) {
        while (true) {
            menu();
        }

    }

    static void menu() {
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên");
        System.out.println("3. Xuất danh sách sinh viên theo điểm");
        System.out.println("4. Tìm sinh viên theo họ tên");
        System.out.println("5. Sửa thông tin SV");
        System.out.println("6. Xoá SV");
        System.out.println("0. Kết thúc");

        System.out.print(">> Chọn chức năng? ");
        int so = sc.nextInt();
        sc.nextLine();

        switch (so) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                xuatTheoDiem();
                break;
            case 4:
                timTheoTen();
                break;
            case 5:
                sua();
                break;
            case 6:
                xoa();
                break;
            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Vui lòng chọn số từ 1 đến 7!");
                break;
        }
    }

    static void nhap() {
        System.out.println("NHẬP DANH SÁCH SINH VIÊN");
        while (true) {
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
            if(ten == null || ten.equals("")){
                break;
            }
            System.out.println("Nhập điểm: ");
            double diem = sc.nextDouble();

            list.add(new SV_Poly(ten, diem));
            sc.nextLine();

        }
    }

    static void xuat() {

    }

    static void xuatTheoDiem() {

    }

    static void timTheoTen() {

    }

    static void sua() {

    }

    static void xoa() {

    }
}
