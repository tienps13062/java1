/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoLab5;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class B1_DanhSachSoThuc {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<>();
    
    public void nhap(){
        System.out.println("Nhập danh sách số thực");
        
        while(true){
            System.out.print("Nhập số thực: ");
            double soThuc = Double.parseDouble(sc.nextLine());
            list.add(soThuc);
            System.out.print("Nhập thêm (Y/N)?  ");
            String tiep = sc.nextLine();
            if(tiep.equalsIgnoreCase("N")){
                break;
            }
            System.out.println("");
            
        }
    }
    
    public void xuat(){
        double tong = 0;
        System.out.println("==========");
        System.out.println("Danh Sách");
        for(Double x : list){
            System.out.print(x + "  ");
            tong += x;
        }
        System.out.printf("\nTổng danh sách: %.2f", tong);
    }
    
}
