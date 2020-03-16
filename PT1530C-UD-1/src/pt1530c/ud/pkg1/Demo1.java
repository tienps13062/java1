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
public class Demo1 {

    public static void main(String[] args) {
        
        String hoTen =  "anh Cô rô la";
        String name = "Tên cùng dòng";
        
        System.out.printf("Tên anh yêu là: %s\n" , hoTen);
        System.out.println("Tên em yêu là: "+ hoTen + name);
                
        double diemToan;
        int tuoi;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Mời nhập điểm toán: ");
        diemToan = sc.nextDouble();
        System.out.print("Mời nhập tuổi: ");
        tuoi = sc.nextInt();
        
        System.out.println("===================");
//        System.out.println("Điểm toán là: " + diemToan);
//        System.out.println("Tuổi là: " + tuoi);
        
        
    }
}
