/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1;

/**
 *
 * @author minhdq
 */
public class Teacher {
    
    // thuộc tính
    String name;
    String soTK;
    
    // phương thức 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }
    
    public void thongTin(){
        System.out.println("Thông tin đối tượng");
    
    }
    
}
