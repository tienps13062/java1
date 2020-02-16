/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT15312;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class conMeoOOP {
    
    // thuộc tính, trường
    String ten;
    String mauSac;
    double diem;
    
    // phương thức
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập điểm: ");
        diem = sc.nextDouble();
        
    }
    public void xuat(){
        System.out.println(ten);
        System.out.println(diem);
        xepLoai();
    }
    public void xepLoai(){
        if(diem < 5){
            System.out.println("kém kinh khủng");
        }
    }
    public void an(){
        System.out.println("ăn thịt mèo ngon ko ?");
        System.out.println(ten);
    }
    public void keu(){
        System.out.println("mèo kêu như chó");
        System.out.println(mauSac);
    }
}
