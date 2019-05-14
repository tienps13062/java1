/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

/**
 *
 * @author Minh
 */
public class Demo12 {
    public static void main(String[] args) {
        
        double a = 5.5 , b = 6.5 , c = 8.6, diemTb;
        
        diemTb = (a*2 + b + c)/4;
        
        System.out.print("Điểm trung bình là :  " + diemTb);
        System.out.printf("Điểm trung bình là :  %.1f" , diemTb);
    }
}
