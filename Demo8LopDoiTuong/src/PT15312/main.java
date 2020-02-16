/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT15312;

/**
 *
 * @author minhdq
 */
public class main {
    public static void main(String[] args) {
        int a = 10;
        
        conMeoOOP meo1 = new conMeoOOP();
        meo1.ten = "Tam thể";
        meo1.mauSac = "Vàng";
        
//        meo1.an();
//        meo1.keu();
        
        conMeoOOP sv1 = new conMeoOOP();
        
        sv1.nhap();
        
        sv1.xuat();
        
    }
    
    public static void hamTong(){
        
    }
    
}
