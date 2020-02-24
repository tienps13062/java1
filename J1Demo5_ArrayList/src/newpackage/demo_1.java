/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class demo_1 {

    public static void main(String[] args) {
//        Nhập vào danh sách số thực ArrayList<Double>. 
//          Tính tổng và xuất ra màn hình
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.print("Mời bạn nhập số: ");
            double so = Double.parseDouble(sc.nextLine());
            // sc.nextLine();
            list.add(so);
            System.out.print("Nhập tiếp hay thôi (Y/N)?");
            String tiep = sc.nextLine();

            if (tiep.equalsIgnoreCase("n")) {
                break;
            }

        }
        double tong = 0;
        for (Double x : list) {
            System.out.print(x + " ");
            tong += x;
        }
        System.out.println("Tổng là: " + tong);

    }
}
