/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web15312;

import demoSlide.SVPoly;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class ThongTinSV {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> list = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên theo điểm");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Sửa thông tin SV theo tên");
            System.out.println("6. Xoá SV");
            System.out.println("0. Kết thúc");

            System.out.print(">> Chọn chức năng: ...  ");
            int so = sc.nextInt();
            System.out.println("======================");
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
//                    timTheoTen();
                    break;
                case 5:
//                    sua();
                    break;
                case 6:
//                    xoa();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui lòng chọn số từ 1 đến 7!");
                    break;
            }
        }
    }

    private void nhap() {

        System.out.println("NHẬP DANH SÁCH SINH VIÊN");
        while (true) {
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
//            if (ten == null || ten.equals("")) {
//                break;
//            }
            System.out.print("Nhập điểm: ");
            double diem = sc.nextDouble();

            list.add(new SinhVien(ten, diem));

            sc.nextLine();
            // tiếp hay ko ?
            System.out.print("Nhập tiếp (Y/N)? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }

        }
    }

    private void xuat() {
        System.out.println("XUẤT THÔNG TIN SINH VIÊN");
        int i = 1;
        for (SinhVien x : list) {
            System.out.printf("SV %d: ", i);
            System.out.println(x);
            i++;
        }

    }

    private void xuatTheoDiem() {
        System.out.print("Nhập điểm min: ");
        double min = sc.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = sc.nextDouble();
        
        for(SinhVien x : list){
            int i = 1;
            double diem = x.getDiem();
            if(diem >= min && diem <= max){
                System.out.printf("SV %d: ", i);
                System.out.println(x);
                i++;
            }
        }
    }

    }

