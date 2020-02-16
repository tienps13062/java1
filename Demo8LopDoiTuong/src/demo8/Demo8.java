/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo8;

/**
 *
 * @author Minh
 */
public class Demo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HinhTron htron = new HinhTron();// khởi tạo
        htron.banKinh = 100;
        htron.inKetQua();
    }  
    public static void hamThanhVien(){
    
    }
    
}

 class HinhTron {
    public double banKinh;// trường
    
    public double getChuVi(){ // phương thức
        return 2*Math.PI*this.banKinh;
    }
    public double getDienTich(){
        return Math.PI*Math.pow(this.banKinh, 2);
    }
    public void inKetQua(){
        System.out.println("Bán kính : " + this.banKinh);
        System.out.println("Chu vi : " + this.getChuVi());
        System.out.println("Diện tích : " + this.getDienTich());
        
    }
}



