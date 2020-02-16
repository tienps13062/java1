/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author minhdq
 */
public class Student {
    
    // thuộc tính
    public String name;
    public String code;
    public int birthday;
    
    // phương thức. ko static
    // setter
    
    // getter
    // phương thức KDL phụ thuộc vào thuộc tính

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
  

    
}
