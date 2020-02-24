/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class SV_Poly {

    public String hoTen;
    public Double diemTB;

    
    public SV_Poly(String hoTen, Double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public String toString(){
        return hoTen + "  " + diemTB;
    }

}
