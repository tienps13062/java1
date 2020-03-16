/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo3;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demoMang {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] tuoi1 = {24, 23, 54};

        int tuoiTHo[] = {60, 70, 80, 90};

        String hoTen[], name;

//        System.out.println(tuoi1.length);
//        System.out.println(tuoiTHo[1]);
        //  B1 nhập size của mảng
        System.out.print("Nhập size của mảng: ");
        int size = Integer.parseInt(sc.nextLine());

        //  B2 khai báo và khởi tạo
        int tuoi[] = new int[size];

        //  B3 nhập
        System.out.println("");
        for (int i = 0; i < tuoi.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            tuoi[i] = sc.nextInt();
        }
        // B4 xuất
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < tuoi.length; i++) {
            System.out.print(tuoi[i] + "  ");
        }
        System.out.println("");

    }
}
