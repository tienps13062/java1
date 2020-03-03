/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoSlide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author minhdq
 */
public class ThongTinSV {
    
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<SVPoly> listSV = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên theo điểm");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Sửa thông tin SV");
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
                    System.out.println("Vui lòng chọn số từ 0 đến 6!");
                    break;
            }
        }
    }

    public void nhap() {
        System.out.println("NHẬP DANH SÁCH SINH VIÊN");
        while (true) {
            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();
            if (ten == null || ten.equals("")) {
                break;
            }
            System.out.println("Nhập điểm: ");
            double diem = sc.nextDouble();

            listSV.add(new SVPoly(ten, diem));
            sc.nextLine();
            // tiếp hay ko ?
            System.out.print("Nhập tiếp (Y/N)? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }

        }

    }

    public void xuat() {

        System.out.println("XUẤT DANH SÁCH SINH VIÊN");
        int i = 1;
        for (SVPoly sv : listSV) {
            System.out.printf("SV %d: ", i);
            System.out.println(sv);
            i++;
        }
        System.out.println("======================");
    }

    public void xuatTheoDiem() {

        System.out.println("TÌM KIẾM SINH VIÊN THEO ĐIỂM");

        System.out.print("Điểm min: ");
        double min = sc.nextDouble();

        System.out.print("Điểm max: ");
        double max = sc.nextDouble();

        for (SVPoly sv : listSV) {
            if (sv.diem >= min && sv.diem <= max) {
                System.out.println(sv);
            }
        }
        System.out.println("======================");
    }

    public void timTheoTen() {

        System.out.println("TÌM KIẾM SINH VIÊN");

        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();

        for (SVPoly sv : listSV) {
            if (sv.ten.contains(name)) {
                System.out.println(sv);
            }
        }
        System.out.println("======================");
    }

    public void sua() {

        System.out.println("SỬA THÔNG TIN SINH VIÊN");
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();

        for (SVPoly sv : listSV) {
            if (sv.ten.equalsIgnoreCase(name)) {
                System.out.print("Nhập điểm mới: ");
                sv.diem = sc.nextDouble();
                sc.nextLine();
            }
        }
        System.out.println("======================");
    }

    public void xoa() {
        
		System.out.println("XÓA SINH VIÊN");
		System.out.print("Tên sinh viên: ");
		String name = sc.nextLine();
		
		for(SVPoly sv : listSV){
			if(sv.ten.equalsIgnoreCase(name)){
				listSV.remove(sv);
				break;
			}
		}
        System.out.println("======================");
    }

//    public void sapXepTheoDiem() {
//            
//		Comparator<SVPoly> comp = new Comparator<SVPoly>() {
//			@Override
//			public int compare(SVPoly o1, SVPoly o2) {
//				return o1.ten.compareTo(o2.ten);
//			}
//		};
//		Collections.sort(listSV, comp);
//        System.out.println("======================");
//    }
//
//    public void sapXepTheoHoTen() {
//
//		Comparator<SVPoly> comp = new Comparator<SVPoly>() {
//			@Override
//			public int compare(SVPoly o1, SVPoly o2) {
//				return o1.diem.compareTo(o2.diem);
//			}
//		};
//		Collections.sort(listSV, comp);
//        System.out.println("======================");
//    }

}
