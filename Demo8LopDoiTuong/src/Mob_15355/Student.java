/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mob_15355;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class Student {
    // thuộc tính, trường
    String ten;
    String mssv;
    int tuoi;
    
    public Student(String ten, String mssv){
        this.ten = ten;
        this.mssv = mssv;
    
    }
    // phương thức
    public void nhapThongTin(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên SV: ");
        this.ten = sc.nextLine();
    }
    public void hienThiTT(){
        System.out.println(this.ten);
    }
    
}
