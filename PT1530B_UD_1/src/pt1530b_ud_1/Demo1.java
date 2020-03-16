/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1530b_ud_1;

import java.util.Scanner;


/**
 *
 * @author minhdq
 */
public class Demo1 {
    public static void main(String[] args) {
        
        System.out.println("Dạy online mệt quá làng ơi ...");
        System.out.println("Nhớ người SV học offline quá đi !!!");
        
        double diemToan = 9, diemHoa = 9 , diemLy = 2, diemTB;
        int a ;
        char name = 'a';
        
        String hoTen = "Tao tên là mày";
        
        diemTB = (diemHoa + diemLy + diemToan)/3;
        
        System.out.println("Điểm TB 3 môn là: " + diemTB);
        System.out.print("Điểm TB: " + diemTB + "\n");
        System.out.printf("Điểm TB: %.2f \n", diemTB);
        System.out.println(hoTen);
        
        System.out.println();
        
        
    }
}
