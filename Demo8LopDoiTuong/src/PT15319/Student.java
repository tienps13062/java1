/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT15319;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Student {
    // thuộc tính, trường
    String ten;
    double diem;
    
    
    // phương thức
    public void diHoc(){
        System.out.println("Tôi có đi học đâu? Online mà =)) ");
    }
    public void anChoi(){
        System.out.println("chỉ ăn với ngủ là giỏi");
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        ten = sc.nextLine();
        System.out.print("Nhập điểm:");
        diem = sc.nextDouble();
        
    }
    public void xuat(){
        
        xepLoai();
    }
    public void xepLoai(){
        
    }
}
