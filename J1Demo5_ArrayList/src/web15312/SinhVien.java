/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web15312;

/**
 *
 * @author minhdq
 */
public class SinhVien {
    String ten;
    double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public String toString(){
        return ten + "  " + diem;
    }
}
