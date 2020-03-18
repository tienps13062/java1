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
        bai11();
    }

    /*
    11. Nhập vào tên và tuổi của cả gia đình
    -> in ra tên tuổi của cả nhà
    -> in ra tên tuổi của ng cao tuổi nhất

     */
    public static void bai11() {
        System.out.print("Số thành viên trong GĐ: ");
        int size = Integer.parseInt(sc.nextLine());

        String ten[] = new String[size];
        int tuoi[] = new int[size];
        // nhập
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập tên TV %d: ", i + 1);
            ten[i] = sc.nextLine();
            System.out.printf("Nhập tuổi TV %d: ", i + 1);
            tuoi[i] = Integer.parseInt(sc.nextLine());
        }
        // xuất
        System.out.println("=== In tên tuổi của GĐ ===");
        for (int i = 0; i < size; i++) {
            System.out.printf("Tên TV %d: %s \n", (i + 1), ten[i]);
            System.out.printf("Tuổi TV %d: %d \n", (i + 1), tuoi[i]);
            System.out.println("");
        }
        // in thông tin ng tuổi cao nhất
        int i, j, tuoiTam = 0, k = 0;
        String tenTam = "";
        for (i = 0; i < size - 1; i++) {
            for (j = 1; j < size; j++) {
                if (tuoi[i] < tuoi[j]) {
                    tuoiTam = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tuoiTam;
                    // hoán vị 
                    tenTam = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tenTam;
                }
            }
        }
        System.out.printf("Tuổi của người lớn nhất là: %d\n", tuoi[0]);
        System.out.printf("Tên của người lớn nhất là: %s\n", ten[0]);

    }

    public static void nhapXuatMang2Chieu() {
        // size
        System.out.print("Nhập số hàng : ");
        int hang = sc.nextInt();
        System.out.print("Nhập số cột : ");
        int cot = sc.nextInt();
        // kbao va ktao
        int a[][] = new int[hang][cot];
        // nhap ptu
        System.out.println("Nhập phần tử :");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        // xuat
        System.out.println("Mảng vừa nhập là : ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }
    }

    public static void bai10() {
        /*
        10. Nhập vào mảng cân nặng của gđ
        -> in ra TBC cân nặng lớn hơn 50 kg
        -> in ra cân nặng chia hết cho 2
         */
        int size;

        System.out.print("Mời nhập số thành viên trong GĐ: "); // size của mảng
        size = Integer.parseInt(sc.nextLine());

        double canNang[] = new double[size];

        System.out.println("Mời nhập cân nặng của các thành viên");
        for (int i = 0; i < canNang.length; i++) {
            System.out.printf("Nhập cân của tv %d: ", i + 1);
            canNang[i] = sc.nextDouble();
        }
        //
        double tong = 0;
        int dem = 0;
        System.out.print("Xuất TBC cân nặng > 50: ");
        for (int i = 0; i < size; i++) {
            if (canNang[i] >= 50) {
                tong += canNang[i];
                dem++;
            }
        }
        double TBC = tong / dem;
        System.out.printf("%.2f", TBC);
        System.out.println("");
        // 
        System.out.print("Cân nặng chia hết cho 2: ");
        for (int i = 0; i < size; i++) {
            if (canNang[i] % 2 == 0) {
                System.out.print(canNang[i] + "  ");
            }
        }
    }

    public static void nhapXuatMang() {
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
