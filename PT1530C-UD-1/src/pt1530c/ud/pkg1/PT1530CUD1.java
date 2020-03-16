/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1530c.ud.pkg1;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class PT1530CUD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // nhập chiều cao, cân nặng, họ tên -> in ra 

        double canNang = 0;
        String  hoTen;
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
