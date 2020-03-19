/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        nhapXuatMang();
    }

    public static void nhapXuatMang() {

        // b1 nhập kích thước mảng
        System.out.print("Mời nhập size của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        // b2 khai báo và khởi tạo mảng
        int tuoi[] = new int[size];
        // b3 Nhập vào mảng
        System.out.println("Nhập vào từng phần tử của mảng");
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử thứ %d: ", i + 1);
            tuoi[i] = sc.nextInt();
        }
        // b4 xuất mảng
        System.out.print("\nMảng vừa nhập là: ");
        for (int i = 0; i < tuoi.length; i++) {
            System.out.print(tuoi[i] + "  ");
        }
    }

    public static void TBC() {
        /*
        9. Tính trung bình cộng các số chia 
        hết cho 3 từ 27 đến 35 // 27 30 33 -> tbc 30
         */
        int tong = 0;
        int soLuong = 0;

        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; min <= max; i++) {
            if (i % 3 == 0) {
                tong += i; // tong = tong + i
                soLuong++;
            }
        }
        double TBC = tong / soLuong;
        System.out.println(TBC);

    }
}
