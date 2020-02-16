/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1;

import java.util.Calendar;



/**
 *
 * @author minhdq
 */
public class Student {
    
    // trường, thuộc tính
    String name;
    public String code;
    public int birthday;
    
    // phương thức ... (ko static)
    
    //SETTER
    //GETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
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

    
   // phương thức xuất
    public void showInfo(){
        System.out.println("Name \t\t: " + this.getName());
        System.out.println("Code \t\t: " + this.code);
        System.out.println("Birthday \t: " + this.birthday);
        System.out.println("Age \t\t: " + this.getAge());
    }
    // phương thức tính tuổi
    public int getAge(){
        
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
 
    }
}
