/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class lab1 {
    public static void main(String[] args) {
        
        String hoTen;
        int tuoi;
        double diemTB;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên : ");
        hoTen = sc.nextLine(); // gõ vào String
        System.out.print("Mời bạn nhập tuổi : ");
        tuoi = sc.nextInt();// gõ vào 1 int
        System.out.print("Mời bạn nhập điểm : ");
        diemTB = sc.nextDouble();// gõ vào 1 double
        System.out.println("=============");
//        
//        System.out.println("Tên bạn là : " + hoTen);
//        System.out.println("Tuổi bạn là : " + tuoi);
        System.out.printf("Điểm TB của %s %d tuổi là %.2f điểm !" ,hoTen,tuoi,diemTB );
        
    }
}
